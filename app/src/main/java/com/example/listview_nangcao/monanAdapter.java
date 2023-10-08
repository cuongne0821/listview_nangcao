package com.example.listview_nangcao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class monanAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<MonAn> listMonan;

    public monanAdapter(Context context, int layout, List<MonAn> listMonan) {
        this.context = context;
        this.layout = layout;
        this.listMonan = listMonan;
    }


    @Override
    //muon tra ve bao nhieu dong ( o day muon lay het tat ca dong co trong list)
    public int getCount() {
        return listMonan.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override

    //
    public View getView(int i, View view, ViewGroup viewGroup) {
        // phaan nay cua he thong
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        // anh xa
        TextView txtTen=(TextView) view.findViewById(R.id.ten);
        TextView txtMota=(TextView) view.findViewById(R.id.mota);
        ImageView img=(ImageView) view.findViewById(R.id.hinh);
        // gan gia tri
        MonAn monan=listMonan.get(i);

        txtTen.setText(monan.getTen());
        txtMota.setText(monan.getMoTa());
        img.setImageResource(monan.getHinh());
        return view;
    }
}
