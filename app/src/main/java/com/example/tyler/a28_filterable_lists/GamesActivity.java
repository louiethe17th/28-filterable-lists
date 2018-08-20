package com.example.tyler.a28_filterable_lists;

import android.support.v4.app.Fragment;

public class GamesActivity extends ThemeFragment {

    public int getHeaderDrawableID() {
       return R.drawable.paint;
   }

   public Fragment createFragment() {

        return new GamesFragment();
   }
}
