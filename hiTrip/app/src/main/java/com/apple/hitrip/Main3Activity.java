package com.apple.hitrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button btn5, btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);

        btn5.setOnClickListener(new View.OnClickListener() { // btn5 버튼 클릭시
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        Main3Activity.this,
                        Main2Activity.class // Main3Activity >>> Main2Activity로 이동
                );
                startActivity(intent); // 연결하기
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() { // btn5 버튼 클릭시
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://www.naver.com") // 해당 Url로 이동하기
                );
                startActivity(intent); // 연결하기
            }
        });
    }
}
