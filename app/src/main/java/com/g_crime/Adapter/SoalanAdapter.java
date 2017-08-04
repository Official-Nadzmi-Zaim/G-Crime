package com.g_crime.Adapter;


import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.g_crime.R;


public class SoalanAdapter extends RecyclerView.Adapter<SoalanAdapter.MyViewHolder> {

    private String[] listSoalan;
    private int[] listNoSoalan;

    public SoalanAdapter(int[] listNoSoalan, String[] listSoalan) {
        this.listNoSoalan = listNoSoalan;
        this.listSoalan = listSoalan;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.soalan, parent, false);
        return new MyViewHolder(view);
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView txtNoSoalan, txtSoalan;
        private Button btnSoalan;

        MyViewHolder(View itemView) {
            super(itemView);

            txtNoSoalan = (TextView) itemView.findViewById(R.id.txtNoSoalan);
            txtSoalan = (TextView) itemView.findViewById(R.id.txtSoalan);
            btnSoalan = (Button) itemView.findViewById(R.id.btnSoalan);

            btnSoalan.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnSoalan:
                    int color = ((ColorDrawable) v.getBackground()).getColor();

                    if (color == Color.parseColor("#00FF00")) //Green
                        v.setBackgroundColor(Color.parseColor("#FFFF00"));
                    else if (color == Color.parseColor("#FFFF00")) //Yellow
                        v.setBackgroundColor(Color.parseColor("#FFAA2A"));
                    else if (color == Color.parseColor("#FFAA2A")) //Orange
                        v.setBackgroundColor(Color.parseColor("#FF0000"));
                    else //Red
                        v.setBackgroundColor(Color.parseColor("#00FF00"));
                    break;
            }
        }
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.txtNoSoalan.setText(String.valueOf(listNoSoalan[position]));
        holder.txtSoalan.setText(listSoalan[position]);
    }

    @Override
    public int getItemCount() {
        return listSoalan.length;
    }
}
