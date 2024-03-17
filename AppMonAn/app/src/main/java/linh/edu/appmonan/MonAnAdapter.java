package linh.edu.appmonan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {


    private ArrayList<MonAn> dsMonAn;
    private LayoutInflater layoutInflater;
    private Context context;

    // Hàm tạo


    public MonAnAdapter(ArrayList<MonAn> dsMonAn, Context _context) {
        this.dsMonAn = dsMonAn;
        this.context = _context;
        this.layoutInflater = LayoutInflater.from(_context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return dsMonAn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        // View item hiện hành
        View viewHienHanh = view;
        // Kiểm tra
        if(viewHienHanh == null) {
             viewHienHanh = layoutInflater.inflate(R.layout.item_monan, null);
        }
        // Lấy dữ liệu
        MonAn monAnHienTai = dsMonAn.get(position);
        // gán lên các điều khiển

        // tìm điều khiển
        TextView textView_TenMon = (TextView) viewHienHanh.findViewById(R.id.tvTenMonAn);
        TextView textView_DonGia = (TextView) viewHienHanh.findViewById(R.id.tvĐonGia);
        TextView textView_MoTa = (TextView) viewHienHanh.findViewById(R.id.tvMoTa);
        ImageView imageView_Anh = (ImageView) viewHienHanh.findViewById(R.id.imAnhDaiDien);

        // set Lên
        textView_TenMon.setText(monAnHienTai.getTenMonAn());
        textView_DonGia.setText(String.valueOf(monAnHienTai.getDonGia()));
        textView_MoTa.setText((monAnHienTai.getMoTa()));
        imageView_Anh.setImageResource(monAnHienTai.getIdAnhMinhHoa());
        return  viewHienHanh;
    }
}
