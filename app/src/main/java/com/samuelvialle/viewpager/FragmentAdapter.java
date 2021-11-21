package com.samuelvialle.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull @org.jetbrains.annotations.NotNull
                                   FragmentManager fragmentManager, @NonNull @org.jetbrains.annotations.NotNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Fragment createFragment(int position) {

        switch (position) {
            case 0:
                return new F01Fragment();
            case 1:
                return new F02Fragment();
            case 2:
                return new F03Fragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
