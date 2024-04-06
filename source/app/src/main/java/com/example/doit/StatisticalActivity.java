package com.example.doit;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;


public class StatisticalActivity extends AppCompatActivity {

    private PieChart pieChart;
    private float i1 = (float) 0.7;
    private float i2 = (float) 0.3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistical);
        pieChart = findViewById(R.id.pie_chart);
        addPieChart();

    }

    private void addPieChart() {
        pieChart.addPieSlice(new PieModel("Đã hoàn thành", i1, Color.parseColor("#62CDFF")));
        pieChart.addPieSlice(new PieModel("Đã hoàn thành", i2, Color.parseColor("#E21818")));



        pieChart.startAnimation();
    }
}