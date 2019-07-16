package com.example.androidchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// Called when user clicks on button_1

    public void web_view(View view) {WebView mywebview = (WebView) findViewById(R.id.webView1);
        mywebview.loadUrl("https://andela.com/alc/");
    }
    // Called when user clicks on button_2
    public void Profile_view(View view) {Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }
}
