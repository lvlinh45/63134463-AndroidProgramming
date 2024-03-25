package ntu.ntu_63134463;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList <String> danhSachMonHoc;
    Button btnThem;
    EditText edtMonHoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnThem = (Button) findViewById(R.id.btnThem) ;
        edtMonHoc = (EditText) findViewById(R.id.edtMonHoc);

        danhSachMonHoc = new ArrayList<String>();
        // Thêm dữ liệu ở đây
        danhSachMonHoc.add("Nhập môn lập trình");
        danhSachMonHoc.add("Kiểm thử");
        danhSachMonHoc.add("Toán rời rạc");
        danhSachMonHoc.add("Lập trình Web");
        danhSachMonHoc.add("Lập trình di động");
        danhSachMonHoc.add("Lập trình game");
        danhSachMonHoc.add("Hướng đối tượng");

        ArrayAdapter<String> adapterMonHoc = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                danhSachMonHoc
        );



        ListView lvTenMonHoc = findViewById(R.id.lvMonHoc);
        lvTenMonHoc.setAdapter(adapterMonHoc);

        lvTenMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String strTenTinh = danhSachMonHoc.get(position);
                Toast.makeText(MainActivity.this, "Bạn vừa chọn: " + strTenTinh, Toast.LENGTH_SHORT).show();

            }
        });

        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String monHoc = edtMonHoc.getText().toString();
                danhSachMonHoc.add(monHoc);
                // notifyDatachange là phương thức để cập nhật lại
            }
        });
    }
}