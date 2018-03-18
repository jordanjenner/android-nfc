package com.example.jorda.noflimsycards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String NAME = "com.example.jorda.noflimsycards.NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the Log In button*/
    public void signIn(View view) {
        Intent intent = new Intent(this, DisplayUser.class);
        EditText editUser = (EditText) findViewById(R.id.editUser);
        String message = editUser.getText().toString();
        intent.putExtra(NAME, message);
        startActivity(intent);
    }
}
