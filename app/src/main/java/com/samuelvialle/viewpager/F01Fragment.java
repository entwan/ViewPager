package com.samuelvialle.viewpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class F01Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Encapsulation dans une vue
        View view = inflater.inflate(R.layout.fragment_f01, container, false);
        return view;
    }
}