package com.ammar.bmiandweight;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {

    EditText w,h;
    TextView result;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        w=(EditText)findViewById(R.id.editText);
        h=(EditText)findViewById(R.id.editText2);
        btn=(Button)findViewById(R.id.button);
        result=(TextView)findViewById(R.id.textView);
    }

    public void calculate(View v){

        if(w.getText().toString().equals("")){
            result.setText("Please Enter Your Weight!");
            result.setTextColor(Color.RED);
        }else if(h.getText().toString().equals("")){
            result.setText("Please Enter Your Height!");
            result.setTextColor(Color.RED);
        }
        else{
            double r=Integer.valueOf(w.getText().toString())/(Math.sqrt((int)Integer.valueOf(h.getText().toString())));
            if(r<=5){
                result.setText(r + "");
                result.setTextColor(Color.GREEN);
            }else {
                result.setText(r + "");
                result.setTextColor(Color.RED);
            }
        }

    }
}
