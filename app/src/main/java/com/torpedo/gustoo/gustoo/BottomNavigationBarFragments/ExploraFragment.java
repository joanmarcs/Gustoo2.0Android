package com.torpedo.gustoo.gustoo.BottomNavigationBarFragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.torpedo.gustoo.gustoo.R;
import com.torpedo.gustoo.gustoo.SlidesInicio.SlideUnoFragment;

import java.util.ArrayList;
import java.util.List;


public class ExploraFragment extends Fragment {


    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_explora, container, false);

        //TextView tv = (TextView) v.findViewById(R.id.tvFragFirst);
        //tv.setText(getArguments().getString("msg"));

        viewPager = (ViewPager) getView().findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) getView().findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        return v;
    }

    /*public static SlideUnoFragment newInstance(String text) {

        SlideUnoFragment f = new SlideUnoFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }*/

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OneFragment(), "ONE");
        adapter.addFragment(new TwoFragment(), "TWO");
        adapter.addFragment(new ThreeFragment(), "THREE");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
