package com.itcroc.itcroc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Social_ITcroc_web extends AppCompatActivity {

    private WebView webview;
    private ProgressBar spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social__itcroc_web);

        this.webview= (WebView)findViewById(R.id.webview_itcroc);
        WebSettings settings= webview.getSettings();
        settings.setJavaScriptEnabled(true);

        spinner=(ProgressBar)findViewById(R.id.progressBar);

        webview.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                spinner.setVisibility(View.VISIBLE);
                view.loadUrl(url);
                return true;
            }

            public void onPageFinished(WebView view, String url) {

                spinner.setVisibility(View.INVISIBLE);

            }
        });
        webview.loadUrl("http://www.itcroc.com");

    }
}
