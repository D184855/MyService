package com.example.myservice2feb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button start, stop, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);
        next = (Button) findViewById(R.id.next);

        start.setOnClickListener((View.OnClickListener) this);
        stop.setOnClickListener((View.OnClickListener) this);
        next.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.start:
                startService(new Intent(MainActivity.this, MyService.class));
                break;

            case R.id.stop:
                stopService(new Intent(MainActivity.this, MyService.class));
                break;

            case R.id.next:
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
                break;
        }
    }
}