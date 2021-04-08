package com.AKB.Tugas1AKB_10118341;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 *Nama   : Muhammad Rijal Sulaeman
 *kelas  : IF-8
 *NIM    : 10118341
 *Tanggal Pengerjaan : 8 April 2021
 */

public class ProfilActivity extends AppCompatActivity {
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        back = (Button) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfilActivity.this, MainActivity.class));
            }
        });
    }
}