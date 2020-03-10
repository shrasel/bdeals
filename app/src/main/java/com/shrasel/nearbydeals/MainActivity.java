package com.shrasel.nearbydeals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "App Activity: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(getApplicationContext(),"Step : On Create", Toast.LENGTH_SHORT);
//        toast.setGravity(Gravity.TOP |Gravity.LEFT, 0, 20);
        toast.show();
        Log.i(TAG,"Step : On Create");
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

    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(getApplicationContext(),"Step : On Start", Toast.LENGTH_SHORT);
//        toast.setGravity(Gravity.TOP |Gravity.LEFT, 0, 0);
        toast.show();
        Log.i(TAG,"Step : On Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"Step : On Stop", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"Step : On Stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"Step : On Restart", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"Step : On Restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"Step : On Pause", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"Step : On Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"Step : On Resume", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"Step : On Resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Step : On Destroy", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"Step : On Destroy");
    }

}
