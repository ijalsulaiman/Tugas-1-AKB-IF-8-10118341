package com.AKB.Tugas1AKB_10118341;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 *Nama   : Muhammad Rijal Sulaeman
 *kelas  : IF-8
 *NIM    : 10118341
 *Tanggal Pengerjaan : 8 April 2021
 */

public class MainActivity extends AppCompatActivity {
     Button logout;
     ImageButton profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logout = (Button) findViewById(R.id.logout);
        profil = (ImageButton) findViewById(R.id.profil) ;

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProfilActivity.class));
            }
        });
    }
}
