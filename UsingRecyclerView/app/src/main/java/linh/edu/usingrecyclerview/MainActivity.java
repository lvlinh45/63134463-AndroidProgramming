package linh.edu.usingrecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList <LandScape> recylerViewData;
    RecyclerView recyclerViewLandscape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 3
        recylerViewData = getDataForRecylerView();
        // 4. Tìm điều khiển
        recyclerViewLandscape = findViewById(R.id.recyclerLand);
        // 5. Tạo Layout
//        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
//        RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
//        recyclerViewLandscape.setLayoutManager(layoutLinearHorizonal);

        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this, 2);
        recyclerViewLandscape.setLayoutManager(layoutGrid);


        // 6.
        landScapeAdapter = new LandScapeAdapter(this, recylerViewData);
        // 7. Gắn adapter vào RecyclerView
        recyclerViewLandscape.setAdapter(landScapeAdapter);

    }

    ArrayList<LandScape> getDataForRecylerView() {
        ArrayList <LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("flagtower", "Cột cờ Hà Nội");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("effel", "Tháp Effel"));
        dsDuLieu.add(new LandScape("buckingham", "Cung điện Buckingham"));
        return dsDuLieu;
    }

}