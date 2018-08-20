package com.example.tyler.a28_filterable_lists.games;

import android.content.Intent;

public class Game {
    public String title;
    public String genre;
    public String description;

    public Game(String title, String genre, String description){
        this.title = title;
        this.genre = genre;
        this.description = description;
    }

    public void fillIntent(Intent intent){
        intent.putExtra("title", this.title);
        intent.putExtra("genre", this.title);
        intent.putExtra("description", this.description);
    }

    public static Game fromIntent(Intent data){
        return new Game(
                data.getStringExtra("title"),
                data.getStringExtra("genre"),
                data.getStringExtra("description")
        );
    }
}
