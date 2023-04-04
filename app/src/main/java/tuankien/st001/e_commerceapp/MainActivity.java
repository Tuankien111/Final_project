package tuankien.st001.e_commerceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout mtablayout;
    private ViewPager mviewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtablayout = findViewById(R.id.tablayout);
        mviewpager = findViewById(R.id.viewpager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(), "Home");
        adapter.addFragment(new ManFragment(), "Nam");
        adapter.addFragment(new WomanFragment(), "Nữ");
        adapter.addFragment(new KidFragment(), "Trẻ em");
        mviewpager.setAdapter(adapter);
        mtablayout.setupWithViewPager(mviewpager);
    }
}