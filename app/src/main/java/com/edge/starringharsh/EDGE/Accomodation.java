package com.edge.starringharsh.EDGE;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Accomodation extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomodation);

        ImageButton bCall1 = (ImageButton) findViewById(R.id.bAccCall);
        ImageButton bWA1 = (ImageButton) findViewById(R.id.bAccWA);
        TextView link = (TextView) findViewById(R.id.AccForm);
        final long phn1=7688080223L;

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                Intent intent = new Intent(Accomodation.this, CampusAmbassadors.class);
                intent.putExtra("weblink", "https://docs.google.com/forms/d/e/1FAIpQLSdWeIXHyfydLeDCh6sDSKZZNNPlLMTFpopVz5GupL8OQuDSKw/viewform");
                startActivity(intent);
            }
        });


        bCall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { 

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phn1));
                startActivity(intent);
            }
        });

        bWA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { 

                Intent sendIntent = new Intent("android.intent.action.MAIN");
                sendIntent.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators("91" + phn1)+"@s.whatsapp.net");//phone number without "+" prefix
                startActivity(sendIntent);
            }
        });
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0,0);
    }
}
