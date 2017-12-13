package com.example.android.courtcounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalForRm = 0;
    int foulForRm = 0;
    int yellowCardForRm = 0;
    int redCardForRm = 0;

    int goalForB = 0;
    int foulForB = 0;
    int yellowCardForB = 0;
    int redCardForB = 0;

    // display methods for real madrid

    public void displayGoalRM(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goalRM);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulRM(int foul_r) {
        TextView foulView = (TextView) findViewById(R.id.foulRM);
        foulView.setText(String.valueOf(foul_r));
    }

    public void displayCardRM(int card_r) {
        TextView cardView = (TextView) findViewById(R.id.ycardRM);
        cardView.setText(String.valueOf(card_r));
    }

    public void displayRcardRM(int rcard_r) {
        TextView RcardView = (TextView) findViewById(R.id.rcardRM);
        RcardView.setText(String.valueOf(rcard_r));
    }

    //display methods for barcelona
    public void displayGoalB(int goal_b) {
        TextView goalView_b = (TextView) findViewById(R.id.goalB);
        goalView_b.setText(String.valueOf(goal_b));
    }

    public void displayFoulB(int foul_b) {
        TextView foulView_b = (TextView) findViewById(R.id.foulB);
        foulView_b.setText(String.valueOf(foul_b));
    }

    public void displayCardB(int card_b) {
        TextView cardView_b = (TextView) findViewById(R.id.ycardB);
        cardView_b.setText(String.valueOf(card_b));
    }

    public void displayRcardB(int rcard_b) {
        TextView red_b = (TextView) findViewById(R.id.rcardB);
        red_b.setText(String.valueOf(rcard_b));
    }


    //updating values for real madrid

    public void goalrm(View view) {
        goalForRm += 1;
        displayGoalRM(goalForRm);
    }

    public void foulrm(View view) {
        foulForRm += 1;
        displayFoulRM(foulForRm);
    }

    public void redcardrm(View view) {
        redCardForRm += 1;
        displayRcardRM(redCardForRm);
    }

    public void yellowcardrm(View view) {
        yellowCardForRm += 1;
        displayCardRM(yellowCardForRm);
    }


    //updating values for barcelona

    public void goalb(View view) {
        goalForB += 1;
        displayGoalB(goalForB);
    }

    public void foulb(View view) {
        foulForB += 1;
        displayFoulB(foulForB);
    }

    public void redcardb(View view) {
        redCardForB += 1;
        displayRcardB(redCardForB);
    }

    public void yellowcardb(View view) {
        yellowCardForB += 1;
        displayCardB(yellowCardForB);
    }

    // onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



// reset method

    public void reset(View v) {
        goalForRm = 0;
        foulForRm = 0;
        yellowCardForRm = 0;
        redCardForRm = 0;
        redCardForB = 0;
        yellowCardForB = 0;
        foulForB = 0;
        goalForB = 0;
        displayGoalRM(goalForRm);
        displayFoulRM(foulForRm);
        displayCardRM(yellowCardForRm);
        displayRcardRM(redCardForRm);
        displayGoalB(goalForB);
        displayFoulB(foulForB);
        displayCardB(yellowCardForB);
        displayRcardB(redCardForB);
    }

}

