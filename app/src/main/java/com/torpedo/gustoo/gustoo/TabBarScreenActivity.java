package com.torpedo.gustoo.gustoo;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.torpedo.gustoo.gustoo.BottomNavigationBarFragments.AlertasFragment;
import com.torpedo.gustoo.gustoo.BottomNavigationBarFragments.ChefsFragment;
import com.torpedo.gustoo.gustoo.BottomNavigationBarFragments.DeseosFragment;
import com.torpedo.gustoo.gustoo.BottomNavigationBarFragments.ExploraFragment;
import com.torpedo.gustoo.gustoo.BottomNavigationBarFragments.PerfilFragment;

public class TabBarScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_bar_screen);

        //getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLEView.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        getWindow().setStatusBarColor(Color.BLACK);

        getSupportActionBar().setDisplayShowTitleEnabled(false);


        final FragmentManager fragmentManager = getSupportFragmentManager();
        final Fragment fragment1 = new ExploraFragment();
        final Fragment fragment2 = new ChefsFragment();
        final Fragment fragment3 = new DeseosFragment();
        final Fragment fragment4 = new AlertasFragment();
        final Fragment fragment5 = new PerfilFragment();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flContainer, fragment1).commit();


        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);


        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_home:

                                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                                fragmentTransaction.replace(R.id.flContainer, fragment1).commit();

                                return true;
                            case R.id.action_chefs:

                                FragmentTransaction fragmentTransaction2 = fragmentManager.beginTransaction();
                                fragmentTransaction2.replace(R.id.flContainer, fragment2).commit();

                                return true;
                            case R.id.action_deseos:

                                FragmentTransaction fragmentTransaction3 = fragmentManager.beginTransaction();
                                fragmentTransaction3.replace(R.id.flContainer, fragment3).commit();

                                return true;
                            case R.id.action_notifications:

                                FragmentTransaction fragmentTransaction4 = fragmentManager.beginTransaction();
                                fragmentTransaction4.replace(R.id.flContainer, fragment4).commit();

                                return true;
                            case R.id.action_profile:

                                FragmentTransaction fragmentTransaction5 = fragmentManager.beginTransaction();
                                fragmentTransaction5.replace(R.id.flContainer, fragment5).commit();

                                return true;
                        }
                        return false;
                    }
                });
    }

}
