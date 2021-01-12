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

public class form_Giao_dich extends AppCompatActivity {

    EditText edtDate;
    ImageButton chonngay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form__giao_dich);
        edtDate=(EditText)findViewById(R.id.ngay);
        chonngay=findViewById(R.id.chonngay);
        chonngay.setEnabled(false);
        edtDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chonngay();
            }
        });

    }
    private void chonngay(){
        Calendar calendar=Calendar.getInstance();
        int Ngays=calendar.get(Calendar.DATE);
        int Thangs=calendar.get(Calendar.MONTH);
        int Nams=calendar.get(Calendar.YEAR);
        DatePickerDialog datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(year,month,dayOfMonth);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
                edtDate.setText(simpleDateFormat.format(calendar.getTime()));
            }
        },Nams,Thangs,Ngays);
        datePickerDialog.show();
    }


    public void chonngay(View view) {
        edtDate=(EditText)findViewById(R.id.ngay);
        chonngay();

    }

    public void tinhtong(View view) {

    }
}