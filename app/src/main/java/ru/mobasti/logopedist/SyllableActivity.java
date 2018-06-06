package ru.mobasti.logopedist;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

public class SyllableActivity extends Activity {

    public VideoView VideoSyllable;
    private int position_video = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllable);

        TextView Letter = (TextView) findViewById(R.id.textView_Letter);
        Intent intent = getIntent();

        String letter = intent.getStringExtra("Letter");
        Letter.setText(letter);

        TextView DescriptionLetter=(TextView)findViewById(R.id.textView_DescriptionLetter);
        DescriptionLetter.setText(ModuleLetters.getTextLetters(letter));

       // MediaController controls = new MediaController(this);

        VideoSyllable = (VideoView)findViewById(R.id.videoView_Syllable);
        String vidoepath = "android.resource://" + getPackageName() + "/" + R.raw.ch;
        Uri uri = Uri.parse(vidoepath);
        VideoSyllable.setVideoURI(uri);

       // controls.setAnchorView(VideoSyllable);

        VideoSyllable.setBackgroundColor(Color.argb(0, 0, 0, 0));
        VideoSyllable.start();




    }

    public void onClickExercises(View view) {

        Intent intent = new Intent(this, ExercisesSyllableActivity.class);
        intent.putExtra("Letter", "Ч");
        startActivity(intent);

    }

    public void onClickTraining(View view) {

        Intent intent = new Intent(this, TrainingSyllableActivity.class);
        intent.putExtra("Letter", "Ч");
        startActivity(intent);

    }

    public void onClick_imageButton_replay(View view) {

        VideoSyllable.start();
    }
}
