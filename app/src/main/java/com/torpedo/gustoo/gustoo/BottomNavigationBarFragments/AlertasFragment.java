package com.torpedo.gustoo.gustoo.BottomNavigationBarFragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.torpedo.gustoo.gustoo.R;
import com.torpedo.gustoo.gustoo.SlidesInicio.SlideUnoFragment;


public class AlertasFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_alertas, container, false);

        //TextView tv = (TextView) v.findViewById(R.id.tvFragFirst);
        //tv.setText(getArguments().getString("msg"));

        return v;
    }

    /*public static SlideUnoFragment newInstance(String text) {

        SlideUnoFragment f = new SlideUnoFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }*/
}
