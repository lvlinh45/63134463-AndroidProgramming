 package linh.edu.thuchanhchuyenmanhinh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // xây dựng bộ lắng nghe, xử lý theo 1 cách khác
        // chú ý: ta có thể làm theo cách giống màn hình 1

        // cachs khác ở đây:
        // 1. Tìm đối tượng cần gắn bộ lắng nghe
        Button btnManHinh2   = findViewById(R.id.btnmh2);
        // 2. Gắn bộ lắng nghe
        btnManHinh2.setOnClickListener(BoChuyenLangNgheMH); // Ta sẽ code ở dưới

        // Khi màn hình mở ra, ta lấy Intent đã kích hoạt
        Intent thuNhanDuoc = getIntent();
//        bóc dữ liệu ra xem
        String ten = thuNhanDuoc.getStringExtra("Tete");
        String tuoi = thuNhanDuoc.getStringExtra("Toto");

        //Đưa lên điê khiển
        TextView tvTen = findViewById(R.id.tvHoTen);
        TextView tvTuoi = findViewById(R.id.tvTuoi);//
        tvTen.setText("Tên: " + ten);
        tvTuoi.setText("Tuối: " + tuoi);

    }

    // ở đây nhé, ngoài hàm oncreate
    View.OnClickListener BoChuyenLangNgheMH = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // 1. Tạo thư
            // 1. Tạo đối tượng Intent
            Intent thuKichHoatMH1;
            // Hàm tạo cos 2 tham số, tham so 1 là màn hình hiện tại, tham số 2 là màn hình chuyển tới (.class)
            thuKichHoatMH1 = new Intent(MainActivity2.this, MainActivity.class);
            // 2. Gửi thư, mà không đợi phản hồi
            startActivity(thuKichHoatMH1);
        }
    };
}