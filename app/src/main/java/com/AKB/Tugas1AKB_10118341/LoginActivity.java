package com.AKB.Tugas1AKB_10118341;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.text.Html.fromHtml;

/**
 *Nama   : Muhammad Rijal Sulaeman
 *kelas  : IF-8
 *NIM    : 10118341
 *Tanggal Pengerjaan : 7 April 2021
 */

public class LoginActivity extends AppCompatActivity {
    EditText Username, Password;
    Button btnlogin;
    DBHelper dbhelper;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

            Username = (EditText) findViewById(R.id.username);
            Password = (EditText) findViewById(R.id.pass);
            btnlogin = (Button) findViewById(R.id.login);

            dbhelper = new DBHelper(this);

            TextView register = findViewById(R.id.register);
            register.setText(fromHtml("Belum mempunyai akun?, " +
                    "</font><font color='#3b5998'>Klik disini</font>"));
            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                }
            });

            btnlogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String username = Username.getText().toString().trim();
                    String password = Password.getText().toString().trim();

                    Boolean res = dbhelper.checkUser(username, password);
                    if(res == true){
                        Toast.makeText(LoginActivity.this, "Login berhasil", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    }else{
                        Toast.makeText(LoginActivity.this, "Login gagal", Toast.LENGTH_SHORT).show();
                    }
                }
            });

    }
    public static Spanned fromHtml(String html){
        Spanned result;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        }else {
            result = Html.fromHtml(html);
        }
        return result;
    }

}