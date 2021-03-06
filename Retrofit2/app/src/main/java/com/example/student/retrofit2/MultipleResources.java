package com.example.student.retrofit2;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MultipleResources {
    @SerializedName("page")
    public Integer page;
    @SerializedName("per_page")
    public Integer per_page;
    @SerializedName("total")
    public Integer total;
    @SerializedName("total_pages")
    public Integer total_pages;
    @SerializedName("data")
    public List<Datum> data = null;

    public class Datum
    {
        @SerializedName("id")
        public Integer id;
        @SerializedName("name")
        public String name;
        @SerializedName("year")
        public Integer year;
        @SerializedName("pantone_value")
        public String pantoneValue;
    }

}
