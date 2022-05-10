package com.example.universitylab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class QuestionsActivity extends AppCompatActivity {

    private Button yesBtn, noBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        yesBtn = findViewById(R.id.questionYes);
        noBtn = findViewById(R.id.questionNo);

    }
}