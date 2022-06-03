package com.apple.hitrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    Button button;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button = findViewById(R.id.button);
        webView = findViewById(R.id.webview);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "웹사이트 이동",
                        Toast.LENGTH_SHORT
                        ).show();
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://ec2-3-34-145-18.ap-northeast-2.compute.amazonaws.com:8080/trip/main.jsp")
                );
                startActivity(intent);
            }
        });

        webView.setWebViewClient(new TripClient());
        // webVIew에 끼워 너어줄 객체를 하나 지정
        // url을 끼워넣어주는 객체를 WebviewClient
        // 사이트를 액티비티에 끼워넣을 떄
        // 여러 설장만 따로 해주어야 한다.
        // 여러 설정만을 담당하는 객체를 사용
        WebSettings webSet = webView.getSettings();

        webSet.setBuiltInZoomControls(true);
        webSet.setJavaScriptEnabled(true);
        webSet.setAllowContentAccess(true);
        webSet.setAppCacheEnabled(true);
        webSet.setDomStorageEnabled(true);
        webSet.setUseWideViewPort(true);
        webSet.setAllowFileAccess(true);
        webSet.setAllowFileAccessFromFileURLs(true);

        webView.loadUrl("http://ec2-3-34-145-18.ap-northeast-2.compute.amazonaws.com:8080/trip/main.jsp");
    }
}

class TripClient extends WebViewClient{

    // 오버라이드

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        return super.shouldOverrideUrlLoading(view, request);
    }
}