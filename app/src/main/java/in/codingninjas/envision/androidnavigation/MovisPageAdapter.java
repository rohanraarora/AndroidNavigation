package in.codingninjas.envision.androidnavigation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MovisPageAdapter extends FragmentPagerAdapter {


    public MovisPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        if(i == 0){
            return HomeFragment.newInstance("a","b");
        }
        else if(i == 1){
            return new DashboardFragment();
        }
        else if(i == 2){
            return new NotiFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
