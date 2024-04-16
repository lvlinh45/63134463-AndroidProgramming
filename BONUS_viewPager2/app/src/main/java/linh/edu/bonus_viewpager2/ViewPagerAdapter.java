package linh.edu.bonus_viewpager2;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStateAdapter {

    Context context;
    ArrayList<LandScape> lstData;


    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FirstFragment();
//            case 1:
//                return new SecondFragment();
//            case 2:
//                return new ThirdFragment();
        }
        return new FirstFragment();
    }
    @Override
    public int getItemCount() {
        return 3;
    }
}