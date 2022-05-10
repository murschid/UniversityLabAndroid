package com.example.universitylab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button imageChangeBtn;
    private RadioGroup radioGroup;
    private RadioButton radioCat, radioDog;
    RatingBar ratingBar;
    private boolean isCat = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageChangeBtn = findViewById(R.id.imageChange);
        imageView = findViewById(R.id.imageContainer);
        radioGroup = findViewById(R.id.imageChangeRadioGroup);
        radioCat = findViewById(R.id.radioCat);
        radioDog = findViewById(R.id.radioDog);
        ratingBar = findViewById(R.id.ratingBar);

        imageChangeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isCat) {
                    imageView.setImageResource(R.drawable.dog);
                    isCat = false;
                } else {
                    imageView.setImageResource(R.drawable.cat);
                    isCat = true;
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (radioCat.isChecked()) {
                    imageView.setImageResource(R.drawable.cat);
                }
                if (radioDog.isChecked()) {
                    imageView.setImageResource(R.drawable.dog);
                }
            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                String result = "Rating is: " + Float.toString(v);
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.gameMenu) {
            Intent intent = new Intent(MainActivity.this, GameActivity.class);
            startActivity(intent);
            Toast.makeText(MainActivity.this, "Game Menu", Toast.LENGTH_SHORT).show();
        } else if(item.getItemId() == R.id.settingMenu) {
            Toast.makeText(MainActivity.this, "Setting Menu", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}