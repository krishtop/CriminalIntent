package com.nevermind.criminalintent.controller;

import android.support.v4.app.Fragment;

/**
 * Created by Dmitry on 15.04.2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
