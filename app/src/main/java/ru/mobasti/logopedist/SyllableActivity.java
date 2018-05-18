package ru.mobasti.logopedist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SyllableActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllable);

        TextView Letter = (TextView) findViewById(R.id.textView_Letter);
        Intent intent = getIntent();

        String letter = intent.getStringExtra("Letter");

        Letter.setText(letter);
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
}
