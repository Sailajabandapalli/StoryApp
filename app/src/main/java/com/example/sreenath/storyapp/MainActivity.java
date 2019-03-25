package com.example.sreenath.storyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView mStory;
int mStoryIndex=1;
Button T1_Ans1;
Button T1_Ans2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStory=findViewById(R.id.storyTextView);
        T1_Ans1=findViewById(R.id.buttonTop);
        T1_Ans2=findViewById(R.id.buttonBottom);

        T1_Ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1) {
                    mStory.setText(R.string.T2_Story);
                    T1_Ans1.setText(R.string.T2_Ans1);
                    T1_Ans2.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    mStory.setText(R.string.T4_End);
                    T1_Ans1.setVisibility(View.GONE);
                    T1_Ans2.setVisibility(View.GONE);
                }
                else {
                    mStory.setText(R.string.T5_End);
                    T1_Ans1.setVisibility(View.GONE);
                    T1_Ans2.setVisibility(View.GONE);
                }
            }
        });

        T1_Ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1||mStoryIndex==2) {
                    mStory.setText(R.string.T3_Story);
                    T1_Ans1.setText(R.string.T3_Ans1);
                    T1_Ans2.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else {
                    mStory.setText(R.string.T6_End);
                    T1_Ans1.setVisibility(View.GONE);
                    T1_Ans2.setVisibility(View.GONE);
                }

            }
        });
    }
}
