
package com.example.calculator;
import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragment extends FragmentPagerAdapter {
    private UnitConvertor context;
    public SimpleFragment(FragmentManager fm, UnitConvertor context) {
        super(fm);
        this.context=context;
    }

    @Override
    public  Fragment getItem(int position) {
        if (position == 0) {
            return new Length();
        } else if(position==1){
            return new Area();
        }else if(position==2){
            return new Temperature();
        }
        else if(position==3){
            return new Data();
        }else{
            return new Time();
        }
    }


    @Override
    public int getCount () {
        return 5;
    }

    public CharSequence getPageTitle(int position) {

        if (position == 0) {
            return context.getString(R.string.Length);
        }  else if (position == 1) {
            return context.getString(R.string.Area);
        } else if(position==2) {
            return context.getString(R.string.Temperature);
        }else if(position==3){
            return context.getString(R.string.Data);
        }else {
            return context.getString(R.string.Time);
        }
    }

}
