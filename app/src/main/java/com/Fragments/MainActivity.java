package com.Fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.Fragments.Fragments.SampleFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFragment();
    }
    private void addFragment(){
        FragmentManager loc_fragmentManager=getSupportFragmentManager();
        FragmentTransaction loc_fragmentTransaction=loc_fragmentManager.beginTransaction();
        SampleFragment sampleFragment=new SampleFragment();
        loc_fragmentTransaction.add(R.id.fragment_Container,sampleFragment);
        loc_fragmentTransaction.commit();
    }
}
