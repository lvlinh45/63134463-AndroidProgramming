package linh.edu.appmonan;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tìm ListView
        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);


        // Chuẩn bị nguồn dữ liệu
        ArrayList <MonAn> dsMonAn = new ArrayList<MonAn>();
        dsMonAn.add(new MonAn("Cơm tấm sườn", 25000, "Mô tả", R.drawable.anh1));
        dsMonAn.add(new MonAn("Cơm sườn trứng", 30000, "Mô tả", R.drawable.anh2));
        dsMonAn.add(new MonAn("Gà xối mỡ", 27000, "Mô tả", R.drawable.anh3));
        dsMonAn.add(new MonAn("Sườn bì chả", 25000, "Mô tả", R.drawable.anh4));
        dsMonAn.add(new MonAn("Cơm tấm đặc biệt", 50000, "Mô tả", R.drawable.anh5));

        MonAnAdapter adapter = new MonAnAdapter(dsMonAn, this);
        lvDSMonAn.setAdapter(adapter);

        // Bắt xử lí sự kiện
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Lấy phần tử được chạm
                MonAn monAnChon = dsMonAn.get(position);
                // Làm gì đó
                Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(), Toast.LENGTH_SHORT).show();
            }
        });
    }







}