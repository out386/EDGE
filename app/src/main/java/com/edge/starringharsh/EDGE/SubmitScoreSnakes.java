package com.edge.starringharsh.EDGE;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubmitScoreSnakes extends BaseActivity {

    Button sub, replay;
    EditText etName, etPhone;
    TextView tvScore;
    String score, time, name, phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_score);
        //https://drive.google.com/open?id=1mL4ANxAh-3cyAj6P0ycqAX_mIRXeuLLYkC6Wbg48KSM
        //https://docs.google.com/forms/d/e/1FAIpQLSfxsbwE-64hYKFS-rUkeleuy782YxS9no8npSowyj5RMM1oWQ/viewform?usp=sf_link

        etName = (EditText) findViewById(R.id.etName);
        etPhone = (EditText) findViewById(R.id.etPhone);
        tvScore = (TextView) findViewById(R.id.tvFinalScore);
        sub = (Button) findViewById(R.id.bSubmit);
        replay = (Button) findViewById(R.id.bReplay);
        score = getIntent().getStringExtra("Score");

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
                    String url = "https://docs.google.com/forms/d/1xp6GJiJlnwvwhzm1xpEqu2_SmsC9yrGjagz-8f5ibcA/formResponse?ifq&entry.416112121="+name+"&entry.852195496="+phone+"&entry.63957030="+score+"&submit=Submit";
                    System.out.println(url);
                    Intent intent = new Intent(SubmitScoreSnakes.this, CampusAmbassadors.class);
                    intent.putExtra("weblink", url);
                    startActivity(intent);
                    finish();
                }
            }
        });

        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubmitScoreSnakes.this, KukuKube.class);
                startActivity(intent);
                finish();
            }
        });
    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(SubmitScoreSnakes.this, MainMenu.class);
        startActivity(intent);
        finish();
    }


}