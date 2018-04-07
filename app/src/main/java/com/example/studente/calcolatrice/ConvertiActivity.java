package com.example.studente.calcolatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConvertiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converti);

       TextView numMetri = (TextView)findViewById(R.id.numMetri);
       String dato = getIntent().getExtras().getString("val");
       numMetri.setText(dato+" m");

       double num= Double.parseDouble(dato.toString());
       TextView numCentimetri = (TextView)findViewById(R.id.numCentimetri);
       num=num*100;
       numCentimetri.setText(""+num+" cm");


    }
}
