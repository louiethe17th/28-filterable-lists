package com.example.tyler.a28_filterable_lists;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.tyler.a28_filterable_lists.games.Game;
import com.example.tyler.a28_filterable_lists.games.GameData;

import java.util.List;

public class GamesFragment extends Fragment implements TextWatcher {

    private EditText mSearch;

    private List<Game> gameListBoi;

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private GamesAdapter mAdapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        View view = inflater.inflate(R.layout.activity_games_fragment, container, false);

        mSearch = view.findViewById(R.id.search);
        mSearch.addTextChangedListener(this);

        gameListBoi = GameData.get().games();

        mRecyclerView = view.findViewById(R.id.list);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new GamesAdapter(gameListBoi);
        mRecyclerView.setAdapter(mAdapter);

        return view;

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        String filter = s.toString().toLowerCase();
        List<Game> filtered = GameData.search(filter);

        mAdapter = new GamesAdapter(filtered);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void afterTextChanged(Editable s) {
        // do nothing
    }


}
