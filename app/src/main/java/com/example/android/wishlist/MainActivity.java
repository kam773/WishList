package com.example.android.wishlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



    }
        @OnClick(R.id.fabAdd)
             public void OnClickFab() {
            Intent intent = new Intent(MainActivity.this, WishAddActivity.class);
            startActivity(intent);


        }





}
