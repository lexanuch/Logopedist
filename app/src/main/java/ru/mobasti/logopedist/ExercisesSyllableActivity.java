package ru.mobasti.logopedist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.Timer;
import java.util.TimerTask;

public class ExercisesSyllableActivity extends Activity {
    public SoundPool mSoundPool;
    private float curVolume;
    private float maxVolume;
    private float leftVolume;
    private float rightVolume;
    private int priority;
    private int no_loop;
    private float normal_playback_rate;
    private int soundID;
    public int mStreamId;
    private final static int DelyaPlaySound = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        Intent intent = getIntent();

        String letter = intent.getStringExtra("Letter");
        TextView NameSyllable = (TextView)findViewById(R.id.textView_NameSyllable);
        NameSyllable.setText(letter);

        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        mSoundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 100);
        AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        curVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        leftVolume = curVolume / maxVolume;
        rightVolume = curVolume / maxVolume;
        priority = 1;
        no_loop = 0;
        normal_playback_rate = 1f;

        //soundID = mSoundPool.load(this,ModuleSyllable.getLinkSoundSyllable("") , 1);
        soundID = mSoundPool.load(ModuleSyllable.getLinkSoundSyllable("Ч")[0],1);
        mSoundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                Timer timer = new Timer();
                TimerTask mTimerTask = new MyTimerTask();
                timer.schedule(mTimerTask,DelyaPlaySound);
            }
        });

    }

    class MyTimerTask extends TimerTask {
        @Override
        public void run() {
            mStreamId = mSoundPool.play(soundID, leftVolume, rightVolume, priority, no_loop,
                    normal_playback_rate);
        }
    }

    public void onClickExitExercises(View view) {
        finish();
    }
}
