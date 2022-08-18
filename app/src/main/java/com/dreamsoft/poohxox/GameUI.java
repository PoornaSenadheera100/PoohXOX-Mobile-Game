package com.dreamsoft.poohxox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class GameUI extends AppCompatActivity {

    private ImageView activePlayerX, inactivePlayerX, activePlayerO, inactivePlayerO;
    private ImageView box1_x, box2_x, box3_x, box4_x, box5_x, box6_x, box7_x, box8_x, box9_x;
    private ImageView box1_o, box2_o, box3_o, box4_o, box5_o, box6_o, box7_o, box8_o, box9_o;
    private ImageView line123, line456, line789, line147, line258, line369, line159, line357;
    private ImageView touchbox1, touchbox2, touchbox3, touchbox4, touchbox5, touchbox6, touchbox7, touchbox8, touchbox9;

    private MediaPlayer mediaPlayer;

    private int switchPlayer;

    private String touchbox1Value, touchbox2Value, touchbox3Value, touchbox4Value, touchbox5Value, touchbox6Value, touchbox7Value, touchbox8Value, touchbox9Value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        setContentView(R.layout.activity_game_ui);

        this.mediaPlayer = MediaPlayer.create(this, R.raw.themesong);
        this.mediaPlayer.setLooping(true); // Set looping
        this.mediaPlayer.setVolume(100, 100);
        this.mediaPlayer.start();

        this.activePlayerX = findViewById(R.id.acvtivePlayerX);
        this.inactivePlayerX = findViewById(R.id.inactivePlayerX);
        this.activePlayerO = findViewById(R.id.activePlayerO);
        this.inactivePlayerO = findViewById(R.id.inactivePlayerO);

        this.box1_x = findViewById(R.id.box1_x);
        this.box2_x = findViewById(R.id.box2_x);
        this.box3_x = findViewById(R.id.box3_x);
        this.box4_x = findViewById(R.id.box4_x);
        this.box5_x = findViewById(R.id.box5_x);
        this.box6_x = findViewById(R.id.box6_x);
        this.box7_x = findViewById(R.id.box7_x);
        this.box8_x = findViewById(R.id.box8_x);
        this.box9_x = findViewById(R.id.box9_x);

        this.box1_o = findViewById(R.id.box1_o);
        this.box2_o = findViewById(R.id.box2_o);
        this.box3_o = findViewById(R.id.box3_o);
        this.box4_o = findViewById(R.id.box4_o);
        this.box5_o = findViewById(R.id.box5_o);
        this.box6_o = findViewById(R.id.box6_o);
        this.box7_o = findViewById(R.id.box7_o);
        this.box8_o = findViewById(R.id.box8_o);
        this.box9_o = findViewById(R.id.box9_o);

        this.line123 = findViewById(R.id.line123);
        this.line456 = findViewById(R.id.line456);
        this.line789 = findViewById(R.id.line789);
        this.line147 = findViewById(R.id.line147);
        this.line258 = findViewById(R.id.line258);
        this.line369 = findViewById(R.id.line369);
        this.line159 = findViewById(R.id.line159);
        this.line357 = findViewById(R.id.line357);

        this.touchbox1 = findViewById(R.id.touchbox1);
        this.touchbox2 = findViewById(R.id.touchbox2);
        this.touchbox3 = findViewById(R.id.touchbox3);
        this.touchbox4 = findViewById(R.id.touchbox4);
        this.touchbox5 = findViewById(R.id.touchbox5);
        this.touchbox6 = findViewById(R.id.touchbox6);
        this.touchbox7 = findViewById(R.id.touchbox7);
        this.touchbox8 = findViewById(R.id.touchbox8);
        this.touchbox9 = findViewById(R.id.touchbox9);

        this.switchPlayer = 1;

        this.touchbox1Value = "";
        this.touchbox2Value = "";
        this.touchbox3Value = "";
        this.touchbox4Value = "";
        this.touchbox5Value = "";
        this.touchbox6Value = "";
        this.touchbox7Value = "";
        this.touchbox8Value = "";
        this.touchbox9Value = "";

    }

    public void onClickTouchbox1(View view){
        if(this.touchbox1Value.isEmpty()){
            if(this.switchPlayer % 2 == 1){
                this.touchbox1Value = "x";
                this.box1_x.setVisibility(View.VISIBLE);
                this.switchPlayerTo("o");
            }
            else{
                this.touchbox1Value = "o";
                this.box1_o.setVisibility(View.VISIBLE);
                this.switchPlayerTo("x");
            }
            this.switchPlayer++;
            this.checkStatus();
        }
    }

    public void onClickTouchbox2(View view){
        if(this.touchbox2Value.isEmpty()){
            if(this.switchPlayer % 2 == 1){
                this.touchbox2Value = "x";
                this.box2_x.setVisibility(View.VISIBLE);
                this.switchPlayerTo("o");
            }
            else{
                this.touchbox2Value = "o";
                this.box2_o.setVisibility(View.VISIBLE);
                this.switchPlayerTo("x");
            }
            this.switchPlayer++;
            this.checkStatus();
        }
    }

    public void onClickTouchbox3(View view){
        if(this.touchbox3Value.isEmpty()){
            if(this.switchPlayer % 2 == 1){
                this.touchbox3Value = "x";
                this.box3_x.setVisibility(View.VISIBLE);
                this.switchPlayerTo("o");
            }
            else{
                this.touchbox3Value = "o";
                this.box3_o.setVisibility(View.VISIBLE);
                this.switchPlayerTo("x");
            }
            this.switchPlayer++;
            this.checkStatus();
        }
    }

    public void onClickTouchbox4(View view){
        if(this.touchbox4Value.isEmpty()){
            if(this.switchPlayer % 2 == 1){
                this.touchbox4Value = "x";
                this.box4_x.setVisibility(View.VISIBLE);
                this.switchPlayerTo("o");
            }
            else{
                this.touchbox4Value = "o";
                this.box4_o.setVisibility(View.VISIBLE);
                this.switchPlayerTo("x");
            }
            this.switchPlayer++;
            this.checkStatus();
        }
    }

    public void onClickTouchbox5(View view){
        if(this.touchbox5Value.isEmpty()){
            if(this.switchPlayer % 2 == 1){
                this.touchbox5Value = "x";
                this.box5_x.setVisibility(View.VISIBLE);
                this.switchPlayerTo("o");
            }
            else{
                this.touchbox5Value = "o";
                this.box5_o.setVisibility(View.VISIBLE);
                this.switchPlayerTo("x");
            }
            this.switchPlayer++;
            this.checkStatus();
        }
    }

    public void onClickTouchbox6(View view){
        if(this.touchbox6Value.isEmpty()){
            if(this.switchPlayer % 2 == 1){
                this.touchbox6Value = "x";
                this.box6_x.setVisibility(View.VISIBLE);
                this.switchPlayerTo("o");
            }
            else{
                this.touchbox6Value = "o";
                this.box6_o.setVisibility(View.VISIBLE);
                this.switchPlayerTo("x");
            }
            this.switchPlayer++;
            this.checkStatus();
        }
    }

    public void onClickTouchbox7(View view){
        if(this.touchbox7Value.isEmpty()){
            if(this.switchPlayer % 2 == 1){
                this.touchbox7Value = "x";
                this.box7_x.setVisibility(View.VISIBLE);
                this.switchPlayerTo("o");
            }
            else{
                this.touchbox7Value = "o";
                this.box7_o.setVisibility(View.VISIBLE);
                this.switchPlayerTo("x");
            }
            this.switchPlayer++;
            this.checkStatus();
        }
    }

    public void onClickTouchbox8(View view){
        if(this.touchbox8Value.isEmpty()){
            if(this.switchPlayer % 2 == 1){
                this.touchbox8Value = "x";
                this.box8_x.setVisibility(View.VISIBLE);
                this.switchPlayerTo("o");
            }
            else{
                this.touchbox8Value = "o";
                this.box8_o.setVisibility(View.VISIBLE);
                this.switchPlayerTo("x");
            }
            this.switchPlayer++;
            this.checkStatus();
        }
    }

    public void onClickTouchbox9(View view){
        if(this.touchbox9Value.isEmpty()){
            if(this.switchPlayer % 2 == 1){
                this.touchbox9Value = "x";
                this.box9_x.setVisibility(View.VISIBLE);
                this.switchPlayerTo("o");
            }
            else{
                this.touchbox9Value = "o";
                this.box9_o.setVisibility(View.VISIBLE);
                this.switchPlayerTo("x");
            }
            this.switchPlayer++;
            this.checkStatus();
        }
    }

    public void switchPlayerTo(String player){
        if(player.equalsIgnoreCase("x")){
            this.activePlayerX.setVisibility(View.VISIBLE);
            this.inactivePlayerX.setVisibility(View.INVISIBLE);
            this.activePlayerO.setVisibility(View.INVISIBLE);
            this.inactivePlayerO.setVisibility(View.VISIBLE);
        }
        else if(player.equalsIgnoreCase("o")){
            this.activePlayerX.setVisibility(View.INVISIBLE);
            this.inactivePlayerX.setVisibility(View.VISIBLE);
            this.activePlayerO.setVisibility(View.VISIBLE);
            this.inactivePlayerO.setVisibility(View.INVISIBLE);
        }
    }

    public void checkStatus(){
        if(this.touchbox1Value.equalsIgnoreCase("x")&&this.touchbox2Value.equalsIgnoreCase("x")&&this.touchbox3Value.equalsIgnoreCase("x")){
            this.line123.setVisibility(View.VISIBLE);
            this.endGame();

            Intent intent = new Intent(this, WinX.class);
            startActivity(intent);
            finish();
        }
        else if(this.touchbox1Value.equalsIgnoreCase("o")&&this.touchbox2Value.equalsIgnoreCase("o")&&this.touchbox3Value.equalsIgnoreCase("o")){
            this.line123.setVisibility(View.VISIBLE);
            this.endGame();

            Intent intent = new Intent(this, WinO.class);
            startActivity(intent);
            finish();
        }
        else if(this.touchbox4Value.equalsIgnoreCase("x")&&this.touchbox5Value.equalsIgnoreCase("x")&&this.touchbox6Value.equalsIgnoreCase("x")){
            this.line456.setVisibility(View.VISIBLE);
            this.endGame();

            Intent intent = new Intent(this, WinX.class);
            startActivity(intent);
            finish();
        }
        else if(this.touchbox4Value.equalsIgnoreCase("o")&&this.touchbox5Value.equalsIgnoreCase("o")&&this.touchbox6Value.equalsIgnoreCase("o")){
            this.line456.setVisibility(View.VISIBLE);
            this.endGame();

            Intent intent = new Intent(this, WinO.class);
            startActivity(intent);
            finish();
        }
        else if(this.touchbox7Value.equalsIgnoreCase("x")&&this.touchbox8Value.equalsIgnoreCase("x")&&this.touchbox9Value.equalsIgnoreCase("x")){
            this.line789.setVisibility(View.VISIBLE);
            this.endGame();

            Intent intent = new Intent(this, WinX.class);
            startActivity(intent);
            finish();
        }
        else if(this.touchbox7Value.equalsIgnoreCase("o")&&this.touchbox8Value.equalsIgnoreCase("o")&&this.touchbox9Value.equalsIgnoreCase("o")){
            this.line789.setVisibility(View.VISIBLE);
            this.endGame();

            Intent intent = new Intent(this, WinO.class);
            startActivity(intent);
            finish();
        }
        else if(this.touchbox1Value.equalsIgnoreCase("x")&&this.touchbox4Value.equalsIgnoreCase("x")&&this.touchbox7Value.equalsIgnoreCase("x")){
            this.line147.setVisibility(View.VISIBLE);
            this.endGame();

            Intent intent = new Intent(this, WinX.class);
            startActivity(intent);
            finish();
        }
        else if(this.touchbox1Value.equalsIgnoreCase("o")&&this.touchbox4Value.equalsIgnoreCase("o")&&this.touchbox7Value.equalsIgnoreCase("o")){
            this.line147.setVisibility(View.VISIBLE);
            this.endGame();

            Intent intent = new Intent(this, WinO.class);
            startActivity(intent);
            finish();
        }
        else if(this.touchbox2Value.equalsIgnoreCase("x")&&this.touchbox5Value.equalsIgnoreCase("x")&&this.touchbox8Value.equalsIgnoreCase("x")){
            this.line258.setVisibility(View.VISIBLE);
            this.endGame();

            Intent intent = new Intent(this, WinX.class);
            startActivity(intent);
            finish();
        }
        else if(this.touchbox2Value.equalsIgnoreCase("o")&&this.touchbox5Value.equalsIgnoreCase("o")&&this.touchbox8Value.equalsIgnoreCase("o")){
            this.line258.setVisibility(View.VISIBLE);
            this.endGame();

            Intent intent = new Intent(this, WinO.class);
            startActivity(intent);
            finish();
        }
        else if(this.touchbox3Value.equalsIgnoreCase("x")&&this.touchbox6Value.equalsIgnoreCase("x")&&this.touchbox9Value.equalsIgnoreCase("x")){
            this.line369.setVisibility(View.VISIBLE);
            this.endGame();

            Intent intent = new Intent(this, WinX.class);
            startActivity(intent);
            finish();
        }
        else if(this.touchbox3Value.equalsIgnoreCase("o")&&this.touchbox6Value.equalsIgnoreCase("o")&&this.touchbox9Value.equalsIgnoreCase("o")){
            this.line369.setVisibility(View.VISIBLE);
            this.endGame();

            Intent intent = new Intent(this, WinO.class);
            startActivity(intent);
            finish();
        }
        else if(this.touchbox1Value.equalsIgnoreCase("x")&&this.touchbox5Value.equalsIgnoreCase("x")&&this.touchbox9Value.equalsIgnoreCase("x")){
            this.line159.setVisibility(View.VISIBLE);
            this.endGame();

            Intent intent = new Intent(this, WinX.class);
            startActivity(intent);
            finish();
        }
        else if(this.touchbox1Value.equalsIgnoreCase("o")&&this.touchbox5Value.equalsIgnoreCase("o")&&this.touchbox9Value.equalsIgnoreCase("o")){
            this.line159.setVisibility(View.VISIBLE);
            this.endGame();

            Intent intent = new Intent(this, WinO.class);
            startActivity(intent);
            finish();
        }
        else if(this.touchbox3Value.equalsIgnoreCase("x")&&this.touchbox5Value.equalsIgnoreCase("x")&&this.touchbox7Value.equalsIgnoreCase("x")){
            this.line357.setVisibility(View.VISIBLE);
            this.endGame();

            Intent intent = new Intent(this, WinX.class);
            startActivity(intent);
            finish();
        }
        else if(this.touchbox3Value.equalsIgnoreCase("o")&&this.touchbox5Value.equalsIgnoreCase("o")&&this.touchbox7Value.equalsIgnoreCase("o")){
            this.line357.setVisibility(View.VISIBLE);
            this.endGame();

            Intent intent = new Intent(this, WinO.class);
            startActivity(intent);
            finish();
        }
        else if(this.touchbox1Value.isEmpty() == false&&
                this.touchbox2Value.isEmpty() == false&&
                this.touchbox3Value.isEmpty() == false&&
                this.touchbox4Value.isEmpty() == false&&
                this.touchbox5Value.isEmpty() == false&&
                this.touchbox6Value.isEmpty() == false&&
                this.touchbox7Value.isEmpty() == false&&
                this.touchbox8Value.isEmpty() == false&&
                this.touchbox9Value.isEmpty() == false){
            this.mediaPlayer.stop();
            Intent intent = new Intent(this, DrawMatch.class);
            startActivity(intent);
            finish();
        }

    }

    public void endGame(){
        this.touchbox1Value = "e";
        this.touchbox2Value = "e";
        this.touchbox3Value = "e";
        this.touchbox4Value = "e";
        this.touchbox5Value = "e";
        this.touchbox6Value = "e";
        this.touchbox7Value = "e";
        this.touchbox8Value = "e";
        this.touchbox9Value = "e";

        this.mediaPlayer.stop();
    }

    public void onBackPressed(){
        super.onBackPressed();
        mediaPlayer.stop();
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
        finish();
    }

    public void onClickBackBtn(View view){
        mediaPlayer.stop();
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
        finish();
    }
}