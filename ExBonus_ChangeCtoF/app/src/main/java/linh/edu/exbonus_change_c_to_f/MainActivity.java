package linh.edu.exbonus_change_c_to_f;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1;
    EditText editTextSo2;
    Button btn1;
    Button btn2;
    Button btnClear;



    void timDieuKhien() {
        editTextSo1 = (EditText) findViewById(R.id.edt1);
        editTextSo2 = (EditText) findViewById(R.id.edt2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btnClear = (Button) findViewById(R.id.btnClear);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timDieuKhien();
           FtoC();
           CtoF();4
           clear();
    }



    void FtoC() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soThu1 = editTextSo1.getText().toString();
                float soA = Float.parseFloat(soThu1);
                float soChuyenDoi = soA * ((float) 9 /5) + 32;
                String chuoiKQ = String.valueOf(soChuyenDoi);
                editTextSo2.setText(chuoiKQ);
            }
        });
    }
    void CtoF() {
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String soThu1 = editTextSo2.getText().toString();
                float soA = Float.parseFloat(soThu1);
                float soChuyenDoi = (soA - 32) * ((float) 5 /9) ;
                String chuoiKQ = String.valueOf(soChuyenDoi);
                editTextSo1.setText(chuoiKQ);
            }
        });
    }

    void clear() {
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextSo1.setText("");
                editTextSo2.setText("");
            }
        });
    }
}