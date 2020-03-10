package com.shrasel.nearbydeals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View view){
        EditText editTxtVal = (EditText) findViewById(R.id.send_msg_input);
        String msg = editTxtVal.getText().toString();
//        Intent intent = new Intent(this, ReceiveMessageActivity.class);
//        intent.putExtra("msg",msg);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, msg);
        startActivity(intent);
    }
}
