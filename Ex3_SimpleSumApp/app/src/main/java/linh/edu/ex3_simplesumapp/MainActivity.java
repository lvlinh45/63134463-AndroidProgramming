package linh.edu.ex3_simplesumapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // Gắn Layout tương ứng với fie này
        setContentView(R.layout.activity_main);
    }

    // đây là bộ lắng nghe và xử lí sự kiện click lên nút tính tổng
    public void XuLyCong(View view) {
        // Tìm, tham chiếu đến điều khiển trên tệp XML, mapping sang JAVA file
           EditText editTextSoA = findViewById(R.id.edtA);
           EditText editTextSoB = findViewById(R.id.edtB);
           EditText editTextKetQua = findViewById(R.id.edtKQ);
        // Lấy dữ liệu về ở điều khiển số A
        String strA = editTextSoA.getText().toString(); // strA = "2"
        // Lấy dữ liệu về ở điều khiển số A
        String strB = editTextSoB.getText().toString(); // strB = "3"

        // chuyển dữ liệu sang số
        int so_A= Integer.parseInt(strA); // 2
        int so_B = Integer.parseInt(strB); // 3
        // Tính toán theo yêu cầu
        int tong = so_A + so_B; // 6
        String strTong = String.valueOf(tong); // Chuyển sang dạng chuỗi => "6"
        //Hiện ra màn hình
        editTextKetQua.setText(strTong);




    }
}