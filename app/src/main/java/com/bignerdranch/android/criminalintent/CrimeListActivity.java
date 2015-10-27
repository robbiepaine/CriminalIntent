package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by robbiepaine on 10/26/15.
 */
public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
