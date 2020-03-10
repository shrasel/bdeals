package com.shrasel.nearbydeals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intent = getIntent();
        String recvMsg = intent.getStringExtra(EXTRA_TEXT);

        TextView tv = (TextView) findViewById(R.id.recvMsg);
        tv.setText(recvMsg);
    }
}
