package com.example.suridipannitasayeed.starplex_project1;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.List;

import android.net.Uri;

public class dataAdapter2 extends RecyclerView.Adapter<dataAdapter2.MyViewHolder> {

    private List<MainActivity.Music> musicList;

    public class MyViewHolder extends RecyclerView.ViewHolder implements OnClickListener {

        public TextView title;
        public ImageView logo;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            logo = (ImageView) view.findViewById(R.id.logo);

        }


        @Override
        public void onClick(View v) {

        }
    }


    public dataAdapter2(List<MainActivity.Music> musicList) {
        this.musicList = musicList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MainActivity.Music music = musicList.get(position);
        holder.logo.setImageResource(music.getLogo());
        holder.title.setText(music.getTitle());

             if (position == 0) {
                 holder.itemView.setOnClickListener(new OnClickListener() {
                                                     @Override
                                                     public void onClick(View v) {
                                                         Intent intent = v.getContext().getPackageManager().getLaunchIntentForPackage("com.netflix.mediaclient");
                                                         if (intent != null) {
                                                             // We found the activity now start the activity
                                                             intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                                             v.getContext().startActivity(intent);
                                                         } else {
                                                             // Bring user to the market or let them choose an app?
                                                             intent = new Intent(Intent.ACTION_VIEW);
                                                             intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                                             intent.setData(Uri.parse("market://details?id=" + "com.netflix.mediaclient"));
                                                             v.getContext().startActivity(intent);
                                                         }
                                                     }
                                                 }

                 );


             } else if(position==1){

                 holder.itemView.setOnClickListener(new OnClickListener() {
                                                     @Override
                                                     public void onClick(View v) {
                                                         Intent intent = v.getContext().getPackageManager().getLaunchIntentForPackage("tunein.player");
                                                         if (intent != null) {
                                                             // We found the activity now start the activity
                                                             intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                                             v.getContext().startActivity(intent);
                                                         } else {
                                                             // Bring user to the market or let them choose an app?
                                                             intent = new Intent(Intent.ACTION_VIEW);
                                                             intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                                             intent.setData(Uri.parse("market://details?id=" + "tunein.player"));
                                                             v.getContext().startActivity(intent);
                                                         }
                                                     }
                                                 }

                 );
             }

        else{

                 holder.itemView.setOnClickListener(new OnClickListener() {
                                                        @Override
                                                        public void onClick(View v) {
                                                            Intent intent = v.getContext().getPackageManager().getLaunchIntentForPackage("com.soundcloud.android");
                                                            if (intent != null) {
                                                                // We found the activity now start the activity
                                                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                                                v.getContext().startActivity(intent);
                                                            } else {
                                                                // Bring user to the market or let them choose an app?
                                                                intent = new Intent(Intent.ACTION_VIEW);
                                                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                                                intent.setData(Uri.parse("market://details?id=" + "com.soundcloud.android"));
                                                                v.getContext().startActivity(intent);
                                                            }
                                                        }
                                                    }

                 );
             }

    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }
}