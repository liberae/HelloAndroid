package com.example.android.project1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    if (savedInstanceState == null) {
        FragmentTwo f2= new FragmentTwo();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.add(R.id.your_placeholder, f2);
        fragmentTransaction.commit();
    }}

    public void selectFrag(View view) {

        Fragment fr;
        if(view == findViewById(R.id.button2)) {

            fr = new FragmentTwo();

        }else {
            fr = new FragmentOne();
            if(view == findViewById(R.id.button3)) {
                fr = new FragmentThree();

            }
        }


        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.your_placeholder, fr);
        fragmentTransaction.commit();

}}

