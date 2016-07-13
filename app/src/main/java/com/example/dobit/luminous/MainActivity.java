package com.example.dobit.luminous;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    ImageView imageView;
    ToggleButton changeState;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.Bulb);
        changeState = (ToggleButton) findViewById(R.id.Switcher);

        changeState.setOnCheckedChangeListener(this);


    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean off) {
        if(off)
        {
            imageView.setImageResource(R.drawable.lightbulbon);
        }
        else
        {
            imageView.setImageResource(R.drawable.lightbulboff);
        }
    }
}
