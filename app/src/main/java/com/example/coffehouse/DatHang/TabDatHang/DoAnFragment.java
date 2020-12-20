package com.example.coffehouse.DatHang.TabDatHang;

import android.content.Context;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.coffehouse.R;

import java.util.ArrayList;


public class DoAnFragment extends Fragment {

    private GridView gridView2;
    Context context;
    private ConstraintLayout rela;
    private ArrayList<DoAnModel> doanData;
    private DoAnAdapter doanAdapter;
    private DoAnModel doan;

    public DoAnFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        context=getActivity();
        View root =inflater.inflate(R.layout.fragment_do_an, container, false);
        gridView2 = root.findViewById(R.id.gridview2_118);
//        rela = root.findViewById(R.id.rela);
        doanData = new ArrayList<>();
//        addEvents();
        listdoan();
        doanAdapter=new DoAnAdapter(context,doanData);
        gridView2.setAdapter(doanAdapter);
        registerForContextMenu(gridView2);
        return root;
    }

    private void listdoan(){

        doan=new DoAnModel();
        doan.setId2_118(1);
        doan.setSanpham2_118(R.drawable.phobien1);
        doan.setTensanpham2_118("Macca Phủ Socola");
        doan.setGia2_118("69.000 đ");
        doanData.add(doan);

        doan=new DoAnModel();
        doan.setId2_118(2);
        doan.setSanpham2_118(R.drawable.doan2);
        doan.setTensanpham2_118("Mít sấy");
        doan.setGia2_118("20.000 đ");
        doanData.add(doan);

        doan=new DoAnModel();
        doan.setId2_118(3);
        doan.setSanpham2_118(R.drawable.doan3);
        doan.setTensanpham2_118("Cơm cháy chà bông");
        doan.setGia2_118("20.000 đ");
        doanData.add(doan);

    }
}