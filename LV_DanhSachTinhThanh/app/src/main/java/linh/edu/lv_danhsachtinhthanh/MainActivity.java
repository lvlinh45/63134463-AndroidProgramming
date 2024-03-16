package linh.edu.lv_danhsachtinhthanh;

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
    ArrayList<String> dsTenTinhThanhVN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hiển thị dữ liệu lên ListView

        // B1+: Cần có dữ liệu
        // Dữ liệu từ đâu có: từ CSDL(SQL, noSQL, XML,...)
        //ở bài này chúng ta hard-code dữ liệu trực tiếp
        // Cần biến phù hợp để chứa dữ liệu

        dsTenTinhThanhVN = new ArrayList<String>();
        // Thêm dữ liệu ở đây
        dsTenTinhThanhVN.add("Khánh Hòa");
        dsTenTinhThanhVN.add("Quảng Bình");
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Thanh Hóa");
        dsTenTinhThanhVN.add("Nghệ An");
        dsTenTinhThanhVN.add("Đồng Nai");

        // B2. Tạo adapter: 3 tham số
        ArrayAdapter<String> adapterTinhThanh = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                dsTenTinhThanhVN
        );

        // B3. Gắn vào điều khiến hiển thị ListView
        // b3.1 tìm listview
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhsachTT);
        // 3.2: Gắn vào
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        // 3.3 Lắng nghe và xử lí sự kiện user tương tác
        // gắn bộ lắng nghe vào
        lvTenTinhThanh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // code xử lí ở đây
                // ví dụ xử lí ở đây là hiện lên màn hình một thông báo nhanh về vị trí của phần tử vừa chọn
                // vd khác, thay vì hiện vị trí thì ta hiện giá trị
                // Lấy giá trị phần tử thứ i
                String strTenTinh = dsTenTinhThanhVN.get(position);
//                Toast.makeText(MainActivity.this, "Bạn vừa chọn: " + String.valueOf(position), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Bạn vừa chọn: " + strTenTinh, Toast.LENGTH_SHORT).show();

            }
        });
    }
    // tạo bộ lắng nghe và xử lí sự kiện OnItemClick
    // Vd: boLangNghevaXL
}