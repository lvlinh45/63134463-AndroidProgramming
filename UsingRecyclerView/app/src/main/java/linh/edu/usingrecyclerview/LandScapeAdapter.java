package linh.edu.usingrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class LandScapeAdapter extends RecyclerView.Adapter <LandScapeAdapter.ItemLandHolder> {

    Context context;
    ArrayList<LandScape> lstData;

    public LandScapeAdapter(Context _context, ArrayList<LandScape> _lstData) {
        this.context = _context;
        this.lstData = _lstData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land, parent, false);
        ItemLandHolder viewHolderCreated = new ItemLandHolder(vItem);
        return viewHolderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        // Lấy đối tượng hiển thị
        LandScape lanscapeHienThi = lstData.get((position));

        // trích thông tin
        String caption = lanscapeHienThi.getLandCaption();
        String tenFileAnh = lanscapeHienThi.getLandImageFileName();


        // Đặt các trường thông tin của holder
        holder.tvCaption.setText(caption);
        // đặt ảnh
        String packageName = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(tenFileAnh, "mipmap", packageName);
        holder.ivLandscape.setImageResource(imageID);


    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemLandHolder extends  RecyclerView.ViewHolder {
        TextView tvCaption;
        ImageView ivLandscape;
        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLandscape = itemView.findViewById(R.id.imageViewLand);
        }
    }
}
