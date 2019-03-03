package com.edge.starringharsh.EDGE;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubmitScoreKukuKube extends AppCompatActivity {

    Button sub, replay;
    EditText etName, etPhone;
    TextView tvScore;
    String score, time, name, phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_score);
        //https://docs.google.com/spreadsheets/d/1vlHggNspJf09ff7YL0qE2hdmjwIoNOExLFiaTevbUNw/edit?usp=sharing
        //https://docs.google.com/forms/d/e/1FAIpQLScTnNsusxumO_3Dv63qUQ6ttSqqduF8EpcP9Joacwxs8eCVnA/viewform?usp=sf_link

        etName = (EditText) findViewById(R.id.etName);
        etPhone = (EditText) findViewById(R.id.etPhone);
        tvScore = (TextView) findViewById(R.id.tvFinalScore);
        sub = (Button) findViewById(R.id.bSubmit);
        replay = (Button) findViewById(R.id.bReplay);
        score = getIntent().getStringExtra("Score");
        time = getIntent().getStringExtra("Time");

        tvScore.setText(score);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = etName.getText().toString();
                phone = etPhone.getText().toString();

                if((name.length()>0)&&(phone.length()>0))
                {
                    name = name.replaceAll(" ","_");
                    phone = phone.replaceAll(" ","");
                    String url = "https://docs.google.com/forms/d/1yl2gu-v2dfUFNzY0KTaRkftOnY5Ls3Crqe6X_bzJA1o/formResponse?ifq&entry.2111959628="+name+"&entry.1987450122="+phone+"&entry.1952577711="+score+"&entry.1475228423="+time+"&submit=Submit";

                    System.out.println(url);
                    Intent intent = new Intent(SubmitScoreKukuKube.this, CampusAmbassadors.class);
                    intent.putExtra("weblink", url);
                    startActivity(intent);
                    finish();
                }
            }
        });

        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0,0);
    }

}