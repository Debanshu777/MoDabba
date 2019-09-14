package com.example.modabba;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.modabba.fragments.Dashboard;

public class OtpActivity extends AppCompatActivity {

    Button submit;
    EditText editText;
    String otp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        submit=findViewById(R.id.submit);
        submit.setClickable(false);
        submit.setBackgroundColor(808080);
        editText =findViewById(R.id.et_otp);
        otp=editText.toString();
        if(otp.length()==4)
            submit.setEnabled(true);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OtpActivity.this,MainActivity.class));
            }
        });
    }
}
