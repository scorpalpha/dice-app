package com.example.diceee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollbtn;
    ImageView left_dice, right_dice;
    int []diceArray = {R.drawable.dice1,
                       R.drawable.dice2,
                       R.drawable.dice3,
                       R.drawable.dice4,
                       R.drawable.dice5,
                       R.drawable.dice6};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollbtn= (Button)findViewById(R.id.Rollbtn);
        left_dice= (ImageView) findViewById(R.id.image_leftDice);
        right_dice=(ImageView)findViewById(R.id.image_rightDice);
        rollbtn.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("dicee","Button clicked");
                Random randint= new Random();
                Random random= new Random();
                int num1= randint.nextInt(6);
                int num2= random.nextInt(6);
                left_dice.setImageResource(diceArray[num1]);
                right_dice.setImageResource(diceArray[num2]);



            }
        });


    }
}
