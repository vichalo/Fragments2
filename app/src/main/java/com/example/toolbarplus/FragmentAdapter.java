package com.example.toolbarplus;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {
    private static final int PAGE_COUNT = 6;
    private final String[] tabTitles = new String[] { "Tab Uno", "Tab Dos", "Tab Tres", "Tab Cuatro", "Tab Cinco", "Tab Seis" };

    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0 || position == 2 || position == 4) {
            return new Fragment1();
        } else {
            return new Fragment2();
        }
    }

    @Override
    public int getItemCount() {
        return PAGE_COUNT;
    }


}
