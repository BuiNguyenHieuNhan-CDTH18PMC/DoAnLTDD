package com.example.demo11_11.InfoUser;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.demo11_11.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class form_Thong_Tin extends AppCompatActivity {
    EditText edtDate;
    EditText editText;
    ImageButton imagexoa;
    ImageButton imagerap;
    ImageButton imagekhuvuc;
    ImageButton chonngay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form__thong__tin);
        editText = findViewById(R.id.editTextHoTen);
        imagexoa = findViewById(R.id.imagexoa);
        imagexoa.setEnabled(false);
        imagerap= findViewById(R.id.imagerap);
        imagerap.setEnabled(false);
        imagekhuvuc=findViewById(R.id.imagekhuvuc);
        imagekhuvuc.setEnabled(false);
        chonngay=findViewById(R.id.chonngay);
        chonngay.setEnabled(false);

    }


    public void xoa(View view) {
        editText.setText("");
    }

    public void sua(View view) {
        imagexoa.setEnabled(true);
        imagerap.setEnabled(true);
        imagekhuvuc.setEnabled(true);
        chonngay.setEnabled(true);
    }
}