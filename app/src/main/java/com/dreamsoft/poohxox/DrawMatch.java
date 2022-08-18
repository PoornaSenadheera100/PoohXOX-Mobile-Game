package com.dreamsoft.poohxox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.VideoView;

public class DrawMatch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        setContentView(R.layout.activity_draw_match);

        ImageView btn_homeDraw = findViewById(R.id.btn_homeDraw);
        btn_homeDraw.setVisibility(View.INVISIBLE);

        VideoView videoView = findViewById(R.id.videoView4);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.draw);
        videoView.start();
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                btn_homeDraw.setVisibility(View.VISIBLE);
            }
        });
    }

    public void onClickHomeBtn(View view){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
        finish();
    }

    public void onBackPressed(){
        super.onBackPressed();
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
        finish();
    }
}