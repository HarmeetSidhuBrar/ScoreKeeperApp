package com.sidhutechpvtltd.www.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// Activity for the track of the basketball score for two teams.
public class MainActivity extends AppCompatActivity {

    // Keep track of score of Team A
    int scoreTeamA = 0;

    // Keep track of score of Team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Increase the score of Team A by 1 point.

    public void addOneInTeamAScore(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    // Increase the score of Team A by 2 points.

    public void addTwoInTeamAScore(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    // Increase the score of Team A by 3 points.
    public void addThreeInTeamAScore(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    // Increase the score of Team B by 1 point.

    public void addOneInTeamBScore(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    // Increase the score of Team B by 2 points.

    public void addTwoInTeamBScore(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    // Increase the score for Team B by 3 points.
    public void addThreeInTeamBScore(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    // Resets the score for both teams back to 0.

    public void resetScoreToZero(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    // Displays the given score for Team A.

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    // Displays the given score for Team B.

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
