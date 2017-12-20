package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      final ImageView imvEightBall = findViewById(R.id.imv_eight_ball);
      Button btnAsk = findViewById(R.id.btn_ask);

      final int[] arrayBalls = new int[]{
              R.drawable.ball1,
              R.drawable.ball2,
              R.drawable.ball3,
              R.drawable.ball4,
              R.drawable.ball5
      };


      btnAsk.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

            Random randomNumberGenerator = new Random();

            int number = randomNumberGenerator.nextInt(5);

            imvEightBall.setImageResource(arrayBalls[number]);

         }
      });



   }
}
