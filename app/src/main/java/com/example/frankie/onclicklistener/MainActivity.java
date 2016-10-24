package com.example.frankie.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    Button button2;
    Button reset;
    TextView display;
    Boolean isButtonClicked;
    Boolean isButton2Clicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {  // OnCreate is part of the lifecycle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button); // looking for object in xml and casting is as type button
        button2 = (Button) findViewById(R.id.button2);
        reset = (Button) findViewById(R.id.reset);
        display = (TextView) findViewById(R.id.display);

        isButtonClicked = false;
        isButton2Clicked = false;

        button.setOnClickListener(this);// "This" means that this "MainActivity" will be responding.   And it will be responding with Onclick(View v).
        button2.setOnClickListener(this);
        reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()== R.id.button && isButtonClicked == false){
            Log.d("TEST1","Clicked the first button");
            display.setText("You clicked the 1st button");
            isButtonClicked = true;
        }else if(v.getId()== R.id.button2 && isButton2Clicked == false){
            Log.d("TEST1","Clicked the second button");
            display.setText("You clicked the 2nd button");
            isButton2Clicked = true;
        }else if(v.getId()== R.id.button && isButtonClicked==true){
            display.setText("You clicked the 1st button again!");

        }else if(v.getId()== R.id.button2 && isButton2Clicked==true){
            display.setText("You clicked the 2nd button again!");
        }
        if(v.getId()==R.id.reset){
            display.setText("");
            isButtonClicked = false;
            isButton2Clicked = false;
        }
    }
}
