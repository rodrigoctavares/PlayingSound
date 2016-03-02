package com.example.suelen.playingsound;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    MediaPlayer rapGod;
    Switch mLoop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rapGod = MediaPlayer.create(this, R.raw.rapgod);
        mLoop = (Switch) findViewById(R.id.switchLoop);
        mLoop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                rapGod.setLooping(isChecked);
            }
        });


    }
    public void playSound (View view) {
        rapGod.start();

    }

    public void pauseSound (View view) {
        if (rapGod.isPlaying())
            rapGod.pause();
    }
}
