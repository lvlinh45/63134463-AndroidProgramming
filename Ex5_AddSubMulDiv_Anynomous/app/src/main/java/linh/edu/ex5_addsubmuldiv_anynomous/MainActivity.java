package linh.edu.ex5_addsubmuldiv_anynomous;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    void timDieuKhien() {
        editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        editTextKQ = (EditText)findViewById(R.id.edtKQ);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timDieuKhien();
        // Gắn bộ lắng nghe sự kiện và code xử lí cho từng nút
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lí cộng
                // Code xử lí cộng ở đây
                // B1: Lấy dữ liệu 2 số
//       B1.1: Tìm EditText số 1 và số 2

//       B1.2: Lấy ữ liệu từ 2 điều khiển
                String soThu1 =  editTextSo1.getText().toString();
                String soThu2 =editTextSo2.getText().toString();
//         B1.3: Chuyển dữ liệu từ chuỗi sang số
                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);
                //B2: Tính toán
                float tong = soA + soB;
                // B3: Hiện kết quả
                // B3.1
                // B3.2: Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
                String chuoiKQ = String.valueOf(tong);
                // B3.3 gắn KQ lên đk
                editTextKQ.setText(chuoiKQ);
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Code xử lí trừ ở đây
                // B1: Lấy dữ liệu 2 số
//       B1.1: Tìm EditText số 1 và số 2

//       B1.2: Lấy ữ liệu từ 2 điều khiển
                String soThu1 =  editTextSo1.getText().toString();
                String soThu2 =editTextSo2.getText().toString();
//         B1.3: Chuyển dữ liệu từ chuỗi sang số
                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);
                //B2: Tính toán
                float hieu = soA - soB;
                // B3: Hiện kết quả
                // B3.1
                // B3.2: Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
                String chuoiKQ = String.valueOf(hieu);
                // B3.3 gắn KQ lên đk
                editTextKQ.setText(chuoiKQ);
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Code xử lí nhân ở đây
                // B1: Lấy dữ liệu 2 số
//       B1.1: Tìm EditText số 1 và số 2

//       B1.2: Lấy ữ liệu từ 2 điều khiển
                String soThu1 =  editTextSo1.getText().toString();
                String soThu2 =editTextSo2.getText().toString();
//         B1.3: Chuyển dữ liệu từ chuỗi sang số
                float soA = Float.parseFloat(soThu1);
                float soB = Float.parseFloat(soThu2);
                //B2: Tính toán
                float tich = soA * soB;
                // B3: Hiện kết quả
                // B3.1
                // B3.2: Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
                String chuoiKQ = String.valueOf(tich);
                // B3.3 gắn KQ lên đk
                editTextKQ.setText(chuoiKQ);
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLiChia();
            }
        });
    }
    // Xử lí cộng
    public void xuLiCong(View v) {


    }
    // Xử lí trừ
    public void xuLiTru(View v) {

    }
    // Xử lí nhân
    public void xuLiNhan(View v) {

    }
    // Xử lí chia
    public void xuLiChia() {
        // Code xử lí chia ở đây
        // B1: Lấy dữ liệu 2 số
//       B1.1: Tìm EditText số 1 và số 2

//       B1.2: Lấy ữ liệu từ 2 điều khiển
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
//         B1.3: Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //B2: Tính toán
        float thuong = soA / soB;
        // B3: Hiện kết quả
        // B3.1
        // B3.2: Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(thuong);
        // B3.3 gắn KQ lên đk
        editTextKQ.setText(chuoiKQ);
    }
}