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
import android.widget.Button;

import com.g_crime.Adapter.SoalanAdapter;
import com.g_crime.R;

import static com.g_crime.Activity.MainActivity.array_3;
import static com.g_crime.Activity.MainActivity.cat3SecScores;
import static com.g_crime.Activity.MainActivity.sumCategory3;

public class Category3 extends Fragment implements View.OnClickListener{

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

    private int[] listColor3_1 = new int[2]; //0, 1
    private int[] listColor3_2 = new int[1]; //2
    private int[] listColor3_3 = new int[1]; //3
    private int[] listColor3_4 = new int[4]; //4, 5, 6, 7

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category3, container, false);

        Button btnCalc = (Button) v.findViewById(R.id.btnCalcC3);
        btnCalc.setOnClickListener(this);

        RecyclerView rcSoalan3_1 = (RecyclerView) v.findViewById(R.id.rcSoalan3_1);
        RecyclerView rcSoalan3_2 = (RecyclerView) v.findViewById(R.id.rcSoalan3_2);
        RecyclerView rcSoalan3_3 = (RecyclerView) v.findViewById(R.id.rcSoalan3_3);
        RecyclerView rcSoalan3_4 = (RecyclerView) v.findViewById(R.id.rcSoalan3_4);

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

        //setup color
        System.arraycopy(array_3, 0, listColor3_1, 0, listColor3_1.length);
        System.arraycopy(array_3, 2, listColor3_2, 0, listColor3_2.length);
        System.arraycopy(array_3, 3, listColor3_3, 0, listColor3_3.length);
        System.arraycopy(array_3, 4, listColor3_4, 0, listColor3_4.length);

        rcSoalan3_1.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan3_1.setItemAnimator(new DefaultItemAnimator());
        rcSoalan3_2.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan3_2.setItemAnimator(new DefaultItemAnimator());
        rcSoalan3_3.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan3_3.setItemAnimator(new DefaultItemAnimator());
        rcSoalan3_4.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan3_4.setItemAnimator(new DefaultItemAnimator());

        rcSoalan3_1.setAdapter(new SoalanAdapter(listNoSoalan3_1, listSoalan3_1, listColor3_1));
        rcSoalan3_2.setAdapter(new SoalanAdapter(listNoSoalan3_2, listSoalan3_2, listColor3_2));
        rcSoalan3_3.setAdapter(new SoalanAdapter(listNoSoalan3_3, listSoalan3_3, listColor3_3));
        rcSoalan3_4.setAdapter(new SoalanAdapter(listNoSoalan3_4, listSoalan3_4, listColor3_4));

        return v;
    }

    @Override
    public void onClick(View v) {

        //Save color
        System.arraycopy(listColor3_1, 0, array_3, 0, listColor3_1.length);
        System.arraycopy(listColor3_2, 0, array_3, 2, listColor3_2.length);
        System.arraycopy(listColor3_3, 0, array_3, 3, listColor3_3.length);
        System.arraycopy(listColor3_4, 0, array_3, 4, listColor3_4.length);

        switch (v.getId()){
            case R.id.btnCalcC3:
                // Perform calculation here
                // Save dalam bundle untuk calculation
                // kira result ikut color & simpan dlm static var sumCategory3
                /* Id utk setiap color:
                 * green = 1
                 * yellow = 2
                 * orange = 3
                 * red = 4
                 */
                /* markah utk setiap color
                 * green = 0
                 * yellow = 10
                 * orange = 20
                 * red = 30
                 */

                for(int x=0 ; x<array_3.length ; x++)
                    if(x >= 0 && x <= 1)
                        cat3SecScores[0] += (array_3[x] - 1) * 10;
                    else if(x == 2)
                        cat3SecScores[1] += (array_3[x] - 1) * 10;
                    else if(x == 3)
                        cat3SecScores[2] += (array_3[x] - 1) * 10;
                    else
                        cat3SecScores[3] += (array_3[x] - 1) * 10;

                getActivity().getSupportFragmentManager().popBackStack();
                break;
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();

        // kira summation of this category
        sumCategory3 = 0;

        for (int score : cat3SecScores)
            sumCategory3 += score;
    }
}
