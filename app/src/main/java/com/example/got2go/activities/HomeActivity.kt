package com.example.got2go.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.got2go.R;
import com.example.got2go.fragments.HomeFragment;
import com.example.got2go.fragments.ProfileFragment;
import com.example.got2go.fragments.WikiFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.parse.ParseUser;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ActionBar actionBar;
        actionBar = getSupportActionBar();

        bottomNavigationView = findViewById(R.id.bottomNavigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.action_home:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.flContainer, new HomeFragment()).commit();
                        return true;
                    case R.id.action_wiki:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.flContainer, new WikiFragment()).commit();
                        return true;
                    case R.id.action_profile:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.flContainer, new ProfileFragment(ParseUser.getCurrentUser())).commit();
                        return true;
                    default:
                        return false;
                }
            }
        });
        bottomNavigationView.setSelectedItemId(R.id.action_home);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.logout, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.Logout) {
            ParseUser.logOut();
            ParseUser currentUser = ParseUser.getCurrentUser();
            goLoginActivity();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private void goLoginActivity() {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
        finish();
    }
}