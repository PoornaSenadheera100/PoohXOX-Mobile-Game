package com.dreamsoft.poohxox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Menu extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        setContentView(R.layout.activity_menu);


        this.mediaPlayer = MediaPlayer.create(this, R.raw.menusong);
        this.mediaPlayer.setLooping(true); // Set looping
        this.mediaPlayer.setVolume(100, 100);
        this.mediaPlayer.start();
    }

    public void onClickPlayBtn(View view){
        this.mediaPlayer.stop();
        Intent intent = new Intent(this, GameUI.class);
        startActivity(intent);
        finish();
    }

    public void onClickExitBtn(View view){
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

    public void onClickInfoBtn(View view){
        this.mediaPlayer.stop();
        Intent intent = new Intent(this, InfoPage.class);
        startActivity(intent);
        finish();
    }

    public void onBackPressed(){
        super.onBackPressed();
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

}