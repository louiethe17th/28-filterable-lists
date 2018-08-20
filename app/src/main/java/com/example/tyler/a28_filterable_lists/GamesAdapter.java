package com.example.tyler.a28_filterable_lists;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tyler.a28_filterable_lists.games.Game;

import java.util.List;


public class GamesAdapter extends RecyclerView.Adapter<GamesAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public Game mGames;
        public View view;
        public TextView title;
        public TextView genre;

        public ViewHolder(View view){
            super(view);
            this.view = view;

            this.title = view.findViewById(R.id.title);
            this.genre = view.findViewById(R.id.genre);
            view.setOnClickListener(this);
        }

        @Override
        public  void onClick(View v) {
            Intent intent = new Intent(v.getContext(), GamesDetailActivity.class);
            mGames.fillIntent(intent);

            v.getContext().startActivity(intent);
        }
    }

    List<Game> gameList;

    public GamesAdapter(List<Game> gameList){
        this.gameList = gameList;
    }


    @Override
    public int getItemCount() {
        return this.gameList.size();
    }


    @Override
    public  ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_games, parent, false);

        ViewHolder holder = new ViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Game game = gameList.get(position);
        holder.title.setText(game.title);
        holder.genre.setText(game.genre);
        holder.mGames = game;
    }


}
