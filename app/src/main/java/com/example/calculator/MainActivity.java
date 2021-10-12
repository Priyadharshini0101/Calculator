wpackage com.example.calculator;


import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {//implements NavigationViewListener

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);//toolbar casting
        setSupportActionBar(toolbar);//sets the Action bar
        drawer = findViewById(R.id.drawer_layout);//drawer cast
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation);//navigation view casting
        navigationView.setNavigationItemSelectedListener(this);//navigation view settings listener
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
      getSupportActionBar().setTitle(R.string.Standard);
      ActionBar actionBar;
        toggle.syncState();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new Standard())
                    .commit();
            navigationView.setCheckedItem((R.id.Standard));
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.Standard:

                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.slide_in,  // enter
                                R.anim.fade_out,  // exit
                                R.anim.fade_in,   // popEnter
                                R.anim.slide_out  // popExit
                        )
                        .replace(R.id.fragment_container, new Standard())
                        .commit();
                getSupportActionBar().setTitle(R.string.Standard);

                break;
            case R.id.Scientific:

                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.slide_in,  // enter
                                R.anim.fade_out,  // exit
                                R.anim.fade_in,   // popEnter
                                R.anim.slide_out  // popExit
                        )
                        .replace(R.id.fragment_container, new Scientific())
                        .commit();
                getSupportActionBar().setTitle(R.string.Scientific);
              getSupportActionBar().setTitle("Scientific");
                break;
            case R.id.Programmer:

                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.slide_in,  // enter
                                R.anim.fade_out,  // exit
                                R.anim.fade_in,   // popEnter
                                R.anim.slide_out  // popExit
                        )
                        .replace(R.id.fragment_container, new Programmer())
                        .commit();
                getSupportActionBar().setTitle("Programmer");
                break;
            case R.id.UnitConverter:

                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.slide_in,  // enter
                                R.anim.fade_out,  // exit
                                R.anim.fade_in,   // popEnter
                                R.anim.slide_out  // popExit
                        )
                        .replace(R.id.fragment_container, new UnitConvertor())
                        .commit();
                getSupportActionBar().setTitle("UnitConverter");
                break;
        }
        drawer.closeDrawer((GravityCompat.START));
        return true;
    }


    @Override
    public void onBackPressed() {

        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }




}
