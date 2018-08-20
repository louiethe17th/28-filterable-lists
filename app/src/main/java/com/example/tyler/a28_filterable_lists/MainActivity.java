package com.example.tyler.a28_filterable_lists;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button goToGames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToGames = findViewById(R.id.goToGames);
        attachClickListener(goToGames, GamesActivity.class);
    }

    public void attachClickListener(Button button, final Class class_){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, class_);
                startActivity(intent);
            }
        });
    }
}
