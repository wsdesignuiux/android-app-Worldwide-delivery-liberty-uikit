package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.Worldwide;

public class HelloAdapter extends FragmentStatePagerAdapter {
    public HelloAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Worldwide tab1 = new Worldwide();
                return tab1;
            case 1:
                Worldwide tab2 = new Worldwide();
                return tab2;
            case 2:
                Worldwide tab3 = new Worldwide();
                return tab3;
            case 3:
                Worldwide tab4 = new Worldwide();
                return tab4;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
