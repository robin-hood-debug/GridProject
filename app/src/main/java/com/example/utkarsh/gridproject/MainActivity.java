package com.example.utkarsh.gridproject;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void buttonTapped(View view){

        int id=view.getId();
        String ourId=view.getResources().getResourceEntryName(id);
        //Log.i("id",Integer.toString(id));
        int resId=getResources().getIdentifier(ourId,"raw",getPackageName());
        //Log.i("resId",Integer.toString(resId));
        MediaPlayer mPlayer=MediaPlayer.create(this,resId);
        mPlayer.start();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
