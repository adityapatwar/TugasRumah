package com.example.tugasrumah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    FrameLayout biodata1,biodata2,soal2,soal3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        biodata1 = findViewById (R.id.fl_adit);
        biodata1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent bioadit = new Intent (MainActivity.this,Biuodata.class);
                startActivity (bioadit);
            }
        });
        biodata2 = findViewById (R.id.fl_silvia);
        biodata2.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Menu Tidak Ditemukan", Toast.LENGTH_SHORT).show();
            }
        });
        soal2 = findViewById (R.id.fl_soal2);
        soal2.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent soal2 = new Intent (MainActivity.this,CardViewAditVersi.class);
                startActivity (soal2);
                Toast.makeText(MainActivity.this, "By Aditya Fatwa Ramadhan & Silvia", Toast.LENGTH_SHORT).show();
            }
        });
        soal3 = findViewById (R.id.fl_soal3);
        soal3.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent soal3 = new Intent (MainActivity.this,RecyclerView.class);
                startActivity (soal3);
                Toast.makeText(MainActivity.this, "By Aditya Fatwa Ramadhan", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
