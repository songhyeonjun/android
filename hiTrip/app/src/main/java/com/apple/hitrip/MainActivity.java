package com.apple.hitrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), // Toast 만들고 내 어플에서 호출
                        "화이팅", //
                        Toast.LENGTH_SHORT
                ).show(); // text 보여주기
                Intent intent = new Intent(MainActivity.this,
                        Main2Activity.class // MainActivity >>> Main2ACtiovity 이동
                );
                startActivity(intent); // 연결하기

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        Main4Activity.class // MainActivity >>> Main4ACtiovity 이동
                );
                startActivity(intent); // 연결하기

            }
        });
    }
}
