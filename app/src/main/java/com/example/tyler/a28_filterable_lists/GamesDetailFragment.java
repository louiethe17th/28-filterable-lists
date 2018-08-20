package com.example.tyler.a28_filterable_lists;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tyler.a28_filterable_lists.games.Game;

public class GamesDetailFragment extends Fragment {
    TextView title;
    TextView genre;
    TextView description;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ){
        View view = inflater.inflate(R.layout.activity_games_detail, container, false);
        Intent data = getActivity().getIntent();
        Game game = Game.fromIntent(data);

        title = view.findViewById(R.id.detail_title);
        genre = view.findViewById(R.id.detail_genre);
        description = view.findViewById(R.id.detail_description);

        title.setText(game.title);
        genre.setText(game.genre);
        description.setText(game.description);

        return view;
    }

}
