package com.qoobico.remindme.adapter;


import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.qoobico.remindme.fragment.ExampleFragment;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter{

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Tab1",
                "Напоминания",
                "Tab2"
        };
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ExampleFragment.getInstance();

            case 1:
                return ExampleFragment.getInstance();

            case 2:
                return ExampleFragment.getInstance();

        }

        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
