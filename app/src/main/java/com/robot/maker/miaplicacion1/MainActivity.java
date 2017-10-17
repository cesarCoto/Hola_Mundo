package com.robot.maker.miaplicacion1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btn_click;
    TextView tv_hola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_click = (Button) findViewById(R.id.button_clickme);
        tv_hola = (TextView) findViewById(R.id.textView_hola_mundo);

        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_hola.setVisibility(View.VISIBLE);

            }
        });
    }
}
