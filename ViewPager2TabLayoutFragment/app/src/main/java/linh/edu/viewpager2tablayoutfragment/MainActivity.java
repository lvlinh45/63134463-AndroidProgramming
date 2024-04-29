package linh.edu.viewpager2tablayoutfragment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<QuocGia> dsQuocGia;
    ViewPager2 viewPager2;
    QuocGiaPagerAdapter quocGiaPagerAdapter;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dsQuocGia = new ArrayList<QuocGia>();
        QuocGia qg1 = new QuocGia("VietNam", "VN", 80);
        QuocGia qg2 = new QuocGia("Mỹ", "us", 68);
        QuocGia qg3 = new QuocGia("Hàn Quốc", "KS", 10);
        QuocGia qg4 = new QuocGia("Nga", "ru", 20);
        dsQuocGia.add(qg1);
        dsQuocGia.add(qg2);
        dsQuocGia.add(qg3);
        dsQuocGia.add(qg4);
        viewPager2 = findViewById(R.id.viewPagerQG);
        quocGiaPagerAdapter = new QuocGiaPagerAdapter(this,dsQuocGia);
        viewPager2.setAdapter(quocGiaPagerAdapter);

        tabLayout = findViewById(R.id.tabQuocGia);
        new TabLayoutMediator(tabLayout, viewPager2, (tab, i) -> tab.setText("QG" +(i+1) ) ).attach();

    }
}