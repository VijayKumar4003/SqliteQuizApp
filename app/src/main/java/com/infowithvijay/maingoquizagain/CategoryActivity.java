package com.infowithvijay.maingoquizagain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener {


    Button btHistory,btComputers,btEnglish,btMaths,btGraphics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        btHistory = findViewById(R.id.button2);
        btEnglish = findViewById(R.id.button3);
        btComputers = findViewById(R.id.button5);
        btMaths = findViewById(R.id.button4);
        btGraphics = findViewById(R.id.button6);


        btGraphics.setOnClickListener(this);
        btMaths.setOnClickListener(this);
        btComputers.setOnClickListener(this);
        btEnglish.setOnClickListener(this);
        btHistory.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.button2:  // history

                Intent intentHistory = new Intent(CategoryActivity.this,QuizActivity.class);
                intentHistory.putExtra("Category",Constants.HISTORY);
                startActivity(intentHistory);
                break;
            case R.id.button3:  // English

                Intent intentEnglish = new Intent(CategoryActivity.this,QuizActivity.class);
                intentEnglish.putExtra("Category",Constants.ENGLISH);
                startActivity(intentEnglish);
                break;

            case R.id.button4:  // Maths

                Intent intentMaths = new Intent(CategoryActivity.this,QuizActivity.class);
                intentMaths.putExtra("Category",Constants.MATHS);
                startActivity(intentMaths);
                break;

            case R.id.button5:  // Computers

                Intent intentComputers = new Intent(CategoryActivity.this,QuizActivity.class);
                intentComputers.putExtra("Category",Constants.COMPUTERS);
                startActivity(intentComputers );
                break;

            case R.id.button6:  // Graphics

                Intent intentGraphics = new Intent(CategoryActivity.this,QuizActivity.class);
                intentGraphics.putExtra("Category",Constants.GRAPHICS);
                startActivity(intentGraphics );
                break;


        }

    }
}
