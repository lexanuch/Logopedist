package ru.mobasti.logopedist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectSyllableActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_syllable);
    }

    public void onClickCh(View view) {
        Intent intent = new Intent(this, SyllableActivity.class);
        intent.putExtra("Letter", "Ч");
        startActivity(intent);


    }
}
