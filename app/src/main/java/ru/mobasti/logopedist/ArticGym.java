package ru.mobasti.logopedist;


import android.os.Bundle;
import android.app.Activity;

public class ArticGym extends Activity {
    Integer Count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artic_gym);

        Count = ModuleArticGym.getCount();

    }
}
