package in.codingninjas.envision.androidnavigation;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class BottomActivity extends AppCompatActivity implements HomeFragment.OnFragmentInteractionListener {



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

//            FragmentManager fragmentManager = getSupportFragmentManager();
//            FragmentTransaction transaction = fragmentManager.beginTransaction();
//
//            switch (item.getItemId()) {
//                case R.id.navigation_home:
//                   HomeFragment homeFragment = HomeFragment.newInstance("a","b");
//                   transaction.replace(R.id.contentContainer,homeFragment);
//                   break;
//                case R.id.navigation_dashboard:
//                    DashboardFragment dashboardFragment = new DashboardFragment();
//                    transaction.replace(R.id.contentContainer,dashboardFragment);
//                    break;
//                case R.id.navigation_notifications:
//                    NotiFragment notiFragment = new NotiFragment();
//                    transaction.replace(R.id.contentContainer,notiFragment);
//                   break;
//            }
//            transaction.commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        ViewPager viewPager = findViewById(R.id.viewPager);
        MovisPageAdapter adapter = new MovisPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);



//        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }



}
