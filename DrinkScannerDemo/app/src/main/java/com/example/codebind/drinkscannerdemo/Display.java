package com.example.codebind.drinkscannerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by redonakembora on 11/15/17.
 */

public class Display extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        String username = getIntent().getStringExtra("username");

        TextView tv = (TextView)findViewById(R.id.TVusername);
        tv.setText(username);

    }


}
