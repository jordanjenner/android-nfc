package com.example.jorda.noflimsycards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_user);

        /*Get the intent that started this activity and extract the string*/
        Intent displayUser = getIntent();
        String userid = displayUser.getStringExtra(MainActivity.NAME);

        /* Capture the layouts's TextView and set the string as its text*/
        TextView textWelcomeMessage = findViewById(R.id.textWelcomeMessage);
        textWelcomeMessage.setText("Welcome "+userid+", you are now signed in!");
        }

    public void signOut(View view)
    {
        finish();
        setContentView(R.layout.activity_main);
    }

    public void onBackPressed(View view)
    {
        finish();
        setContentView(R.layout.activity_main);
    }


    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);

        /* Destroy the NFC HCE service */


    }
}