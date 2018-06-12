package com.example.zhangjiawen.ttms2.Activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.zhangjiawen.ttms2.Adapter.MyViewPagerAdapter;
import com.example.zhangjiawen.ttms2.R;

/**
 * Created by zhangjiawen on 2018/6/6.
 */

public class MainActivity extends AppCompatActivity  {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private MyViewPagerAdapter myFragmentPagerAdapter;

    private TabLayout.Tab one;
    private TabLayout.Tab two;
    private TabLayout.Tab three;
    private TabLayout.Tab four;

//    private ViewPager mViewPager;
//    private IconTabPageIndicator mIndicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
//        initViews();
    }

    public void initView(){
        //使用适配器将ViewPager与Fragment绑定在一起
        mViewPager= (ViewPager) findViewById(R.id.viewpager);
        myFragmentPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(myFragmentPagerAdapter);

        //将TabLayout与ViewPager绑定在一起
        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mTabLayout.setupWithViewPager(mViewPager);

        //指定Tab的位置
        one = mTabLayout.getTabAt(0);
        two = mTabLayout.getTabAt(1);
        three = mTabLayout.getTabAt(2);
        four = mTabLayout.getTabAt(3);

        //设置Tab的图标，假如不需要则把下面的代码删去
        one.setIcon(R.mipmap.film);
        two.setIcon(R.mipmap.people);
        three.setIcon(R.mipmap.studio_24dp);
        four.setIcon(R.mipmap.me);
    }

//    private void initViews() {
//        mViewPager = (ViewPager) findViewById(R.id.viewpager);
//        mIndicator = (IconTabPageIndicator) findViewById(R.id.indicator);
//        List<BaseFragment> fragments = initFragments();
//        FragmentAdapter adapter = new FragmentAdapter(fragments, getSupportFragmentManager());
//        mViewPager.setAdapter(adapter);
//        mIndicator.setViewPager(mViewPager);
//    }
//
//    private List<BaseFragment> initFragments() {
//        List<BaseFragment> fragments = new ArrayList<BaseFragment>();
//
//        BaseFragment userFragment = new BaseFragment();
//        userFragment.setTitle("用户");
//        userFragment.setIconId(R.drawable.tab_user_selector);
//        fragments.add(userFragment);
//
//        BaseFragment noteFragment = new BaseFragment();
//        noteFragment.setTitle("记事本");
//        noteFragment.setIconId(R.drawable.tab_record_selector);
//        fragments.add(noteFragment);
//
//        BaseFragment contactFragment = new BaseFragment();
//        contactFragment.setTitle("联系人");
//        contactFragment.setIconId(R.drawable.tab_user_selector);
//        fragments.add(contactFragment);
//
//        BaseFragment recordFragment = new BaseFragment();
//        recordFragment.setTitle("记录");
//        recordFragment.setIconId(R.drawable.tab_record_selector);
//        fragments.add(recordFragment);
//
//        return fragments;
//    }
//
//    class FragmentAdapter extends FragmentPagerAdapter implements IconPagerAdapter {
//        private List<BaseFragment> mFragments;
//
//        public FragmentAdapter(List<BaseFragment> fragments, FragmentManager fm) {
//            super(fm);
//            mFragments = fragments;
//        }
//
//        @Override
//        public Fragment getItem(int i) {
//            return mFragments.get(i);
//        }
//
//        @Override
//        public int getIconResId(int index) {
//            return mFragments.get(index).getIconId();
//        }
//
//        @Override
//        public int getCount() {
//            return mFragments.size();
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return mFragments.get(position).getTitle();
//        }
//    }


   }
