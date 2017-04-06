package com.webdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weblayout);
        mWeb = new WebView(this);
        mWeb= (WebView)findViewById(R.id.web);
        mWeb.getSettings().setJavaScriptEnabled(true);

        mWeb.loadUrl("http://blog.csdn.net/l664675249/article/details/50850051");
        mWeb.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
               view.loadUrl(url);
                mWeb.getSettings().setAllowFileAccess(true);
                mWeb.getSettings().setBuiltInZoomControls(true);
                mWeb.getSettings().setSupportZoom(true);
                mWeb.getSettings().setUseWideViewPort(true);  //用户任意缩放
                return true;
            }
        });
    }



}
