package com.myc.interactua.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.myc.interactua.Beans.Libro;
import com.myc.interactua.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class LibrosAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Libro> list;

    public LibrosAdapter(Context context, int layout, List<Libro> list){
        this.context=context;
        this.layout=layout;
        this.list=list;
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            LayoutInflater layoutInflater= LayoutInflater.from(this.context);
            convertView=layoutInflater.inflate(layout,null);
            holder = new ViewHolder();
            holder.tituloTextView = convertView.findViewById(R.id.titulo);
            holder.imgImageView = convertView.findViewById(R.id.skeletonViewPhoto);
            convertView.setTag(holder);
        }
        else {
            holder=(ViewHolder) convertView.getTag();
        }
        Libro libro = list.get(position);
        holder.tituloTextView.setText(libro.getNombre());
        holder.source=libro.getUrl();
        String imgUrl=libro.getUrlImg();
        Picasso.get().load(imgUrl)
                .resize(100, 100)
                .centerCrop().into(holder.imgImageView);
        return convertView;
    }
    static class ViewHolder{
        private TextView tituloTextView;
        private ImageView imgImageView;
        private String source;
    }
}
