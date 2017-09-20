package com.g_crime.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.g_crime.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;
import java.util.List;

public class Analysis extends AppCompatActivity implements View.OnClickListener {
    BarChart bcCat1, bcCat2, bcCat3;
    Button btnBack;

    private BarData bdCat1, bdCat2, bdCat3;
    private IAxisValueFormatter xValFormCat1, xValFormCat2, xValFormCat3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);

        initData();
        initViews();
        initListener();
    }

    // initialization ------------------------------------------------------------------------------
    private void initViews() {
        Legend lCat1, lCat2, lCat3; // customize legends
        XAxis xAxisCat1, xAxisCat2, xAxisCat3; // for labels in the x-axis

        btnBack = (Button) findViewById(R.id.btnBack);

        // barchart declaration
        bcCat1 = (BarChart) findViewById(R.id.bcCat1);
        bcCat2 = (BarChart) findViewById(R.id.bcCat2);
        bcCat3 = (BarChart) findViewById(R.id.bcCat3);

        lCat1 = bcCat1.getLegend();
        lCat2 = bcCat2.getLegend();
        lCat3 = bcCat3.getLegend();

        xAxisCat1 = bcCat1.getXAxis();
        xAxisCat2 = bcCat2.getXAxis();
        xAxisCat3 = bcCat3.getXAxis();

        // barchart initialization
        bcCat1.setData(bdCat1); // setup data for each chart
        bcCat2.setData(bdCat2);
        bcCat3.setData(bdCat3);

        lCat1.setEnabled(false); // disable legend
        lCat2.setEnabled(false);
        lCat3.setEnabled(false);

        xAxisCat1.setGranularity(1f); // set interval between x-axis
        xAxisCat2.setGranularity(1f);
        xAxisCat3.setGranularity(1f);

        xAxisCat1.setValueFormatter(xValFormCat1); // initialize value formatter for x-axis
        xAxisCat2.setValueFormatter(xValFormCat2);
        xAxisCat3.setValueFormatter(xValFormCat3);

        bcCat1.invalidate();
        bcCat2.invalidate();
        bcCat3.invalidate();
    }
    private void initListener() {
        btnBack.setOnClickListener(this);
    }
    private void initData() {
        int[] dataCat1, dataCat2, dataCat3;
        final String[] lblCat1, lblCat2, lblCat3;
        List<BarEntry> entryCat1, entryCat2, entryCat3;
        List<IBarDataSet> dataSetCat1, dataSetCat2, dataSetCat3;

        // initialize data from the categories
        dataCat1 = getIntent().getIntArrayExtra("dataCat1");
        dataCat2 = getIntent().getIntArrayExtra("dataCat2");
        dataCat3 = getIntent().getIntArrayExtra("dataCat3");

        // get labels
        lblCat1 = getResources().getStringArray(R.array.lbl_cat1);
        lblCat2 = getResources().getStringArray(R.array.lbl_cat2);
        lblCat3 = getResources().getStringArray(R.array.lbl_cat3);

        // initialize entries
        entryCat1 = new ArrayList<>();
        entryCat2 = new ArrayList<>();
        entryCat3 = new ArrayList<>();

        for(int x=0 ; x<dataCat1.length ; x++) // input data into entries
            entryCat1.add(new BarEntry(x, dataCat1[x]));
        for(int x=0 ; x<dataCat2.length ; x++)
            entryCat2.add(new BarEntry(x, dataCat2[x]));
        for(int x=0 ; x<dataCat3.length ; x++)
            entryCat3.add(new BarEntry(x, dataCat3[x]));

        // initialize datasets
        dataSetCat1 = new ArrayList<>();
        dataSetCat2 = new ArrayList<>();
        dataSetCat3 = new ArrayList<>();

        dataSetCat1.add(new BarDataSet(entryCat1, null)); // input entries into datasets
        dataSetCat2.add(new BarDataSet(entryCat2, null));
        dataSetCat3.add(new BarDataSet(entryCat3, null));

        // initialize bar data
        bdCat1 = new BarData(dataSetCat1); // input datasets into chartdata
        bdCat2 = new BarData(dataSetCat2);
        bdCat3 = new BarData(dataSetCat3);

        bdCat1.setDrawValues(true); // display number for each bar
        bdCat2.setDrawValues(true);
        bdCat3.setDrawValues(true);

        // initialize formatter
        xValFormCat1 = new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return lblCat1[(int) value];
            }
        };
        xValFormCat2 = new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return lblCat2[(int) value];
            }
        };
        xValFormCat3 = new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return lblCat3[(int) value];
            }
        };
    }
    // ---------------------------------------------------------------------------------------------

    // listener ------------------------------------------------------------------------------------
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btnBack:
                finish();
                break;
        }
    }
    // ---------------------------------------------------------------------------------------------
}
