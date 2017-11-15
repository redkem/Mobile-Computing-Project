package com.example.codebind.drinkscannerdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onButtonClick(View v){
        if(v.getId() == R.id.button_login){

            EditText a = (EditText)findViewById(R.id.TFusername);
            String str = a.getText().toString();
            EditText b = (EditText)findViewById(R.id.TFpassword);
            String pass = b.getText().toString();

            String password = helper.searchPass(str);
            if(pass.equals(password)){

                Intent i = new Intent(MainActivity.this, Display.class);
                i.putExtra("username",str);
                startActivity(i);
            }
            else{
                Toast tmp = Toast.makeText(MainActivity.this, "Username and Password don't match", Toast.LENGTH_LONG);
                tmp.show();
            }


        }

        if(v.getId() == R.id.button2_signup){
            Intent i = new Intent(MainActivity.this, Signup.class);
            startActivity(i);
        }
    }
}
