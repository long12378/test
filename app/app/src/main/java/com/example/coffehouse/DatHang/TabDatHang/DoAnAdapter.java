package com.example.coffehouse.DatHang.TabDatHang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.coffehouse.R;

import java.util.ArrayList;

public class DoAnAdapter extends BaseAdapter {
    Context context;
    ArrayList<DoAnModel> doanData;
    LayoutInflater layoutInflater;
    DoAnModel doan;

    public DoAnAdapter(Context context, ArrayList<DoAnModel> doanData) {
        this.context = context;
        this.doanData = doanData;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return doanData.size();
    }

    @Override
    public Object getItem(int i) {
        return doanData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return doanData.get(i).getId2_118();
    }


    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View view1 = view;

        if (view1 == null) {
            view1 = layoutInflater.inflate(R.layout.list_doan, null, true);

        }

        ImageView sanpham2_118 = view1.findViewById(R.id.sanpham2_118);
        TextView tensanpham2_118 = view1.findViewById(R.id.tensanpham2_118);
        TextView gia2_118 = view1.findViewById(R.id.gia2_118);
        ImageView them2_118 = view1.findViewById(R.id.them2_118);

        doan = doanData.get(position);

        sanpham2_118.setImageResource(doan.getSanpham2_118());
        tensanpham2_118.setText(doan.getTensanpham2_118());
        gia2_118.setText(doan.getGia2_118());
        them2_118.setImageResource(doan.getThem2_118());


        return view1;
    }
}
