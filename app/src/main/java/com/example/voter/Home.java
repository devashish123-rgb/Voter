package com.example.voter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void info(View view)
    {
        Intent intent=new Intent(this,Info.class);
        startActivity(intent);
    }
    public void reg(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://eci.gov.in/voter/voter-registration"));
        startActivity(intent);
    }
    public void down(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.eci.citizen"));
        startActivity(intent);
    }
}