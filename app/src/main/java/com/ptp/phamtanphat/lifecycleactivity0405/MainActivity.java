package com.ptp.phamtanphat.lifecycleactivity0405;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","OnCreate");
    }
    @Override
    protected void onStart() {
        Log.d("BBB","OnStart");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("BBB","OnResume");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("BBB","onPause");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("BBB","onStop");
        super.onStop();
    }
    @Override
    protected void onRestart() {
        Log.d("BBB","OnRestart");
        super.onRestart();
    }
    @Override
    protected void onDestroy() {
        Log.d("BBB","onDestroy");
        super.onDestroy();
    }
}
