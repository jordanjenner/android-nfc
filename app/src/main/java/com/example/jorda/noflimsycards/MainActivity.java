package com.example.jorda.noflimsycards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String NAME = "com.example.jorda.noflimsycards.NAME";
    public static String userId = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /** Called when the user taps the Log In button*/

    public void clearEditText()
    {
        EditText editUser = findViewById(R.id.editUser);
        EditText editPass = findViewById(R.id.editPass);
        editUser.setText("");
        editPass.setText("");
    }
    public void signIn(View view) {
        EditText editUser = findViewById(R.id.editUser);
        EditText editPass = findViewById(R.id.editPass);
        String user = editUser.getText().toString();
        String pass = editPass.getText().toString();

        /* Checks if the user has entered a username and password and provides feedback if they havent */
        if (user.matches("") && pass.matches(""))
        {
            TextView tv1 = (TextView)findViewById(R.id.textView2);
            tv1.setText(getResources().getString(R.string.blankUserPass));
            return;
        }

        /* Checks if the user has entered a username and provides feedback if they havent*/
        else if (user.matches(""))
        {
            TextView tv1 = (TextView)findViewById(R.id.textView2);
            tv1.setText(getResources().getString(R.string.blankUser));
            return;
        }

        /* Checks if the user has entered a password and provides feedback if they havent*/
        else if (pass.matches(""))        {
            TextView tv1 = (TextView)findViewById(R.id.textView2);
            tv1.setText(getResources().getString(R.string.blankPass));
            return;
        }

        /* A terrible form of authentication just for the prototype*/
        else if (user.matches("jordan1") && pass.matches("password1") ||
                 user.matches("andrius1" ) && pass.matches("password1") ||
                 user.matches("abdul1" ) && pass.matches("password1") ||
                 user.matches("lina1" ) && pass.matches("password1") ||
                 user.matches("kaleem1") && pass.matches("password1"))
        {
            Intent intent = new Intent(this, DisplayUser.class);
            MainActivity.userId = user;
            intent.putExtra(NAME, userId);
            startActivity(intent);
            TextView tv1 = (TextView)findViewById(R.id.textView2);
            tv1.setText(getResources().getString(R.string.empty));
            clearEditText();
            return;
        }


        /* If the username and password dont meet the auth requirements this gives feedback telling
            the user they have entered an invalid username/password combination*/
        else;
        {
            TextView tv1 = (TextView)findViewById(R.id.textView2);
            tv1.setText(getResources().getString(R.string.invalidUserPass));
            return;
        }

    }
}
