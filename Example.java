package com.example.venky.zappos.model;

/**
 * Created by venky on 2/8/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {


        @SerializedName("originalTerm")
        @Expose
        private Object originalTerm;
        @SerializedName("currentResultCount")
        @Expose
        private String currentResultCount;
        @SerializedName("totalResultCount")
        @Expose
        private String totalResultCount;
        @SerializedName("term")
        @Expose
        private String term;
        @SerializedName("results")
        @Expose
        private List<Result> results = null;
        @SerializedName("statusCode")
        @Expose
        private String statusCode;

        public Object getOriginalTerm() {
            return originalTerm;
        }

        public void setOriginalTerm(Object originalTerm) {
            this.originalTerm = originalTerm;
        }

        public String getCurrentResultCount() {
            return currentResultCount;
        }

        public void setCurrentResultCount(String currentResultCount) {
            this.currentResultCount = currentResultCount;
        }

        public String getTotalResultCount() {
            return totalResultCount;
        }

        public void setTotalResultCount(String totalResultCount) {
            this.totalResultCount = totalResultCount;
        }

        public String getTerm() {
            return term;
        }

        public void setTerm(String term) {
            this.term = term;
        }
        public List<Result> getResults() {
            return results;
        }

        public void setResults(List<Result> results) {
            this.results = results;
        }

  /*      public String getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(String statusCode) {
            this.statusCode = statusCode;
        }
*/
    public class Result {

      /*
        @SerializedName("brandName")
        @Expose
        private String brandName;
        @SerializedName("thumbnailImageUrl")
        @Expose
        private String thumbnailImageUrl;
        @SerializedName("productId")
        @Expose
        private String productId;
        @SerializedName("originalPrice")
        @Expose
        private String originalPrice;
        @SerializedName("styleId")
        @Expose
        private String styleId;
        @SerializedName("colorId")
        @Expose
        private String colorId;
        @SerializedName("price")
        @Expose
        private String price;
        @SerializedName("percentOff")
        @Expose
        private String percentOff;
        @SerializedName("productUrl")
        @Expose
        private String productUrl;
      */  @SerializedName("productName")
        @Expose
        private String productName;
/*

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public String getThumbnailImageUrl() {
            return thumbnailImageUrl;
        }

        public void setThumbnailImageUrl(String thumbnailImageUrl) {
            this.thumbnailImageUrl = thumbnailImageUrl;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getOriginalPrice() {
            return originalPrice;
        }

        public void setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
        }

        public String getStyleId() {
            return styleId;
        }

        public void setStyleId(String styleId) {
            this.styleId = styleId;
        }

        public String getColorId() {
            return colorId;
        }

        public void setColorId(String colorId) {
            this.colorId = colorId;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getPercentOff() {
            return percentOff;
        }

        public void setPercentOff(String percentOff) {
            this.percentOff = percentOff;
        }

        public String getProductUrl() {
            return productUrl;
        }

        public void setProductUrl(String productUrl) {
            this.productUrl = productUrl;
        }
*/

        public String getProductName() {

            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }



    }



}
