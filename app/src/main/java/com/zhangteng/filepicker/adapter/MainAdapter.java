package com.zhangteng.filepicker.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.zhangteng.audiopicker.fragment.AudioPickerFragment;
import com.zhangteng.baselibrary.base.BaseFragment;
import com.zhangteng.documentpicker.fragment.DocumentPickerFragment;
import com.zhangteng.folderpicker.fragment.FolderPickerFragment;
import com.zhangteng.imagepicker.fragment.ImagePickerFragment;
import com.zhangteng.rarpicker.fragment.RarPickerFragment;
import com.zhangteng.videopicker.fragment.VideoPickerFragment;

import java.util.ArrayList;

/**
 * Created by Lanxumit on 2017/11/24.
 */

public class MainAdapter extends FragmentPagerAdapter {
    private String[] titles = {"image", "video", "audio", "rar", "document", "folder"};
    private ArrayList<Fragment> fragmentlist = new ArrayList<Fragment>();

    public MainAdapter(FragmentManager fm) {
        super(fm);
    }

    public ArrayList<Fragment> getFragmentlist() {
        return fragmentlist;
    }

    @Override
    public Fragment getItem(int position) {
        BaseFragment fragment = null;
        switch (position) {
            case 0:
                fragment = new ImagePickerFragment();
                break;
            case 1:
                fragment = new VideoPickerFragment();
                break;
            case 2:
                fragment = new AudioPickerFragment();
                break;
            case 3:
                fragment = new RarPickerFragment();
                break;
            case 4:
                fragment = new DocumentPickerFragment();
                break;
            case 5:
                fragment = new FolderPickerFragment();
                break;
            default:
                break;
        }
        fragmentlist.add(fragment);
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public int getCount() {
        return titles.length;
    }
}
