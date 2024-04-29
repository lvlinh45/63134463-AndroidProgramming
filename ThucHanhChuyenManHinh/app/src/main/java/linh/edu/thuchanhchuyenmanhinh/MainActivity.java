package linh.edu.thuchanhchuyenmanhinh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChuyenSangMH2(View v) {
        // 1. Tạo đối tượng Intent
        Intent thuKichHoatMH2;
        // Hàm tạo cos 2 tham số, tham so 1 là màn hình hiện tại, tham số 2 là màn hình chuyển tới (.class)
         thuKichHoatMH2 = new Intent(MainActivity.this, MainActivity2.class);
        // 2. Gửi thư, mà không đợi phản hồi
        startActivity(thuKichHoatMH2);
    }
}