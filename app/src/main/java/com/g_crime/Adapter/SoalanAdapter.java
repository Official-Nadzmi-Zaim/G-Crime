package com.g_crime.Adapter;

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
    private int[] listColor;

    public SoalanAdapter(int[] listNoSoalan, String[] listSoalan) {
        this.listNoSoalan = listNoSoalan;
        this.listSoalan = listSoalan;
    }

    public SoalanAdapter(int[] listNoSoalan, String[] listSoalan, int[] listColor) {
        this.listSoalan = listSoalan;
        this.listNoSoalan = listNoSoalan;
        this.listColor = listColor;
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
                    int i = getAdapterPosition();

                    int color = ((ColorDrawable) v.getBackground()).getColor();

                    if (color == Color.parseColor("#00FF00")) //Green
                    {
                        v.setBackgroundResource(R.color.yellow);
                        listColor[i] = 2;
                    }
                    else if (color == Color.parseColor("#FFFF00")) //Yellow
                    {
                        v.setBackgroundResource(R.color.orange);
                        listColor[i] = 3;
                    }
                    else if (color == Color.parseColor("#FFAA2A")) //Orange
                    {
                        v.setBackgroundResource(R.color.red);
                        listColor[i] = 4;
                    }
                    else //Red
                    {
                        v.setBackgroundResource(R.color.green);
                        listColor[i] = 1;
                    }
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

        if (listColor[position] == 1)
            holder.btnSoalan.setBackgroundResource(R.color.green);
        else if (listColor[position] == 2)
            holder.btnSoalan.setBackgroundResource(R.color.yellow);
        else if (listColor[position] == 3)
            holder.btnSoalan.setBackgroundResource(R.color.orange);
        else if (listColor[position] == 4)
            holder.btnSoalan.setBackgroundResource(R.color.red);
    }

    @Override
    public int getItemCount() {
        return listSoalan.length;
    }
}
