package com.main.bexperiment.opleidingen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import com.main.bexperiment.R;
import com.main.bexperiment.opleidingen.OpleidingenData;

import org.w3c.dom.Text;

public class Pop extends Activity {

    private TextView title, date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_opleidingen);

        String title_text = getIntent().getStringExtra("opleiding-title");
        String date_text = getIntent().getStringExtra("opleiding-date");
        String[] content_text = getIntent().getStringArrayExtra("opleiding-content");

        title = (TextView) findViewById(R.id.title);
        date = (TextView) findViewById(R.id.date);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;

        getWindow().setLayout((int) (width * 0.8), (int) (height * 0.8));

        title.setText(title_text);
        date.setText(date_text);
    }
}
