package com.example.supriseegg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 10;
        TextView counterTextView = findViewById(R.id.textView4_counter);
        counterTextView.setText(""+counter);


    }

    public void tap_the_egg(View view)
    {
        if(counter > 0)
        {
            counter--;
            TextView counterTextView = findViewById(R.id.textView4_counter);
            counterTextView.setText(""+counter);
            if(counter == 0)
            {
                ImageView ImageEgg = findViewById(R.id.imageView_egg);
            }
        }

    }

    public void reset(View view)
    {

    }
}