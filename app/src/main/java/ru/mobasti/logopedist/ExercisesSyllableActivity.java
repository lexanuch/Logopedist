package ru.mobasti.logopedist;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

public class ExercisesSyllableActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        Intent intent = getIntent();

        String letter = intent.getStringExtra("Letter");
        TextView NameSyllable = (TextView)findViewById(R.id.textView_NameSyllable);
        NameSyllable.setText(letter);

        VideoView VideoSyllable = (VideoView)findViewById(R.id.videoView_Syllable);



    }

    public void VideoPlay (View v) {
        String vidoepath = "android.resourse://ru.mobasti.logopedist/" + R.raw.test_video.mp4;
        Url uri = Uri.parse()
    }
}
