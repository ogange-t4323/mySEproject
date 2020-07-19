package com.Group6.checkup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.Group6.checkup.Entities.Admin;
import com.Group6.checkup.Entities.Cashier;
import com.Group6.checkup.Entities.Doctor;
import com.Group6.checkup.Entities.Patient;
import com.Group6.checkup.Utils.Dao.AdminDao;
import com.Group6.checkup.Utils.Dao.CashierDao;
import com.Group6.checkup.Utils.Dao.DoctorDao;
import com.Group6.checkup.Utils.Dao.PatientDao;
import com.Group6.checkup.Utils.Session;

public class LoginActivity extends AppCompatActivity {
    Session appSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        appSession = new Session(getApplicationContext());

        final EditText editText_id = findViewById(R.id.editText_id);
        final EditText editText_password = findViewById(R.id.editText_password);
        Button button_login = findViewById(R.id.button_login);
        Button sign_up = findViewById(R.id.sign_up);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}


