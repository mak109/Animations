package com.example.mayukh.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtHelloWorld,txtHiWorld,txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);
        txtHelloWorld.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Log.i("TAG","Hey Hello Guys");
                txtHelloWorld.animate().alpha(0.0f).setDuration(2000);
                txtHiWorld.animate().alpha(1.0f).setDuration(2000);
                txt = txtHelloWorld;
                txtHelloWorld = txtHiWorld;
                txtHiWorld = txt;
            }

        });


    }
}
