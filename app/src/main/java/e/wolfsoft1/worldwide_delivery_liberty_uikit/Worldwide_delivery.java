package e.wolfsoft1.worldwide_delivery_liberty_uikit;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import adapter.HelloAdapter;
import me.relex.circleindicator.CircleIndicator;

public class Worldwide_delivery extends AppCompatActivity {
    private ViewPager v1;
    private HelloAdapter a;
    private CircleIndicator indicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worldwide_delivery);


        v1 = (ViewPager)findViewById(R.id.v1);
        CircleIndicator indicator = (CircleIndicator)findViewById(R.id.indicator);
        a = new HelloAdapter(getSupportFragmentManager());
        v1.setAdapter(a);
        indicator.setViewPager(v1);
        a.registerDataSetObserver(indicator.getDataSetObserver());
    }
}
