package com.mobileapps.jera.activityanimations;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "MainActivityTAG_";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.btn1);
        b.setOnClickListener(this);
        Button b2 = (Button) findViewById(R.id.btn2);
        b2.setOnClickListener(this);
        Button b3 = (Button) findViewById(R.id.btn3);
        b3.setOnClickListener(this);
        //b.setOnClickListener(new View.OnClickListener() {
    }

    public void onClick(View v) {
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        switch (v.getId()){
            case R.id.btn1:

                startActivity(i);
                overridePendingTransition(R.animator.animation1,R.animator.animation2);
                break;

            case R.id.btn2:

                startActivity(i);
                overridePendingTransition(R.animator.animation3,R.animator.animation4);
                break;
            case R.id.btn3:
                startActivity(i);
                overridePendingTransition(R.animator.animation5,R.animator.animation6);
                break;

            default:
                break;

        }
    }



    public void doMagic(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        NewFragment newFragment = new NewFragment();

        fragmentTransaction.add(R.id.a_main_frame_1, newFragment);

        fragmentTransaction.commit();
    }


}
