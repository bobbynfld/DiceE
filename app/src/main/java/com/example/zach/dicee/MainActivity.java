package com.example.zach.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollButton);
        final ImageView leftDice = findViewById(R.id.imgLeftDice);
        final ImageView rightDice = findViewById(R.id.imgRightDice);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("D", "derp");

                Random randomNum = new Random();
                int randomOne = randomNum.nextInt(6) + 1;
                int randomTwo = randomNum.nextInt(6) + 1;

                RollDice(leftDice, randomOne);
                RollDice(rightDice, randomTwo);
                
                Log.d("dice1", "" + randomOne + ", " + randomTwo);
            }
        });
    }

    private void RollDice(ImageView img, int r)
    {
        switch (r)
        {
            case 1:
                img.setImageResource(R.drawable.dice1);
                break;

            case 2:
                img.setImageResource(R.drawable.dice2);
                break;

            case 3:
                img.setImageResource(R.drawable.dice3);
                break;

            case 4:
                img.setImageResource(R.drawable.dice4);
                break;

            case 5:
                img.setImageResource(R.drawable.dice5);
                break;

            case 6:
                img.setImageResource(R.drawable.dice6);
                break;

            default:
                Log.d("dice", "random num not found");
                break;


        }
    }
}
