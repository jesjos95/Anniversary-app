package com.example.admin.hwa;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = (ImageView) findViewById(R.id.hbdpic);
        img.animate().alpha(1f).setDuration(3000);
    }


    public void hbdclick(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.curfirsthalf);
        ImageView imga = (ImageView) findViewById(R.id.cursechalf);
        imageView.animate().translationXBy(-1000f).setDuration(3000);
        imga.animate().translationXBy(1000f).setDuration(3000);
        ImageView img = (ImageView) findViewById(R.id.hbdpic);
        img.animate().rotation(3600f).translationXBy(1000f).setDuration(9000);
        ImageView aa = (ImageView) findViewById(R.id.aa);
        ImageView ac = (ImageView) findViewById(R.id.ac);
        ImageView ad = (ImageView) findViewById(R.id.ad);
        aa.animate().alpha(1f).setDuration(6000);
        aa.animate().translationYBy(-2000).setDuration(9000);
        ac.animate().alpha(1f).setDuration(6000);
        ac.animate().translationYBy(2000).setDuration(9000);
        ad.animate().alpha(1f).setDuration(9000);
        MediaPlayer music = MediaPlayer.create(this,R.raw.my);
        music.start();






    }
    @Override
    protected void onPause() {
        super.onPause();

        music.stop();
    }

    @Override
    protected void onStop() {
        super.onStop();

        music.stop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        music.stop();
    }

}
