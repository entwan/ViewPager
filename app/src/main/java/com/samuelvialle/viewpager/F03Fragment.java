package com.samuelvialle.viewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class F03Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Encapsulation dans une vue
        View view = inflater.inflate(R.layout.fragment_f03, container, false);
        return view;
    }
}