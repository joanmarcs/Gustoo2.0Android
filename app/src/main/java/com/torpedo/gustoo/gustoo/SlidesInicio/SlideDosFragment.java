package com.torpedo.gustoo.gustoo.SlidesInicio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.torpedo.gustoo.gustoo.R;

/**
 * Created by JoanMarc on 21/2/17.
 */

public class SlideDosFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_slide_dos, container, false);

        //TextView tv = (TextView) v.findViewById(R.id.tvFragFirst);
        //tv.setText(getArguments().getString("msg"));

        return v;
    }

    public static SlideDosFragment newInstance(String text) {

        SlideDosFragment f = new SlideDosFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }

}
