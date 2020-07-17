package com.example.voter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Vote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);
    }
    public void yes(View view)
    {
        Toast.makeText(Vote.this,"Voted Successfully...",Toast.LENGTH_LONG).show();

        Intent intent=new Intent(this,Home.class);
        startActivity(intent);
    }
}