package com.edge.starringharsh.EDGE.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.edge.starringharsh.EDGE.R;

public class ContactsView extends LinearLayout {

    private String name;
    private String phone;

    public ContactsView(Context context) {
        super(context);
    }

    public ContactsView(Context context, String name, String phone) {
        super(context);
        setData(context, name, phone);
    }

    public ContactsView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ContactsView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setData(Context context, String name, String phone) {
        this.name = name;
        this.phone = phone;
        setupViews(context);
    }

    private void setupViews(final Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.layout_contacts, this, true);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        setLayoutParams(params);

        TextView nameTv = findViewById(R.id.contacts_name);
        ImageButton phoneButton = findViewById(R.id.contacts_call);
        ImageButton whatsappButton = findViewById(R.id.contacts_wa);

        nameTv.setText(name);

        phoneButton.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phone));
            context.startActivity(intent);
        });

        whatsappButton.setOnClickListener(view -> {

            Intent sendIntent = new Intent("android.intent.action.MAIN");
            sendIntent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
            sendIntent.putExtra("jid",
                    "91" + phone + "@s.whatsapp.net");
            context.startActivity(sendIntent);
        });


    }
}
