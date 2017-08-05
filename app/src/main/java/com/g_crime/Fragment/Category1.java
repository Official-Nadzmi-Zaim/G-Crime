package com.g_crime.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.g_crime.Adapter.SoalanAdapter;
import com.g_crime.R;

public class Category1 extends Fragment implements View.OnClickListener{

    private String[] listSoalan1_1 = new String[19];
    private int[] listNoSoalan1_1 = new int[19];
    private int[] listColor1_1 = new int[19];

    private RecyclerView rcSoalan1_1;
    private Button btnBack, btnNext;

    public Category1() {
        for (int i=0; i<listColor1_1.length; i++){
            listColor1_1[i] = 1;
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category1, container, false);

        rcSoalan1_1 = (RecyclerView) v.findViewById(R.id.rcSoalan1_1);

        Bundle b = this.getArguments();

        if (b != null){
            listColor1_1 = b.getIntArray("listColor1_1");
            Log.d("Bundle", "Ada");
        }

        //masukkan soalan ke dalam listSoalan
        for (int i=0; i<19; i++){
            String soalanId = "cS" + (i + 1);
            int id = getResources().getIdentifier(soalanId, "string", getActivity().getPackageName());
            listSoalan1_1[i] = getString(id);
            listNoSoalan1_1[i] = (i + 1);
        }


        rcSoalan1_1.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan1_1.setItemAnimator(new DefaultItemAnimator());
        rcSoalan1_1.setAdapter(new SoalanAdapter(listNoSoalan1_1, listSoalan1_1, listColor1_1));

        btnBack = (Button) v.findViewById(R.id.btnBack1);
        btnNext = (Button) v.findViewById(R.id.btnNext1);

        btnBack.setOnClickListener(this);
        btnNext.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {

        //letak balik dalam bundle
        Bundle a = this.getArguments();
        Bundle b = new Bundle();
        b.putIntArray("listColor1_1", listColor1_1);

        if (a == null){
            Log.d("Bundle", "Null");
        }else{
            Log.d("Bundle", "Not Null");
            b.putIntArray("listColor2_1", a.getIntArray("listColor2_1"));
            b.putIntArray("listColor2_2", a.getIntArray("listColor2_2"));
            b.putIntArray("listColor2_3", a.getIntArray("listColor2_3"));
            b.putIntArray("listColor2_4", a.getIntArray("listColor2_4"));
            b.putIntArray("listColor2_5", a.getIntArray("listColor2_5"));
            b.putIntArray("listColor2_6", a.getIntArray("listColor2_6"));
            b.putIntArray("listColor2_7", a.getIntArray("listColor2_7"));
            b.putIntArray("listColor2_8", a.getIntArray("listColor2_8"));
            b.putIntArray("listColor2_9", a.getIntArray("listColor2_9"));

            b.putIntArray("listColor3_1", a.getIntArray("listColor3_1"));
            b.putIntArray("listColor3_2", a.getIntArray("listColor3_2"));
            b.putIntArray("listColor3_3", a.getIntArray("listColor3_3"));
            b.putIntArray("listColor3_4", a.getIntArray("listColor3_4"));
        }

        switch (v.getId()){
            case R.id.btnBack1:
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new FrontPage()).commit();
                break;
            case R.id.btnNext1:
                Category2 c2 = new Category2();
                c2.setArguments(b);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, c2).commit();
                break;
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //Calculate kat sini
    }
}
