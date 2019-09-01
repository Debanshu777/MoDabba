package com.example.modabba;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.modabba.LunchDinnerFragment.DinnerFragment;
import com.example.modabba.LunchDinnerFragment.LunchFragment;

import java.util.List;

public class MyAdapter extends FragmentPagerAdapter {

    private int tabCount;
    private Context context;
    private String[] tabTitles = new String[]{"Lunch", "Dinner"};


    public MyAdapter(FragmentManager fm, int tabCount)
    {
        super(fm);
        this.tabCount = tabCount;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new LunchFragment();
            case 1:
                return new DinnerFragment();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}