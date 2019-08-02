package com.example.dishes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public DishNames dn =new DishNames();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void display (View view)
    {
        TextView dish = (TextView)findViewById(R.id.results);
        Spinner spin = (Spinner)findViewById(R.id.list);
        String type = String.valueOf(spin.getSelectedItem());
        List<String> fl = dn.names(type);
        StringBuilder foodFormatter = new StringBuilder();
        for(String f : fl)
        {
            foodFormatter.append(f).append('\n');
        }
        dish.setText(foodFormatter);


    }
}
