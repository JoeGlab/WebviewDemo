package net.yoogloo.webviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);

        //Stops webView from opening URL in browser

        webView.setWebViewClient(new WebViewClient());

        //webView.loadUrl("http://www.joepulcinella.com");

        //load HTML directly into a webView

        webView.loadData("<html><body><h1>My First Heading</h1><p>My first paragraph.</p></body></html>", "text/html", "UTF-8");

    }
}
