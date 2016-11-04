package com.xiaopo.flying.degreeseekbar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DegreeSeekBar degreeSeekBarOne = (DegreeSeekBar) findViewById(R.id.degree_one);
        DegreeSeekBar degreeSeekBarTwo = (DegreeSeekBar) findViewById(R.id.degree_two);
        DegreeSeekBar degreeSeekBarThree = (DegreeSeekBar) findViewById(R.id.degree_three);

        degreeSeekBarTwo.setDegreeRange(-30, 60);
        degreeSeekBarTwo.setCenterTextColor(Color.parseColor("#FF5252"));
        degreeSeekBarTwo.setTextColor(Color.parseColor("#CDDC39"));
        degreeSeekBarTwo.setPointColor(Color.parseColor("#AFB42B"));

        degreeSeekBarThree.setDegreeRange(-60, 30);
        degreeSeekBarThree.setCenterTextColor(Color.parseColor("#4CAF50"));
        degreeSeekBarThree.setTextColor(Color.parseColor("#F57C00"));
        degreeSeekBarThree.setPointColor(Color.parseColor("#FF9800"));
    }
}
