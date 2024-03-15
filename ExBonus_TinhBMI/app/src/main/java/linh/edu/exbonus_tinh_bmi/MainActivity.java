package linh.edu.exbonus_tinh_bmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText edt1;
    EditText edt2;
    Button btn;
    TextView setBMI;
    TextView remind;


    void dieuKhien() {
        edt1 = (EditText)findViewById(R.id.edt1);
        edt2 = (EditText)findViewById(R.id.edt2);
        btn = (Button) findViewById(R.id.button);
        setBMI = (TextView) findViewById(R.id.bmi);
        remind = (TextView) findViewById(R.id.remind);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dieuKhien();
        tinhBMI();
    }


    public void tinhBMI() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy cân nặng
                String getWeight = edt1.getText().toString();
                float canNang = Float.parseFloat(getWeight);
                // Lấy chiều cao
                String getHeight = edt2.getText().toString();
                float chieuCao = Float.parseFloat(getHeight);

                float BMI = canNang / (chieuCao * chieuCao);

                DecimalFormat df = new DecimalFormat(".##");
                String roundedBMI = df.format(BMI);

                setBMI.setText("Chỉ số BMI của bạn là: " + String.valueOf(roundedBMI));


                if(BMI < 18.5) {
                    remind.setText("Gầy");
                } else if (BMI >= 18.5 && BMI < 25) {
                    remind.setText("Bình thường");
                } else if (BMI >= 25 && BMI < 30) {
                    remind.setText("Thừa cân");
                } else if (BMI >= 30) {
                    remind.setText("Béo phì");
                }






            }
        });
    }
}