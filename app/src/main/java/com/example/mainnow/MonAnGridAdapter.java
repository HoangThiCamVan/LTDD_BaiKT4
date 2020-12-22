package com.example.mainnow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MonAnGridAdapter extends BaseAdapter {
    Context context;
    int Layout;
    List<MonAnGrid> arrayList;

    public MonAnGridAdapter(Context context, int layout, List<MonAnGrid> arrayList) {
        this.context = context;
        Layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public class ViewHolder{
        TextView tvTitle;
        TextView tvTenQuan;
        TextView tvDiaChi;
        ImageView imgHinhAnh;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(Layout, null);
            viewHolder = new ViewHolder();

            viewHolder.tvTitle = (TextView) convertView.findViewById(R.id.tv_title);
            viewHolder.tvTenQuan = (TextView) convertView.findViewById(R.id.tv_ten);
            viewHolder.tvDiaChi = (TextView) convertView.findViewById(R.id.tv_diachi);
            viewHolder.imgHinhAnh = (ImageView) convertView.findViewById(R.id.img);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tvTitle.setText(arrayList.get(position).title);
        viewHolder.tvTenQuan.setText(arrayList.get(position).tenQuan);
        viewHolder.tvDiaChi.setText(arrayList.get(position).diaChi);
        viewHolder.imgHinhAnh.setImageResource(arrayList.get(position).hinhAnh);
        return convertView;

    }
}
