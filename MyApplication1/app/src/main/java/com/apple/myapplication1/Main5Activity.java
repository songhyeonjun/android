package com.apple.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // 네이버 이동
                        print("네이버로 가자");
                        Intent intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.naver.com")
                        );
                        startActivity(intent); // 연결하기
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() { // 전화걸기
            @Override
            public void onClick(View view) {
                print("전화 걸기");
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("tel:/01011112222")
                        );
                startActivity(intent); // 연결하기
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() { // Activiti 이동
            @Override
            public void onClick(View view) {
                print("갤러리 이동");
                Intent intent = new Intent(Main5Activity.this,
                        Main6Activity.class
                );
                startActivity(intent); // 연결하기
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() { // 끝내기
            @Override
            public void onClick(View view) {
                print("끝내기");
                finish();
            }
        });
    }
        public void print(String data) {
            Toast.makeText(getApplicationContext(), // Toast 만들고 내 어플에서 호출
                    data,
                    Toast.LENGTH_SHORT
            ).show();
    }
}
