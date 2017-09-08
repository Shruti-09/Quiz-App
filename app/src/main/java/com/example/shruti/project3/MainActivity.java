package com.example.shruti.project3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //ques1
    public void answer1(View view)
    {
       Toast.makeText(this, "Correct! You Have Scored 1 Point", Toast.LENGTH_SHORT).show();
    }
    //ques2
    public void answer2(View view)
    {
        Toast.makeText(this, "Correct! You Have Scored 1 Point", Toast.LENGTH_SHORT).show();
    }
    //ques3
    public void answer3(View view)
    {
        Toast.makeText(this, "Correct! You Have Scored 1 Point", Toast.LENGTH_SHORT).show();
    }
    //ques4
    public void answer4(View view)
    {
        Toast.makeText(this, "Correct! You Have Scored 1 Point", Toast.LENGTH_SHORT).show();
    }
    //ques5
    public void answer5(View view)
    {
        Toast.makeText(this, "Correct! You Have Scored 1 Point", Toast.LENGTH_SHORT).show();
    }
    //ques8
    public void answer8(View view)
    {
        Toast.makeText(this, "Make Sure You Have Checked All The Answers Only Then You Will Have Scored 1 Point", Toast.LENGTH_SHORT).show();
    }
    //ques6
    public void answer6(View view)
    {
        Toast.makeText(this, "Enter The Answer Here", Toast.LENGTH_SHORT).show();
    }
    //ques7
    public void answer7(View view)
    {
        Toast.makeText(this, "Enter The Answer Here", Toast.LENGTH_SHORT).show();
    }
    int score=0;
    public void submit(View view) {

        int score1,score2,score3,score4,score5,score6,score7,score8,score;
        // ques1
        RadioButton ques1Ans = (RadioButton) findViewById(R.id.ques1ans);
        Boolean ans1 = ques1Ans.isChecked();
        if(ans1)
        {
            score1 = 1;
        }
        else
        {
            score1 = 0;
        }
        //ques2
        RadioButton ques2Ans = (RadioButton) findViewById(R.id.ques2ans);
        Boolean ans2 = ques2Ans.isChecked();
        if(ans2)
        {
            score2 = 1;
        }
        else
        {
            score2 = 0;
        }
        //ques3
        RadioButton ques3Ans = (RadioButton) findViewById(R.id.ques3ans);
        Boolean ans3 = ques3Ans.isChecked();
        if(ans3)
        {
            score3 = 1;
        }
        else
        {
            score3 = 0;
        }
        //ques4
        RadioButton ques4Ans = (RadioButton) findViewById(R.id.ques4ans);
        Boolean ans4 = ques4Ans.isChecked();
        if(ans4)
        {
            score4 = 1;
        }
        else
        {
            score4 = 0;
        }
        //ques5
        RadioButton ques5Ans = (RadioButton) findViewById(R.id.ques5ans);
        Boolean ans5 = ques5Ans.isChecked();
        if(ans5)
        {
            score5 = 1;
        }
        else
        {
            score5 = 0;
        }
        //ques8
        CheckBox ques8Ans1 = (CheckBox) findViewById(R.id.ques8ans1);
        CheckBox ques8Ans2 = (CheckBox) findViewById(R.id.ques8ans2);
        CheckBox ques8a = (CheckBox) findViewById(R.id.ques8a);
        CheckBox ques8b = (CheckBox) findViewById(R.id.ques8b);
        Boolean ans81 = ques8Ans1.isChecked();
        Boolean ans82 = ques8Ans2.isChecked();
        Boolean ans83 = ques8a.isChecked();
        Boolean ans84 = ques8b.isChecked();
        if(ans81 && ans82 && !ans83 && !ans84)
        {
            score8 = 1;
        }
        else
        {
            score8 = 0;
        }
        //ques6
        EditText ques6Ans = (EditText) findViewById(R.id.ques6ans);
        String ans6 = ques6Ans.getText().toString().trim();
        if(ans6.equalsIgnoreCase("henry law"))
        {
            score6=1;
        }
        else
        {
            score6=0;
        }
        //ques7
        EditText ques7Ans = (EditText) findViewById(R.id.ques7ans);
        String ans7 = ques7Ans.getText().toString().trim();
        if(ans7.equalsIgnoreCase("chlorine"))
        {
            score7=1;
        }
        else
        {
            score7=0;
        }
        score=score1+score2+score3+score4+score5+score6+score7+score8;
        if (score == 8) {
            Toast.makeText(this, "Awesome! You Got All The Questions Correct!", Toast.LENGTH_SHORT).show();
            //reviewsaid to use string.xml for the content buti havent found that yet
        } else {
            Toast.makeText(this, "Your Final Score Is " + score + ". Try Again.", Toast.LENGTH_SHORT).show();
        }

    }

}
