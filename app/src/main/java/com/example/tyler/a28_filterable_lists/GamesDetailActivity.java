package com.example.tyler.a28_filterable_lists;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GamesDetailActivity extends GamesActivity {

    @Override
    public Fragment createFragment() {
        return new GamesDetailFragment();
    }
}
