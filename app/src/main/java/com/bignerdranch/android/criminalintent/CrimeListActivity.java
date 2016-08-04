package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;
import android.util.Log;

/**
 * Created by DELL on 2016/8/1.
 */
public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        Log.d("test","createFragment");
        return new CrimeListFragment();
    }
}
