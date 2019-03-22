package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.labo3.utils.AppConstants;

public class la2 extends AppCompatActivity {
    private TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_la2);
        mText=findViewById(R.id.tb_message);
        Intent mIntent = getIntent();
        if (mIntent!=null){
            mText.setText(((Intent) mIntent).getStringExtra(AppConstants.TEXT_KEY));
        }
    }
}
