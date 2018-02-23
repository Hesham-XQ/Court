package com.example.android.courtcounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int goalForRm ;
    private int foulForRm ;
    private int yellowCardForRm ;
    private int redCardForRm ;

    private int goalForB ;
    private int foulForB ;
    private int yellowCardForB ;
    private int redCardForB ;

    TextView scoreView;
    TextView foulView;
    TextView cardView ;
    TextView RcardView ;
    TextView goalView_b ;
    TextView foulView_b ;
    TextView cardView_b ;
    TextView red_b ;
    private static final int default_value = 0;
    // display methods for real madrid


    // onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreView = (TextView) findViewById(R.id.goalRM);
        foulView = (TextView) findViewById(R.id.foulRM);
        cardView = (TextView) findViewById(R.id.ycardRM);
        RcardView = (TextView) findViewById(R.id.rcardRM);
        goalView_b = (TextView) findViewById(R.id.goalB);
        foulView_b = (TextView) findViewById(R.id.foulB);
       cardView_b = (TextView) findViewById(R.id.ycardB);
       red_b = (TextView) findViewById(R.id.rcardB);
    }


    public void displayGoalRM(int score) {

        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulRM(int foul_r) {

        foulView.setText(String.valueOf(foul_r));
    }

    public void displayCardRM(int card_r) {

        cardView.setText(String.valueOf(card_r));
    }

    public void displayRcardRM(int rcard_r) {

        RcardView.setText(String.valueOf(rcard_r));
    }

    //display methods for barcelona
    public void displayGoalB(int goal_b) {

        goalView_b.setText(String.valueOf(goal_b));
    }

    public void displayFoulB(int foul_b) {

        foulView_b.setText(String.valueOf(foul_b));
    }

    public void displayCardB(int card_b) {

        cardView_b.setText(String.valueOf(card_b));
    }

    public void displayRcardB(int rcard_b) {

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




// reset method


    public void reset(View v) {

        goalForRm = default_value;
        foulForRm = default_value;
        yellowCardForRm = default_value;
        redCardForRm = default_value;
        redCardForB = default_value;
        yellowCardForB = default_value;
        foulForB = default_value;
        goalForB = default_value;
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

