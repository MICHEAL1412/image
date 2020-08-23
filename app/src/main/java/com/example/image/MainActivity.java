package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout Popular,Coming_soon,Now_showing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {



            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Popular = (LinearLayout)findViewById(R.id.Popular);
            Coming_soon = (LinearLayout)findViewById(R.id.Coming_soon);
            Now_showing= (LinearLayout)findViewById(R.id.Now_showing);

    }
    public void Pop(View view){
        Popular.setVisibility(View.VISIBLE);
        Coming_soon.setVisibility(View.GONE);
        Now_showing.setVisibility(View.GONE);
    }
    public void coming(View view){
        Popular.setVisibility(View.GONE);
        Coming_soon.setVisibility(View.VISIBLE);
        Now_showing.setVisibility(View.GONE);
    }
    public void Now(View view){
        Popular.setVisibility(View.GONE);
        Coming_soon.setVisibility(View.GONE);
        Now_showing.setVisibility(View.VISIBLE);
    }
}