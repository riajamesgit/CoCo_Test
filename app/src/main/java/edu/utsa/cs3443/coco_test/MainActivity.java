package edu.utsa.cs3443.coco_test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    FeedFragment feedFragment = new FeedFragment();
    SearchFragment searchFragment = new SearchFragment();
    ConnectionsFragment connectionsFragment = new ConnectionsFragment();
    ProfileFragment profileFragment = new ProfileFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,feedFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.feed:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,feedFragment).commit();
                        return true;
                    case R.id.search:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,searchFragment).commit();
                        return true;
                    case R.id.connections:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,connectionsFragment).commit();
                        return true;
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,profileFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }
}