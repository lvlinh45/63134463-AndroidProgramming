package ntu.ntu_63134463;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
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
    Button btnCapNhat;
    Button btnLamMoi;
    EditText edtMonHoc;

    int viTri = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnThem = (Button) findViewById(R.id.btnThem) ;
        btnCapNhat = (Button) findViewById(R.id.btnUpdate) ;
        btnLamMoi = (Button) findViewById(R.id.btnLamMoi) ;
        edtMonHoc = (EditText) findViewById(R.id.edtMonHoc);

        danhSachMonHoc = new ArrayList<String>();
        // Thêm dữ liệu ở đây
        danhSachMonHoc.add("Nhập môn lập trình");
        danhSachMonHoc.add("Kiểm thử");
        danhSachMonHoc.add("Toán rời rạc");
        danhSachMonHoc.add("Lập trình Web");
        danhSachMonHoc.add("Lập trình di động");
        danhSachMonHoc.add("Lập trình game");
        danhSachMonHoc.add("Đại số Tuyến Tính");
        danhSachMonHoc.add("Xác xuất Thống kê");
        danhSachMonHoc.add("Mạng Máy Tính");
        danhSachMonHoc.add("Công nghệ phần mềm");

        ArrayAdapter<String> adapterMonHoc = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                danhSachMonHoc
        ) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView textView = (TextView) view.findViewById(android.R.id.text1);

                // Đặt màu cho chữ trong mỗi item trong ListView
                textView.setTextColor(getResources().getColor(R.color.white)); // Thay your_text_color bằng id của màu bạn muốn

                return view;
            }
        };



        ListView lvTenMonHoc = findViewById(R.id.lvMonHoc);
        lvTenMonHoc.setAdapter(adapterMonHoc);

        lvTenMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                edtMonHoc.setText(danhSachMonHoc.get(position));

                // Lấy vị trí
                viTri = position;
                String strMonHoc = danhSachMonHoc.get(position);
                Toast.makeText(MainActivity.this, "Bạn vừa chọn: " + strMonHoc, Toast.LENGTH_SHORT).show();

            }
        });

        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String monHoc = edtMonHoc.getText().toString();
                danhSachMonHoc.add(monHoc);
                // notifyDatachange là phương thức để cập nhật lại
                adapterMonHoc.notifyDataSetChanged();
            }
        });

        btnCapNhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                danhSachMonHoc.set(viTri, edtMonHoc.getText().toString());
                // Gán xong cập nhật lại
                adapterMonHoc.notifyDataSetChanged();
            }
        });

        lvTenMonHoc.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                danhSachMonHoc.remove(viTri);
                adapterMonHoc.notifyDataSetChanged();
                return false;
            }
        });

        btnLamMoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtMonHoc.setText("");
            }
        });
    }
}