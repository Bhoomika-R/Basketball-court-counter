package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThree(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwo(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void addOne(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }
    public void addThreeB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    public void addOneB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}