package com.example.zhangjiawen.ttms2.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.zhangjiawen.ttms2.Fragment.FilmFragment;
import com.example.zhangjiawen.ttms2.Fragment.MeFragment;
import com.example.zhangjiawen.ttms2.Fragment.PeopleFragment;
import com.example.zhangjiawen.ttms2.Fragment.StudioFragment;

/**
 * Created by zhangjiawen on 2018/6/11.
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    private String[] mTitles = new String[]{"影院管理" , "人员管理" , "影厅管理" , "我的"};

    public MyViewPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1){
            return new PeopleFragment();
        } else if (position == 2){
            return new StudioFragment();
        } else if (position == 3){
            return new MeFragment();
        }
        return new FilmFragment();
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
