package com.g_crime.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.g_crime.Adapter.SoalanAdapter;
import com.g_crime.R;

public class Category3 extends Fragment {

    public Category3() {
    }

    private String[] listSoalan3_1 = new String[2];
    private String[] listSoalan3_2 = new String[1];
    private String[] listSoalan3_3 = new String[1];
    private String[] listSoalan3_4 = new String[4];

    private int[] listNoSoalan3_1 = new int[2];
    private int[] listNoSoalan3_2 = new int[1];
    private int[] listNoSoalan3_3 = new int[1];
    private int[] listNoSoalan3_4 = new int[4];

    private RecyclerView rcSoalan3_1, rcSoalan3_2, rcSoalan3_3, rcSoalan3_4;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category3, container, false);

        rcSoalan3_1 = (RecyclerView) v.findViewById(R.id.rcSoalan3_1);
        rcSoalan3_2 = (RecyclerView) v.findViewById(R.id.rcSoalan3_2);
        rcSoalan3_3 = (RecyclerView) v.findViewById(R.id.rcSoalan3_3);
        rcSoalan3_4 = (RecyclerView) v.findViewById(R.id.rcSoalan3_4);

        //setup soalan dan no soalan
        listSoalan3_1[0] = getString(R.string.cS38);
        listSoalan3_1[1] = getString(R.string.cS39);
        listSoalan3_2[0] = getString(R.string.cS40);
        listSoalan3_3[0] = getString(R.string.cS41);
        listSoalan3_4[0] = getString(R.string.cS42);
        listSoalan3_4[1] = getString(R.string.cS43);
        listSoalan3_4[2] = getString(R.string.cS44);
        listSoalan3_4[3] = getString(R.string.cS45);

        listNoSoalan3_1[0] = 38;
        listNoSoalan3_1[1] = 39;
        listNoSoalan3_2[0] = 40;
        listNoSoalan3_3[0] = 41;
        listNoSoalan3_4[0] = 42;
        listNoSoalan3_4[1] = 43;
        listNoSoalan3_4[2] = 44;
        listNoSoalan3_4[3] = 45;

        rcSoalan3_1.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan3_1.setItemAnimator(new DefaultItemAnimator());
        rcSoalan3_2.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan3_2.setItemAnimator(new DefaultItemAnimator());
        rcSoalan3_3.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan3_3.setItemAnimator(new DefaultItemAnimator());
        rcSoalan3_4.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan3_4.setItemAnimator(new DefaultItemAnimator());

        rcSoalan3_1.setAdapter(new SoalanAdapter(listNoSoalan3_1, listSoalan3_1));
        rcSoalan3_2.setAdapter(new SoalanAdapter(listNoSoalan3_2, listSoalan3_2));
        rcSoalan3_3.setAdapter(new SoalanAdapter(listNoSoalan3_3, listSoalan3_3));
        rcSoalan3_4.setAdapter(new SoalanAdapter(listNoSoalan3_4, listSoalan3_4));

        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //Save dalam bundle untuk calculation
    }
}
