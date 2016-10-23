package com.example.frankie.onclicklistener;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {  // OnCreate is part of the lifecycle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button); // looking for object in xml and casting is as type button
        button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(this);// "This" means that this "MainActivity" will be responding.   And it will be responding with Onclick(View v).
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()== R.id.button){
            Log.d("TEST1","Clicked the first button");
        }else if(v.getId()== R.id.button2){
            Log.d("TEST1","Clicked the second button");
        }


    }
}
