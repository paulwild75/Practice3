package com.shiryaev.pavel.bsbo_08_19.practice3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long dateInMillis = System.currentTimeMillis();
                String format = "yyyy-mm-dd HH:mm:ss";
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
                String dateString = simpleDateFormat.format(new Date(dateInMillis));
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("date", dateString);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}