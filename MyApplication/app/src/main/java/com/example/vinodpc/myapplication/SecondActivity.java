package com.example.vinodpc.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by vinodpc on 1/2/2016.
 */
public class SecondActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

       Intent mIntent= getIntent();

        TextView nametext = (TextView)findViewById(R.id.name_text);

        String nameFromFirst = mIntent.getStringExtra("Name");

        System.out.println("Value from the first activity " + nameFromFirst);

        nametext.setText(nameFromFirst);


      

    }
}
