package com.example.thucchien;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void profile(View view) {
        startActivity(new Intent(getApplicationContext(),Profile.class));
    }
    public void backlogin(View view) {
    }
    public void SignUp(View view) {
        startActivity(new Intent(getApplicationContext(),Signup.class));
    }

    public void SignIn(View view) {
    }

    public void ListView(View view) {
    }
}