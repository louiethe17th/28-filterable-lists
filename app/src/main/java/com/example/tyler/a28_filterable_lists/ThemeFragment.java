package com.example.tyler.a28_filterable_lists;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public abstract class ThemeFragment extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_back_activity);

        View container = findViewById(R.id.container);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.container);
        if(fragment == null){
            fm.beginTransaction().add(R.id.container, createFragment()).commit();
        }

        ImageView header = findViewById(R.id.header);
        Drawable drawable = getResources().getDrawable(getHeaderDrawableID());
        header.setImageDrawable(drawable);

        Button goBack = findViewById(R.id.goBack);
        goBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public int getHeaderDrawableID(){
        return R.drawable.space;
    }

    public abstract Fragment createFragment();

}
