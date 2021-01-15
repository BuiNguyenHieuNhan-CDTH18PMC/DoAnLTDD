package com.example.demo11_11.ThanhToan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.demo11_11.R;

public class form_Ghe extends AppCompatActivity implements View.OnClickListener{
    Button btnA1, btnA2,btnA3,btnA4,btnA5,btnA6;
    Button btnB1, btnB2,btnB3,btnB4,btnB5,btnB6;
    Button btnC1, btnC2,btnC3,btnC4,btnC5,btnC6;
    Button btnD1, btnD2,btnD3,btnD4,btnD5,btnD6;
    Button btnE1, btnE2,btnE3,btnE4,btnE5,btnE6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form__ghe);
        btnA1 = findViewById(R.id.btnA1);
        btnA2 = findViewById(R.id.btnA2);
        btnA3 = findViewById(R.id.btnA3);
        btnA4 = findViewById(R.id.btnA4);
        btnA5 = findViewById(R.id.btnA5);
        btnA6 = findViewById(R.id.btnA6);
        btnB1= findViewById(R.id.btnB1);
        btnB2 = findViewById(R.id.btnB2);
        btnB3 = findViewById(R.id.btnB3);
        btnB4 = findViewById(R.id.btnB4);
        btnB5 = findViewById(R.id.btnB5);
        btnB6 = findViewById(R.id.btnB6);
        btnC1 = findViewById(R.id.btnC1);
        btnC2 = findViewById(R.id.btnC2);
        btnC3 = findViewById(R.id.btnC3);
        btnC4 = findViewById(R.id.btnC4);
        btnC5 = findViewById(R.id.btnC5);
        btnC6 = findViewById(R.id.btnC6);
        btnD1 = findViewById(R.id.btnD1);
        btnD2 = findViewById(R.id.btnD2);
        btnD3 = findViewById(R.id.btnD3);
        btnD4 = findViewById(R.id.btnD4);
        btnD5 = findViewById(R.id.btnD5);
        btnD6 = findViewById(R.id.btnD6);
        btnE1 = findViewById(R.id.btnE1);
        btnE2 = findViewById(R.id.btnE2);
        btnE3 = findViewById(R.id.btnE3);
        btnE4 = findViewById(R.id.btnE4);
        btnE5 = findViewById(R.id.btnE5);
        btnE6 = findViewById(R.id.btnE6);
        btnA1.setOnClickListener(this);
        btnA2.setOnClickListener(this);
        btnA3.setOnClickListener(this);
        btnA4.setOnClickListener(this);
        btnA5.setOnClickListener(this);
        btnA6.setOnClickListener(this);
        btnB1.setOnClickListener(this);
        btnB2.setOnClickListener(this);
        btnB3.setOnClickListener(this);
        btnB4.setOnClickListener(this);
        btnB5.setOnClickListener(this);
        btnB6.setOnClickListener(this);
        btnC1.setOnClickListener(this);
        btnC2.setOnClickListener(this);
        btnC3.setOnClickListener(this);
        btnC4.setOnClickListener(this);
        btnC5.setOnClickListener(this);
        btnC6.setOnClickListener(this);
        btnD1.setOnClickListener(this);
        btnA2.setOnClickListener(this);
        btnD2.setOnClickListener(this);
        btnD3.setOnClickListener(this);
        btnD4.setOnClickListener(this);
        btnD5.setOnClickListener(this);
        btnD6.setOnClickListener(this);
        btnE1.setOnClickListener(this);
        btnE2.setOnClickListener(this);
        btnE3.setOnClickListener(this);
        btnE4.setOnClickListener(this);
        btnE5.setOnClickListener(this);
        btnE6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnA1:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnA2:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnA3:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnA4:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnA5:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnA6:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnB1:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnB2:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnB3:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnB4:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnB5:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnB6:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnC1:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnC2:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnC3:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnC4:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnC5:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnC6:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnD1:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnD2:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnD3:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnD4:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnD5:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnD6:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnE1:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnE2:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnE3:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnE4:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnE5:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
            case R.id.btnE6:{
                Intent intent = new Intent(this,ThanhToan .class);
                startActivity(intent);
            }
        }
    }
}