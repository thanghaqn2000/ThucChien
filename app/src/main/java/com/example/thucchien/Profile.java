package com.example.thucchien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void backlogin(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }
    public void ListView(View view) {
        startActivity(new Intent(getApplicationContext(),ListView.class));
    }
}