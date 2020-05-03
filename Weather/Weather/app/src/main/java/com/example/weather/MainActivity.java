package com.example.weather;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendButton = findViewById(R.id.button);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTextView(v);
            }
        });
    }

    /**
     * テキストラベルを変更する.
     *
     * @param view view
     */
    public void changeTextView(View view) {
        // 非同期処理(AsyncHttpRequest#doInBackground())を呼び出す
        try {
            new AsyncHttpRequest(this).execute(new URL("http://weather.livedoor.com/forecast/webservice/json/v1?city=110010"));

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
