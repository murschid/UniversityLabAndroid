package com.example.universitylab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    private Button startGame;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        startGame = findViewById(R.id.startGame);
        editText = findViewById(R.id.editText);

        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameActivity.this, QuestionsActivity.class);
                startActivity(intent);
                String player = editText.getText().toString() + " has started the game.";
                Toast.makeText(GameActivity.this, player, Toast.LENGTH_SHORT).show();
            }
        });
    }
}