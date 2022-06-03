package com.apple.hitrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button btn2, btn3, btn4;
    TextView editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        editText1 = findViewById(R.id.editText1);

        btn2.setOnClickListener(new View.OnClickListener() { // btn2 버튼 클릭시
            @Override
            public void onClick(View view) {
                //데이터를 가지고 와서,
                String s11 = editText1.getText().toString();

                if (s11.equals("무릉계곡")) { // 입력값이 무릉계곡이면
                    Toast.makeText(getApplicationContext(), // Toast 만들고 내 어플에서 호출
                            "정답입니다ㅏㅏㅏㅏㅏㅏ!!!!@@@@!!!!",
                            Toast.LENGTH_SHORT
                    ).show(); // text 호출하기
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://10.0.2.2:8080/trip/main.jsp")
                    ); // Url 주소로 이동하기
                    startActivity(intent); // 연결하기
                }
                else { // 입력값이 다르면
                    Toast.makeText(getApplicationContext(), // Toast 만들고 내 어플에서 호출
                            "다시한번생각해보세요 ㅜㅜ",
                            Toast.LENGTH_SHORT
                    ).show(); // text 호출하기
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() { // btn2 버튼 클릭시
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,
                        MainActivity.class // Main2Activity >>> MainActivity로 이동
                );
                startActivity(intent); // 연결하기

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() { // btn2 버튼 클릭시
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,
                        Main3Activity.class // Main2Activity >>> Main3Activity로 이동
                );
                startActivity(intent); // 연결하기
            }
        });
    }
}
