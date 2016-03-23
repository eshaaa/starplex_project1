package com.example.suridipannitasayeed.starplex_project1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActionBarDrawerToggle actionBarDrawerToggle;
    DrawerLayout drawerLayout;
    private dataAdapter mAdapter;
    private dataAdapter2 mAdapter1;
    private List<Movie> movieList = new ArrayList<>();
    private List<Music> musicList1 = new ArrayList<>();
    private List<Music> musicList2 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        RecyclerView recycle1=(RecyclerView)findViewById(R.id.recycler_view1);
        RecyclerView recycle2=(RecyclerView)findViewById(R.id.recycler_view2);
        RecyclerView recycle3=(RecyclerView)findViewById(R.id.recycler_view3);
        // RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        //recycle.addItemDecoration(new MarginDecoration(this));
        // recycle.setHasFixedSize(true);
        recycle1.setLayoutManager(new GridLayoutManager(this, 3));
        //recycle.setLayoutManager(mLayoutManager);
        mAdapter = new dataAdapter(movieList);
        recycle1.setAdapter(mAdapter);
        recycle2.setLayoutManager(new GridLayoutManager(this, 1));
        //recycle.setLayoutManager(mLayoutManager);
        mAdapter1 = new dataAdapter2(musicList1);
        recycle2.setAdapter(mAdapter1);
        recycle3.setLayoutManager(new GridLayoutManager(this, 1));
        //recycle.setLayoutManager(mLayoutManager);
        mAdapter1 = new dataAdapter2(musicList2);
        recycle3.setAdapter(mAdapter1);
        prepareMovieData();
        prepareMusicData1();
        prepareMusicData2();
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //toolbar.setNavigationIcon(R.drawable.drawer);
        drawerLayout = (DrawerLayout) findViewById(R.id.navigation_drawer);
        setSupportActionBar(toolbar);
        //drawerLayout.openDrawer(Gravity.END);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name){
            public void onDrawerClosed(View view) {

                // calling onPrepareOptionsMenu() to show action bar icons
                //  invalidateOptionsMenu();
                super.onDrawerClosed(view);
            }

            public void onDrawerOpened(View drawerView) {


                super.onDrawerClosed(drawerView);
            }


            @Override
            public boolean onOptionsItemSelected(android.view.MenuItem item) {
                if (item != null && item.getItemId() == R.id.btnMyMenu) {
                    Toast.makeText(getApplicationContext(), "msg msg", Toast.LENGTH_SHORT).show();

                    if (drawerLayout.isDrawerOpen(Gravity.RIGHT)) {
                        drawerLayout.closeDrawer(Gravity.RIGHT);
                    } else {
                        drawerLayout.openDrawer(Gravity.RIGHT);
                    }
                    return true;
                }
                return false;
            }

        };
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(false);
*/

        // drawerLayout.openDrawer(Gravity.END);
    }
    private void prepareMovieData() {
        Movie movie = new Movie("Mad Max: Fury Road");
        movieList.add(movie);

        movie = new Movie("Inside Out");
        movieList.add(movie);

        movie = new Movie("Star Wars");
        movieList.add(movie);

        movie = new Movie("Shaun the Sheep");
        movieList.add(movie);

        movie = new Movie("The Martian");
        movieList.add(movie);

        movie = new Movie("Mission");
        movieList.add(movie);

        movie = new Movie("Up");
        movieList.add(movie);

        movie = new Movie("Star Trek");
        movieList.add(movie);

        movie = new Movie("The LEGO Movie");
        movieList.add(movie);

        movie = new Movie("Iron Man");
        movieList.add(movie);

        movie = new Movie("Aliens");
        movieList.add(movie);

        movie = new Movie("Chicken Run");
        movieList.add(movie);

        movie = new Movie("Back to the Future");
        movieList.add(movie);

        movie = new Movie("Raiders of the Lost Ark");
        movieList.add(movie);

        movie = new Movie("Goldfinger");
        movieList.add(movie);

        movie = new Movie("Guardians of the Galaxy");
        movieList.add(movie);

        mAdapter.notifyDataSetChanged();
    }
    private void prepareMusicData1() {
        Music music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList1.add(music);

         music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList1.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList1.add(music);

         music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList1.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList1.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList1.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList1.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList1.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList1.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList1.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList1.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList1.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList1.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList1.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList1.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList1.add(music);

        mAdapter.notifyDataSetChanged();
    }
    private void prepareMusicData2() {
        Music music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList2.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList2.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList2.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList2.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList2.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList2.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList2.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList2.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList2.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList2.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList2.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList2.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList2.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList2.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList2.add(music);

        music = new Music(R.drawable.ic_launcher, "Music Name");
        musicList2.add(music);

        mAdapter.notifyDataSetChanged();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(android.view.MenuItem item) {
        if (item != null && item.getItemId() == R.id.btnMyMenu) {
            Toast.makeText(getApplicationContext(), "msg msg", Toast.LENGTH_SHORT).show();

            if (drawerLayout.isDrawerOpen(Gravity.RIGHT)) {
                drawerLayout.closeDrawer(Gravity.RIGHT);
            } else {
                drawerLayout.openDrawer(Gravity.RIGHT);
            }
            return true;
        }
        return false;
    }

    public static class Movie {
        private String title, genre, year;

        public Movie() {
        }

        public Movie(String title) {
            this.title = title;

        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String name) {
            this.title = name;
        }


    }
    public static class Music {
        private String title;
        private  int logo;

        public Music() {
        }

        public Music(int logo, String title) {
            this.logo = logo;
            this.title = title;

        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String name) {
            this.title = name;
        }

        public int getLogo() {
            return logo;
        }

        public void setLogo(int Logo) {
            this.logo = logo;
        }


    }
}
