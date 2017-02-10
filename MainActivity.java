package com.example.venky.zappos;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.venky.zappos.model.Example;
import com.example.venky.zappos.service.APIService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;


public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    Button my_button;
    TextView my_edit;
    private ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my_button = (Button) findViewById(R.id.my_button);
        my_edit = (TextView) findViewById(R.id.my_edit);
        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Please wait....");
        pDialog.setCancelable(false);

        my_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPeopleDetails();
            }
        });


        ListView lv = (ListView) findViewById(R.id.listViewProducts);
        ArrayList<String> arrayProducts = new ArrayList<>();
        arrayProducts.addAll(Arrays.asList(getResources().getStringArray(R.array.array_products)));
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arrayProducts);
        lv.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search,menu);
        MenuItem item = menu.findItem(R.id.menuSearch);
        SearchView searchView = (SearchView)item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);

                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    private void getPeopleDetails() {
        showpDialog();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.zappos.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIService service = retrofit.create(APIService.class);
        Call<Example> call = service.listRepos();

        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Response<Example> response, Retrofit retrofit) {


                Example example = response.body();
                Example result = response.body();

                String details[] = new String[30];
                //String name = (String) example.getOriginalTerm();
                List<Example.Result> name1 = result.getResults();
                for (int i = 0; i < name1.size(); i++) {
                    String name = name1.get(i).getProductName();
                    details[i] += "\n\nname:" + name;
                }
                for(int j=0; j<name1.size(); j++){
                    my_edit.setText(details[j]);

                }
                hidepDialog();
            }

            private void hidepDialog() {

            }


            @Override
            public void onFailure(Throwable t) {
                {
                    hidepDialog();
                }
            }


        });
    }



    private void showpDialog() {

    }

}

