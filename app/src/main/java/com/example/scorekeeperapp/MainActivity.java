package com.example.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static int score1=0;
    public static int score2=0;
    public static int faouls1=0;
    public static int faouls2=0;
    public TextView goal1;
    public TextView goal2;
    public TextView faoul1;
    public TextView faoul2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goal1=findViewById(R.id.team1_score);
        goal2=findViewById(R.id.team2_score);
        faoul1=findViewById(R.id.team1_foual);
        faoul2=findViewById(R.id.team2_foual);
    }
    public void freekick1(View view){
        faouls2++;
        faoul2.setText(String.valueOf(faouls2));

    }
    public void freekick2(View view){
        faouls1++;
        faoul1.setText(String.valueOf(faouls1));

    }
    public void score_goal1(View view){
        score1++;
        goal1.setText(String.valueOf(score1));
    }
    public void score_goal2(View view){
        score2++;
        goal2.setText(String.valueOf(score2));
    }
    public void reset(View view){
        score1=0;
        score2=0;
        faouls1=0;
        faouls2=0;
        goal1.setText(String.valueOf(score1));
        goal2.setText(String.valueOf(score2));
        faoul1.setText(String.valueOf(faouls1));
        faoul2.setText(String.valueOf(faouls2));
    }
}
