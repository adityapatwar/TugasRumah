package com.example.tugasrumah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CardViewAditVersi extends AppCompatActivity {

    Button btnGuide;
    CardView cardview;
    ImageView image;
    TextView title, subtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_card_view_adit_versi);

        btnGuide = findViewById (R.id.btnguide);
        cardview = findViewById (R.id.CardView);
        image = findViewById (R.id.imageView3);
        title = findViewById (R.id.pagetitle);
        subtitle = findViewById (R.id.pagesubtitle);
        btnGuide.setText ("Show The HomeWork");

        viewmuncul (btnGuide, cardview, image, title, subtitle);
        init(cardview);
        init(image);
        init(title);
        init(subtitle);

    }

    private void init(View info) {
        info.setVisibility (View.GONE);
        info.setAlpha (0);
        info.setTranslationY (-200);
    }

    private void viewmuncul(final View v, final View muncul, final View muncul1, final View muncul2, final View muncul3) {
        v.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                muncul.setVisibility (View.VISIBLE);
                muncul.animate ().alpha (1).translationY (0).setDuration (800).start ();
                muncul1.setVisibility (View.VISIBLE);
                muncul1.animate ().alpha (1).translationY (0).setDuration (800).start ();
                muncul2.setVisibility (View.VISIBLE);
                muncul2.animate ().alpha (1).translationY (0).setDuration (800).start ();
                muncul3.setVisibility (View.VISIBLE);
                muncul3.animate ().alpha (1).translationY (0).setDuration (800).start ();
                viewilang (v, muncul, muncul1, muncul2, muncul3);
                btnGuide.setText ("Psssst Click Me");
            }
        });
    }

    private void viewilang(final View v, final View ilang, final View ilang1, final View ilang2, final View ilang3) {
        v.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                ilang.animate ().alpha (0).translationY (-200).setDuration (200).start ();
                ilang1.animate ().alpha (0).translationY (-100).setDuration (400).start ();
                ilang2.animate ().alpha (0).translationY (100).setDuration (500).start ();
                ilang3.animate ().alpha (0).translationY (200).setDuration (800).start ();
                Handler hand = new Handler ();
                Runnable nyaa = new Runnable () {
                    @Override
                    public void run() {
                        ilang.setVisibility (View.GONE);
                        ilang1.setVisibility (View.GONE);
                        ilang2.setVisibility (View.GONE);
                        ilang3.setVisibility (View.GONE);
                    }
                };
                hand.postDelayed (nyaa, 700);
                viewmuncul (v, ilang, ilang1, ilang2, ilang3);
                btnGuide.setText ("Show Again");
//
            }
        });
    }


}
