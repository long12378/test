package com.example.coffehouse.DatHang.TabDatHang;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.coffehouse.R;

import java.util.ArrayList;


public class PhoBienFragment extends Fragment {
    private GridView gridView;
    Context context;
    private ConstraintLayout rela;
    private ArrayList<PhoBienModel> phobienData;
    private PhoBienAdapter phobienAdapter;
    private PhoBienModel phobien;


    public PhoBienFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        context=getActivity();
        View root =inflater.inflate(R.layout.fragment_pho_bien, container, false);
        gridView = root.findViewById(R.id.gridview_118);
//        rela = root.findViewById(R.id.rela);
        phobienData = new ArrayList<>();
        muahang();
        listphobien();
        phobienAdapter=new PhoBienAdapter(context,phobienData);
        gridView.setAdapter(phobienAdapter);
        registerForContextMenu(gridView);



        return root;
    }

    private void listphobien(){

        phobien=new PhoBienModel();
        phobien.setId_118(1);
        phobien.setSanpham_118(R.drawable.phobien1);
        phobien.setTensanpham_118("Cà phê Lúa Mạch đá xay");
        phobien.setGia_118("69.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_118(2);
        phobien.setSanpham_118(R.drawable.phobien2);
        phobien.setTensanpham_118("Cà phê Lúa Mạch nóng");
        phobien.setGia_118("69.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_118(3);
        phobien.setSanpham_118(R.drawable.phobien3);
        phobien.setTensanpham_118("Sôcôla Lúa Mạch đá xay");
        phobien.setGia_118("69.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_118(4);
        phobien.setSanpham_118(R.drawable.phobien4);
        phobien.setTensanpham_118("Sôcôla Lúa Mạch nóng");
        phobien.setGia_118("69.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_118(5);
        phobien.setSanpham_118(R.drawable.phobien5);
        phobien.setTensanpham_118("Sôcôla Lúa Mạch nóng");
        phobien.setGia_118("69.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_118(6);
        phobien.setSanpham_118(R.drawable.phobien6);
        phobien.setTensanpham_118("Sôcôla Lúa Mạch nóng");
        phobien.setGia_118("69.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_118(7);
        phobien.setSanpham_118(R.drawable.phobien7);
        phobien.setTensanpham_118("Trà sữa Mắc Ca Trân Châu Trắng");
        phobien.setGia_118("45.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_118(8);
        phobien.setSanpham_118(R.drawable.phobien8);
        phobien.setTensanpham_118("Trà đào cam sả và mật ong");
        phobien.setGia_118("45.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_118(9);
        phobien.setSanpham_118(R.drawable.phobien9);
        phobien.setTensanpham_118("Oolong Hạt Sen - Đá đặc biệt");
        phobien.setGia_118("45.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_118(10);
        phobien.setSanpham_118(R.drawable.phobien10);
        phobien.setTensanpham_118("Trà Oolong Phúc Bồn Tử");
        phobien.setGia_118("45.000 đ");
        phobienData.add(phobien);
    }
    private void muahang() {
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(PhoBienFragment.this.getActivity());
                dialog.setContentView(R.layout.activity_muahang);
                dialog.show();
            }
        });
        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(PhoBienFragment.this.getActivity());
                dialog.setContentView(R.layout.fragment_pho_bien);
                dialog.show();
                return true;
            }
        });
    }
}