package com.example.moavaz.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("mada", "onCreate: i am in oncreate method");
    }



    @Override
    protected void onStop() {
        super.onStop();
        Log.d("mada", "onStop: i am in onstop method ");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("mada", "onDestroy: i am in ondestroy method");
    }
}
