package com.example.cueva_pallo_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import Modelo.Operaciones;

public class GraficarActivity extends AppCompatActivity {
    private LineGraphSeries<DataPoint> series;
    private GraphView function;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graficar);
        String recuperado=getIntent().getStringExtra("key1");
        double x,y;
        x=-200;
        Operaciones operaciones=new Operaciones();
        function=findViewById(R.id.graphViewFunction);
        function.getViewport().setScrollable(true);
        function.getViewport().setScrollableY(true);
        function.getViewport().setScalable(true);
        function.getViewport().setScalableY(false);
        function.getViewport().setXAxisBoundsManual(true);
        function.getViewport().setMinX(-200);
        function.getViewport().setMaxX(200);

        series=new LineGraphSeries<DataPoint>();
        for(int i=0;i<7000;i++){
            x+=0.15;
            if(recuperado.equals("sin")) {
                y = operaciones.operationsSin(x);
            }else if(recuperado.equals("cos")){
                y = operaciones.operationsCos(x);
            }
            else{
                break;
            }
            series.appendData(new DataPoint(x,y),true,7000);
        }
        function.addSeries(series);

    }

}