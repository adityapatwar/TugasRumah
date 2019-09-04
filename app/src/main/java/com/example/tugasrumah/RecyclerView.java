package com.example.tugasrumah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView mRecyclerView;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager mLayoutManager;
    private List<Email> emailList;
    private Email_Adapter emailAdapter;
    String[] Title = {"Sam", "Facebook", "Google+",
            "Twitter", "Pintereset Weekly", "Josh"
            };

    String[] Sub = {"Weekend Adventure", "James, you have 1 new notification", "Tap Sugested Google+ pages for you", "Follow T-Mobile,Samsung Mobile U",
            "Pins you'll love !", "GoingLunch"
           };
    String[] Mail = {"Lets go fishing with john and other","a Lot has Happend","Tap Sugested Google+ pages for you","jams,some pople you know","Have You see","Dont Forget"};

    String[] Time = {"10:42am","16:04pm","18:44pm","20:04pm","09:04am","01:04am"};

    int[] pics = {
            R.drawable.s,
            R.drawable.f,
            R.drawable.g,
            R.drawable.t,
            R.drawable.p,
            R.drawable.j,
    };

    int start = R.drawable.ic_star_gold_24dp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_recycler_view);
        mRecyclerView = findViewById(R.id.recycler_view);


        mLayoutManager = new LinearLayoutManager (this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        emailList = new ArrayList<> ();
        for (int i = 0; i < Title.length; i++) {
            Email email = new Email (Title[i], Sub[i], Mail[i],Time[i], pics[i]);
            emailList.add (email);
        }

        emailAdapter = new Email_Adapter (emailList);

        mRecyclerView.setAdapter(emailAdapter);
        emailAdapter.notifyDataSetChanged();

//        ImageView ivico = findViewById (R.id.iv_icon);

        mRecyclerView.addOnItemTouchListener(new StartClick (this,
                new StartClick.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
//                        Toast.makeText(RecyclerView.this, "Card at " + position + " is clicked", Toast.LENGTH_SHORT).show();
//                        emailList.set Title[position], Sub[position], Mail[position], Time[position], pics[start]);
//
//                        emailList.set (position,email);
                    }
                }));
    }


}
