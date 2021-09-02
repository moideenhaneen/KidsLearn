package com.example.kidslearn;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
LinearLayout learnLayout, testLayout;
Button lrn, tst, nxt,b1,b2,b3,b4;
ImageButton sImage, tImage;
TextView sName,scoreText;
Integer count = 1,testCount = 1,score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        learnLayout = findViewById(R.id.learnLayout);
        testLayout = findViewById(R.id.testLayout);
        lrn = findViewById(R.id.learnBtn);
        tst = findViewById(R.id.testBtn);
        nxt = findViewById(R.id.nextBtn);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        sImage= findViewById(R.id.sImage);
        tImage= findViewById(R.id.tImage);
        sName= findViewById(R.id.sName);
        scoreText = findViewById(R.id.scoreText);

        lrn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnLayout.setVisibility(View.VISIBLE);
                testLayout.setVisibility(View.GONE);
                score = 0;
                scoreText.setText("Score : "+score);
            }
        });
        tst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnLayout.setVisibility(View.GONE);
                testLayout.setVisibility(View.VISIBLE);
                testCount = 1;
                score = 0;
                scoreText.setText("Score : "+score);
                if(testCount.equals(1)){
                    b1.setText("Circle");
                    b2.setText("Rectangle");
                    b3.setText("Square");
                    b4.setText("Triangle");
                    tImage.setBackground(getDrawable(R.drawable.circle));
                }
            }
        });

        nxt.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                count = count + 1;
                if (count>5){
                    count = 1;
                    sImage.setBackground(getDrawable(R.drawable.circle));
                    sName.setText("Circle");
                }
                if (count.equals(2)){
                    sImage.setBackground(getDrawable(R.drawable.cube));
                    sName.setText("Cube");
                }
                else if (count.equals(3)){
                    sImage.setBackground(getDrawable(R.drawable.triangle));
                    sName.setText("Triangle");
                }
                else if (count.equals(4)){
                    sImage.setBackground(getDrawable(R.drawable.rectangle));
                    sName.setText("Rectangle");
                }
                else if (count.equals(5)){
                    sImage.setBackground(getDrawable(R.drawable.square));
                    sName.setText("Square");
                }
            }
        });


            b1.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                @Override
                public void onClick(View v) {
                    if (testCount.equals(1)) {
                        score = score + 1;
                        scoreText.setText("Score : " + score);
                        testCount = testCount + 1;
                        b1.setText("Cube");
                        b2.setText("Rectangle");
                        b3.setText("Square");
                        b4.setText("Triangle");
                        tImage.setBackground(getDrawable(R.drawable.triangle));
                    }
                    else if (testCount.equals(2)){
                        testCount = testCount + 1;
                        b1.setText("Cube");
                        b2.setText("Rectangle");
                        b3.setText("Square");
                        b4.setText("Circle");
                        tImage.setBackground(getDrawable(R.drawable.cube));
                    }
                    else if (testCount.equals(3)) {
                        score = score + 1;
                        scoreText.setText("Score : " + score);
                        testCount = testCount + 1;
                        b1.setText("Triangle");
                        b2.setText("Rectangle");
                        b3.setText("Square");
                        b4.setText("Circle");
                        tImage.setBackground(getDrawable(R.drawable.rectangle));
                    }
                    else if (testCount.equals(4)){
                        testCount = testCount + 1;
                        b1.setText("Triangle");
                        b2.setText("Rectangle");
                        b3.setText("Square");
                        b4.setText("Circle");
                        tImage.setBackground(getDrawable(R.drawable.square));
                    }
                    else if(testCount.equals(5)) {
                        Toast.makeText(MainActivity.this, "Score :"+ score, Toast.LENGTH_SHORT).show();
                        testLayout.setVisibility(View.GONE);
                    }

                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                @Override
                public void onClick(View v) {
                    if (testCount.equals(1)) {
                        testCount = testCount + 1;
                        b1.setText("Cube");
                        b2.setText("Rectangle");
                        b3.setText("Square");
                        b4.setText("Triangle");
                        tImage.setBackground(getDrawable(R.drawable.triangle));
                    }
                    else if (testCount.equals(2)){
                        testCount = testCount + 1;
                        b1.setText("Cube");
                        b2.setText("Rectangle");
                        b3.setText("Square");
                        b4.setText("Circle");
                        tImage.setBackground(getDrawable(R.drawable.cube));
                    }
                    else if (testCount.equals(3)){
                        testCount = testCount + 1;
                        b1.setText("Triangle");
                        b2.setText("Rectangle");
                        b3.setText("Square");
                        b4.setText("Circle");
                        tImage.setBackground(getDrawable(R.drawable.rectangle));
                    }
                    else if (testCount.equals(4)){
                        score = score + 1;
                        scoreText.setText("Score : " + score);
                        testCount = testCount + 1;
                        b1.setText("Triangle");
                        b2.setText("Rectangle");
                        b3.setText("Square");
                        b4.setText("Circle");
                        tImage.setBackground(getDrawable(R.drawable.square));
                    }
                    else if(testCount.equals(5)) {
                        Toast.makeText(MainActivity.this, "Score :"+ score, Toast.LENGTH_SHORT).show();
                        testLayout.setVisibility(View.GONE);
                    }
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                @Override
                public void onClick(View v) {
                    if (testCount.equals(1)) {
                        testCount = testCount + 1;
                        b1.setText("Cube");
                        b2.setText("Rectangle");
                        b3.setText("Square");
                        b4.setText("Triangle");
                        tImage.setBackground(getDrawable(R.drawable.triangle));
                    }
                    else if (testCount.equals(2)){
                        testCount = testCount + 1;
                        b1.setText("Cube");
                        b2.setText("Rectangle");
                        b3.setText("Square");
                        b4.setText("Circle");
                        tImage.setBackground(getDrawable(R.drawable.cube));
                    }
                    else if (testCount.equals(3)){
                        testCount = testCount + 1;
                        b1.setText("Triangle");
                        b2.setText("Rectangle");
                        b3.setText("Square");
                        b4.setText("Circle");
                        tImage.setBackground(getDrawable(R.drawable.rectangle));
                    }
                    else if (testCount.equals(4)){
                        testCount = testCount + 1;
                        b1.setText("Triangle");
                        b2.setText("Rectangle");
                        b3.setText("Square");
                        b4.setText("Circle");
                        tImage.setBackground(getDrawable(R.drawable.square));
                    }
                    else if(testCount.equals(5)){
                        score = score + 1;
                        scoreText.setText("Score : " + score);
                        Toast.makeText(MainActivity.this, "Score :"+ score, Toast.LENGTH_SHORT).show();
                        testLayout.setVisibility(View.GONE);
                    }
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                @Override
                public void onClick(View v) {
                    if (testCount.equals(1)) {
                        testCount = testCount + 1;
                        b1.setText("Cube");
                        b2.setText("Rectangle");
                        b3.setText("Square");
                        b4.setText("Triangle");
                        tImage.setBackground(getDrawable(R.drawable.triangle));
                    }
                    else if (testCount.equals(2)){
                        score = score + 1;
                        scoreText.setText("Score : " + score);
                        testCount = testCount + 1;
                        b1.setText("Cube");
                        b2.setText("Rectangle");
                        b3.setText("Square");
                        b4.setText("Circle");
                        tImage.setBackground(getDrawable(R.drawable.cube));
                    }
                    else if (testCount.equals(3)){
                        testCount = testCount + 1;
                        b1.setText("Triangle");
                        b2.setText("Rectangle");
                        b3.setText("Square");
                        b4.setText("Circle");
                        tImage.setBackground(getDrawable(R.drawable.rectangle));
                    }
                    else if (testCount.equals(4)){
                        testCount = testCount + 1;
                        b1.setText("Triangle");
                        b2.setText("Rectangle");
                        b3.setText("Square");
                        b4.setText("Circle");
                        tImage.setBackground(getDrawable(R.drawable.square));
                    }
                    else if(testCount.equals(5)) {
                        Toast.makeText(MainActivity.this, "Score :"+ score, Toast.LENGTH_SHORT).show();
                        testLayout.setVisibility(View.GONE);

                    }
                }
            });


    }
}