package linh.edu.listbaihatyeuthich;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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

        // Hiển thị dữ liệu lên ListView
        // B1: Chuẩn bị nguồn dữ liệu (Có thể tạo sẵn (hard-code) / lấy từ tệp / CSDL)
        ArrayList <String> nguonDuLieu = new ArrayList<String>();
        nguonDuLieu.add("Chắc ai đó sẽ về");
        nguonDuLieu.add("Yêu được không?");
        nguonDuLieu.add("Hết thương cạn nhớ?");
        nguonDuLieu.add("Một ngàn nỗi đau");
        nguonDuLieu.add("Người gieo mầm xanh");

        // B2. Tìm tham chiếu đến ListView
        ListView listViewBH = (ListView)findViewById(R.id.lvDSBaiHat);

        // B3. Tạo adaper, 3.1 và gắn với nguồn
        ArrayAdapter <String> baiHat_adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                nguonDuLieu

        );

        // B4.Gắn/nạp dữ liệu từ nguồn vào view
        listViewBH.setAdapter(baiHat_adapter);


        // Xử lí sự kiện
        listViewBH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // i là ví trí của item được chọn trên Listview
                // Lấy giá trị của item vừa click
                String value = baiHat_adapter.getItem(position);
                // Xử lí khác theo yêu cầu
                // ví dụ
                Toast.makeText(MainActivity.this, value,Toast.LENGTH_SHORT).show();
            }
        });

    }
}