package com.example.kariba.widgetbehavior;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          final TextView aboutme = (TextView)findViewById(R.id.about_me);
          final ImageView me = (ImageView)findViewById(R.id.me);
         final Button btn_cry = (Button)findViewById(R.id.btn_cry);

        btn_cry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                me.setImageResource(R.drawable.me);
                aboutme.setVisibility(View.VISIBLE);
                btn_cry.setVisibility(View.INVISIBLE);
            }
        });
    }
}
