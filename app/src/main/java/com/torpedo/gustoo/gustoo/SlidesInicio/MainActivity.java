package com.torpedo.gustoo.gustoo.SlidesInicio;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.torpedo.gustoo.gustoo.R;
import com.torpedo.gustoo.gustoo.TabBarScreenActivity;

public class MainActivity extends FragmentActivity{

    Button mAccedeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        getWindow().setStatusBarColor(Color.TRANSPARENT);

        mAccedeButton = (Button) findViewById(R.id.button2);
        mAccedeButton.setTransformationMethod(null);

        mAccedeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TabBarScreenActivity.class);
                startActivity(intent);

            }
        });


        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {

                case 0: return SlideUnoFragment.newInstance("FirstFragment, Instance 1");
                case 1: return SlideDosFragment.newInstance("SecondFragment, Instance 1");
                case 2: return SlideTresFragment.newInstance("ThirdFragment, Instance 1");
                default: return SlideUnoFragment.newInstance("ThirdFragment, Default");
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }


}
