package com.akbif9.watour.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.akbif9.watour.R;
import com.akbif9.watour.data.Data;

import java.util.List;

public class Adapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<Data> items;

    public Adapter(Activity activity, List<Data> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int location) {
        return items.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_row, null);

        TextView id_posting = (TextView) convertView.findViewById(R.id.id_posting);
        TextView isi_posting = (TextView) convertView.findViewById(R.id.isi_posting);
        TextView nama_game = (TextView) convertView.findViewById(R.id.nama_game);
        TextView tanggal = (TextView) convertView.findViewById(R.id.tanggal);
        TextView harga = (TextView) convertView.findViewById(R.id.harga);

        Data data = items.get(position);

        id_posting.setText(data.getId_posting());
        isi_posting.setText(data.getIsi_posting());
        nama_game.setText(data.getNama_game());
        tanggal.setText(data.getTanggal());
        harga.setText(data.getHarga());

        return convertView;
    }

}

