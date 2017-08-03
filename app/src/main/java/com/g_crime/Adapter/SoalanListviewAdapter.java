package com.g_crime.Adapter;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.g_crime.R;

public class SoalanListviewAdapter extends BaseAdapter {
    private Activity context;
    private String[] listSoalan;

    public SoalanListviewAdapter(Activity context, String[] listSoalan) {
        this.context = context;
        this.listSoalan = listSoalan;
    }

    @Override
    public int getCount() {
        return listSoalan.length;
    }

    @Override
    public Object getItem(int position) {
        return listSoalan[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null) {
            LayoutInflater layoutInflater;

            viewHolder = new ViewHolder();
            layoutInflater = context.getLayoutInflater();

            convertView = layoutInflater.inflate(R.layout.customlayout_listview_soalan, parent, false);

            viewHolder.tvNoSoalan = (TextView) convertView.findViewById(R.id.tvNoSoalan);
            viewHolder.tvSoalan = (TextView) convertView.findViewById(R.id.tvSoalan);

            convertView.setTag(viewHolder);
        } else
            viewHolder = (ViewHolder) convertView.getTag();

        if(listSoalan[position] != null) {
            viewHolder.tvNoSoalan.setText(String.valueOf(position + 1));
            viewHolder.tvSoalan.setText(listSoalan[position]);
        }

        return convertView;
    }

    private class ViewHolder {
        TextView tvNoSoalan, tvSoalan;
    }
}
