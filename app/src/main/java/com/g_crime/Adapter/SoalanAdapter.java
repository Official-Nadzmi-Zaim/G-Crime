package com.g_crime.Adapter;


import android.support.v7.widget.RecyclerView;
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

    class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView txtNoSoalan, txtSoalan;
        private Button btnSoalan;

        MyViewHolder(View itemView) {
            super(itemView);

            txtNoSoalan = (TextView) itemView.findViewById(R.id.txtNoSoalan);
            txtSoalan = (TextView) itemView.findViewById(R.id.txtSoalan);
            btnSoalan = (Button) itemView.findViewById(R.id.btnSoalan);
        }
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.txtNoSoalan.setText("" + listNoSoalan[position]);
        holder.txtSoalan.setText(listSoalan[position]);
    }

    @Override
    public int getItemCount() {
        return listSoalan.length;
    }
}
