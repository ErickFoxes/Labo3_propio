package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.labo3.utils.AppConstants;

public class MainActivity extends AppCompatActivity {
    Button boton;
    Button boton2;
    private  static final String TAG=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton=findViewById(R.id.btn_primerboton);
        boton2=findViewById(R.id.btn_segundoboton);
        boton.setOnClickListener(v->{
            Intent mIntent=new Intent(MainActivity.this,la2.class);
            mIntent.putExtra(AppConstants.TEXT_KEY,"New Activity, Skrtt");
            startActivity(mIntent);
        });
        boton2.setOnClickListener(v -> {
            Intent mIntent = new Intent();
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.setType("text/plain");
            mIntent.putExtra(Intent.EXTRA_TEXT, "Ay mamáaaa");
            startActivity(mIntent);
        });
    }
}
