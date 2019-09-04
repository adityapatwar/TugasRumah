package com.example.tugasrumah;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Email_Adapter extends RecyclerView.Adapter<Email_Adapter.ViewHolder> {
    private List<Email> EmailList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvtitle, tvsub, tvemail, tvtime;
        public ImageView ivicon;
        public ViewHolder(@NonNull View v) {
            super (v);
            tvtitle = v.findViewById (R.id.tv_title);
            tvsub = v.findViewById (R.id.tv_sub);
            tvemail = v.findViewById (R.id.tv_mail);
            tvtime = v.findViewById (R.id.tv_time);
            ivicon = v.findViewById (R.id.iv_icon);
        }
    }

    public Email_Adapter(List<Email> emailList) {
        this.EmailList = emailList;
    }

    @Override
    public Email_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v =
                LayoutInflater.from (parent.getContext ()).inflate (R.layout.activity_email__list, parent, false);
        ViewHolder vh = new ViewHolder (v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Email email = EmailList.get (position);
        holder.tvtitle.setText (email.getTitle ());
        holder.tvsub.setText (email.getSubtitle ());
        holder.tvemail.setText (email.getMail ());
        holder.tvtime.setText (email.getTime ());
        holder.ivicon.setImageResource (email.getPic ());

    }

    @Override
    public int getItemCount() {
        return EmailList.size ();
    }


}
