package com.domikado.checkconnection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button btn;
    CheckInternet checkInternet;
    CheckInternerVersi2 chek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textCheck);
        btn = (Button) findViewById(R.id.button);
        textView.setText("click me to check internet");

        checkInternet = new CheckInternet(this); //agar tidak terjadi nullpointer

        //menggunakan cara atau class pertama
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkInternet.isConnected()){
                    Toast.makeText(MainActivity.this, "connected", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "NotConnected", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //menggunakan cara atau class yang kedua
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CheckInternerVersi2.checkInternet(MainActivity.this)){
                    Toast.makeText(MainActivity.this, "connected yooo", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "not Conneck", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
