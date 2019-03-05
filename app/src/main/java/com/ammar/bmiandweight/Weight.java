package com.ammar.bmiandweight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Weight extends AppCompatActivity {

    private ListView lv;
    private CustomeAdapter customeAdapter;
    private ArrayList<ImageModel> imageModelArrayList;
    Button btn;
    private int[] myImageList = new int[]{R.drawable.earth, R.drawable.jupiter, R.drawable.mars, R.drawable.mercury, R.drawable.neptune, R.drawable.saturn, R.drawable.uranus, R.drawable.venus};
    private String[] myImageNameList = new String[]{"Earth", "Jupiter", "Mars", "Mercury", "Neptune", "Saturn", "Uranus", "Venus"};
    private double[] mass={1.0,318,0.107,0.0553,17.1,95.2,14.5,0.815};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        lv = (ListView) findViewById(R.id.myList);

        btn=(Button)findViewById(R.id.button4);

    }

    public void calculate(View v){
        EditText e=(EditText)findViewById(R.id.editText3);
        double res;
        if(e.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"Please enter your weight!",Toast.LENGTH_LONG).show();
        }else{

            for(int i=0;i<mass.length;i++){
                res=Integer.valueOf(e.getText().toString())*mass[i];
                myImageNameList[i]+=" = "+res;
            }
            imageModelArrayList = populateList();
            Log.d("hjhjh", imageModelArrayList.size() + "");
            customeAdapter = new CustomeAdapter(this, imageModelArrayList);
            lv.setAdapter(customeAdapter);
        }

    }

    private ArrayList<ImageModel> populateList() {

        ArrayList<ImageModel> list = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            ImageModel imageModel = new ImageModel();
            imageModel.setName(myImageNameList[i]);
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);
        }

        return list;

    }
}
