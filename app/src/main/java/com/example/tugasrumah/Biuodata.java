package com.example.tugasrumah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Biuodata extends AppCompatActivity {

    Button btnshow;
    LinearLayout gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_biuodata);

        gambar = findViewById (R.id.ll_gambar);
        btnshow = findViewById (R.id.btn_show_image);

        viewmuncul (btnshow,gambar);
    }

    private void init(View info){
        info.setVisibility (View.GONE);
        info.setAlpha(0);
        info.setTranslationY(-200);
    }

    private void viewmuncul(final View v,final View muncul){
        v.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                muncul.setVisibility (View.VISIBLE);
                muncul.animate().alpha(1).translationY(0).setDuration(800).start();
                viewilang (v,muncul);
            }
        });
    }

    private void viewilang(final View v,final View ilang)
    {
        v.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                ilang.animate().alpha(0).translationY(-200).setDuration(800).start();
                Handler hand =  new Handler ();
                Runnable nyaa =  new Runnable () {
                    @Override
                    public void run() {
                        ilang.setVisibility (View.GONE);
                    }
                };
                hand.postDelayed (nyaa,700);
                viewmuncul(v,ilang);
//
            }
        });
    }
}
