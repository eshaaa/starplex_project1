package com.example.suridipannitasayeed.starplex_project1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class dataAdapter extends RecyclerView.Adapter<dataAdapter.MyViewHolder> {

    private List<MainActivity.Movie> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);

        }
    }


    public dataAdapter(List<MainActivity.Movie> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MainActivity.Movie movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}