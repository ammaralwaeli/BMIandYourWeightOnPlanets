package com.ammar.bmiandweight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void BMI(View v){
        Intent in=new Intent(MainActivity.this,BMI.class);
        startActivity(in);
    }
    public void Weight(View v){
        Intent in=new Intent(MainActivity.this,Weight.class);
        startActivity(in);
    }
}
