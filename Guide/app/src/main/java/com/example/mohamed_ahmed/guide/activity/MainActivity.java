package com.example.mohamed_ahmed.guide.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.mohamed_ahmed.guide.Fragment.Cafe;
import com.example.mohamed_ahmed.guide.Fragment.cinema;
import com.example.mohamed_ahmed.guide.Fragment.club;
import com.example.mohamed_ahmed.guide.Fragment.museums;
import com.example.mohamed_ahmed.guide.Fragment.resturant;
import com.example.mohamed_ahmed.guide.R;

import static com.example.mohamed_ahmed.guide.R.id.Cafe;
import static com.example.mohamed_ahmed.guide.R.id.Cinema;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        android.app.FragmentManager fragmentManager = getFragmentManager();
        if (id == Cinema) {
            fragmentManager.beginTransaction().replace(R.id.content_main2, new cinema()).commit();
        } else if (id == R.id.Clubs) {
            fragmentManager.beginTransaction().replace(R.id.content_main2, new club()).commit();
        } else if (id == R.id.Museums) {
            fragmentManager.beginTransaction().replace(R.id.content_main2, new museums()).commit();
        } else if (id == R.id.Resturant) {
            fragmentManager.beginTransaction().replace(R.id.content_main2, new resturant()).commit();
        } else if (id == Cafe) {
            fragmentManager.beginTransaction().replace(R.id.content_main2, new Cafe()).commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
