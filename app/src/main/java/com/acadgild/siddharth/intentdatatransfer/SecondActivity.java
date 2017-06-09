package com.acadgild.siddharth.intentdatatransfer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by siddharth on 6/10/2017.
 */

public class SecondActivity extends Activity {

    private TextView mtv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondlayout);

        Intent intent = getIntent();
        String username = intent.getExtras().getString("Nm");
        mtv = (TextView)findViewById(R.id.textView);
        mtv.setText("Welcome "+username);

    }
}
