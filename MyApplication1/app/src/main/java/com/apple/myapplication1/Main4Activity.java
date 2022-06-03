package com.apple.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    Button b11, b22, b33, b44, b55;
    TextView num1, num2;
    ImageView img1;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        b11 = findViewById(R.id.b11);
        b22 = findViewById(R.id.b22);
        b33 = findViewById(R.id.b33);
        b44 = findViewById(R.id.b44);
        b55 = findViewById(R.id.b55);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        img1 = findViewById(R.id.img1);
        result = findViewById(R.id.result);

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setImageResource(R.drawable.tour);
            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //데이터를 가지고 와서,
//                String s11 = num1.getText().toString();
//                String s22 = num2.getText().toString();
//
//                //정수로 변경하고
//                int i11 = Integer.parseInt(s11);
//                int i22 = Integer.parseInt(s22);

                int[] datas = input();

                //연산한 다음
                int sum = datas[0] + datas[1];

                //화면에 결과를 보여주세요.
                result.setText("결과는 " + sum);

            }
        });

        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] datas = input();
                //연산한 다음
                int sum = datas[0] - datas[1];

                //화면에 결과를 보여주세요.
                result.setText("결과는 " + sum);
            }
        }); //b33

        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] datas = input();
                //연산한 다음
                int sum = datas[0] * datas[1];

                //화면에 결과를 보여주세요.
                result.setText("결과는 " + sum);
            }
        }); //b44

        b55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] datas = input();
                //연산한 다음
                int sum = datas[0] / datas[1];

                //화면에 결과를 보여주세요.
                result.setText("결과는 " + sum);
            }
        }); //b55


    }

        //입력을 받아서, 정수로 변경해줌.
        public int[] input(){
            //데이터를 가지고 와서,
            String s11 = num1.getText().toString();
            String s22 = num2.getText().toString();

            //정수로 변경하고
            int i11 = Integer.parseInt(s11);
            int i22 = Integer.parseInt(s22);

            int[] values = new int[2];
            values[0] = i11;
            values[1] = i22;
            return values;


        }

}