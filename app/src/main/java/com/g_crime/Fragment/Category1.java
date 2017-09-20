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

import static com.g_crime.Activity.MainActivity.array_1;
import static com.g_crime.Activity.MainActivity.cat1SecScores;
import static com.g_crime.Activity.MainActivity.sumCategory1;

public class Category1 extends Fragment implements View.OnClickListener{

    private String[] listSoalan1_1 = new String[3];
    private String[] listSoalan1_2 = new String[3];
    private String[] listSoalan1_3 = new String[1];
    private String[] listSoalan1_4 = new String[1];
    private String[] listSoalan1_5 = new String[1];
    private String[] listSoalan1_6 = new String[1];
    private String[] listSoalan1_7 = new String[9];
    private int[] listNoSoalan1_1 = new int[3];
    private int[] listNoSoalan1_2 = new int[3];
    private int[] listNoSoalan1_3 = new int[1];
    private int[] listNoSoalan1_4 = new int[1];
    private int[] listNoSoalan1_5 = new int[1];
    private int[] listNoSoalan1_6 = new int[1];
    private int[] listNoSoalan1_7 = new int[9];
    private int[] listColor1_1 = new int[3];
    private int[] listColor1_2 = new int[3];
    private int[] listColor1_3 = new int[1];
    private int[] listColor1_4 = new int[1];
    private int[] listColor1_5 = new int[1];
    private int[] listColor1_6 = new int[1];
    private int[] listColor1_7 = new int[9];

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category1, container, false);

        sumCategory1 = 0;
        cat1SecScores = new int[7];

        RecyclerView rcSoalan1_1 = (RecyclerView) v.findViewById(R.id.rcSoalan1_1);
        RecyclerView rcSoalan1_2 = (RecyclerView) v.findViewById(R.id.rcSoalan1_2);
        RecyclerView rcSoalan1_3 = (RecyclerView) v.findViewById(R.id.rcSoalan1_3);
        RecyclerView rcSoalan1_4 = (RecyclerView) v.findViewById(R.id.rcSoalan1_4);
        RecyclerView rcSoalan1_5 = (RecyclerView) v.findViewById(R.id.rcSoalan1_5);
        RecyclerView rcSoalan1_6 = (RecyclerView) v.findViewById(R.id.rcSoalan1_6);
        RecyclerView rcSoalan1_7 = (RecyclerView) v.findViewById(R.id.rcSoalan1_7);

        //setup soalan dan no soalan
        listNoSoalan1_1[0] = 1;
        listNoSoalan1_1[1] = 2;
        listNoSoalan1_1[2] = 3;
        listNoSoalan1_2[0] = 4;
        listNoSoalan1_2[1] = 5;
        listNoSoalan1_2[2] = 6;
        listNoSoalan1_3[0] = 7;
        listNoSoalan1_4[0] = 8;
        listNoSoalan1_5[0] = 9;
        listNoSoalan1_6[0] = 10;
        listNoSoalan1_7[0] = 11;
        listNoSoalan1_7[1] = 12;
        listNoSoalan1_7[2] = 13;
        listNoSoalan1_7[3] = 14;
        listNoSoalan1_7[4] = 15;
        listNoSoalan1_7[5] = 16;
        listNoSoalan1_7[6] = 17;
        listNoSoalan1_7[7] = 18;
        listNoSoalan1_7[8] = 19;

        listSoalan1_1[0] = getString(R.string.cS1);
        listSoalan1_1[1] = getString(R.string.cS2);
        listSoalan1_1[2] = getString(R.string.cS3);
        listSoalan1_2[0] = getString(R.string.cS4);
        listSoalan1_2[1] = getString(R.string.cS5);
        listSoalan1_2[2] = getString(R.string.cS6);
        listSoalan1_3[0] = getString(R.string.cS7);
        listSoalan1_4[0] = getString(R.string.cS8);
        listSoalan1_5[0] = getString(R.string.cS9);
        listSoalan1_6[0] = getString(R.string.cS10);
        listSoalan1_7[0] = getString(R.string.cS11);
        listSoalan1_7[1] = getString(R.string.cS12);
        listSoalan1_7[2] = getString(R.string.cS13);
        listSoalan1_7[3] = getString(R.string.cS14);
        listSoalan1_7[4] = getString(R.string.cS15);
        listSoalan1_7[5] = getString(R.string.cS16);
        listSoalan1_7[6] = getString(R.string.cS17);
        listSoalan1_7[7] = getString(R.string.cS18);
        listSoalan1_7[8] = getString(R.string.cS19);

        //setup color
        System.arraycopy(array_1, 0, listColor1_1, 0, listColor1_1.length);
        System.arraycopy(array_1, 3, listColor1_2, 0, listColor1_2.length);
        System.arraycopy(array_1, 6, listColor1_3, 0, listColor1_3.length);
        System.arraycopy(array_1, 7, listColor1_4, 0, listColor1_4.length);
        System.arraycopy(array_1, 8, listColor1_5, 0, listColor1_5.length);
        System.arraycopy(array_1, 9, listColor1_6, 0, listColor1_6.length);
        System.arraycopy(array_1, 10, listColor1_7, 0, listColor1_7.length);

        rcSoalan1_1.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan1_2.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan1_3.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan1_4.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan1_5.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan1_6.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan1_7.setLayoutManager(new LinearLayoutManager(getActivity()));

        rcSoalan1_1.setItemAnimator(new DefaultItemAnimator());
        rcSoalan1_2.setItemAnimator(new DefaultItemAnimator());
        rcSoalan1_3.setItemAnimator(new DefaultItemAnimator());
        rcSoalan1_4.setItemAnimator(new DefaultItemAnimator());
        rcSoalan1_5.setItemAnimator(new DefaultItemAnimator());
        rcSoalan1_6.setItemAnimator(new DefaultItemAnimator());
        rcSoalan1_7.setItemAnimator(new DefaultItemAnimator());

        rcSoalan1_1.setAdapter(new SoalanAdapter(listNoSoalan1_1, listSoalan1_1, listColor1_1));
        rcSoalan1_2.setAdapter(new SoalanAdapter(listNoSoalan1_2, listSoalan1_2, listColor1_2));
        rcSoalan1_3.setAdapter(new SoalanAdapter(listNoSoalan1_3, listSoalan1_3, listColor1_3));
        rcSoalan1_4.setAdapter(new SoalanAdapter(listNoSoalan1_4, listSoalan1_4, listColor1_4));
        rcSoalan1_5.setAdapter(new SoalanAdapter(listNoSoalan1_5, listSoalan1_5, listColor1_5));
        rcSoalan1_6.setAdapter(new SoalanAdapter(listNoSoalan1_6, listSoalan1_6, listColor1_6));
        rcSoalan1_7.setAdapter(new SoalanAdapter(listNoSoalan1_7, listSoalan1_7, listColor1_7));

        Button btnCalc = (Button) v.findViewById(R.id.btnCalcC1);
        btnCalc.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {

        //Copy nilai list _color ke dalam array_1.. Nnti boleh retreive balik
        System.arraycopy(listColor1_1, 0, array_1, 0, listColor1_1.length);
        System.arraycopy(listColor1_2, 0, array_1, 3, listColor1_2.length);
        System.arraycopy(listColor1_3, 0, array_1, 6, listColor1_3.length);
        System.arraycopy(listColor1_4, 0, array_1, 7, listColor1_4.length);
        System.arraycopy(listColor1_5, 0, array_1, 8, listColor1_5.length);
        System.arraycopy(listColor1_6, 0, array_1, 9, listColor1_6.length);
        System.arraycopy(listColor1_7, 0, array_1, 10, listColor1_7.length);

        switch (v.getId()){
            case R.id.btnCalcC1:
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

                for(int x=0 ; x<array_1.length ; x++)
                    if(x >= 0 && x <= 2)
                        cat1SecScores[0] += (array_1[x] - 1) * 10; // kena tolak 1 sebab id utk setiap color bermula dgn 1(green), tapi markah utk setiap color bermula dgn 0(green)
                    else if(x >= 3 && x <= 5)
                        cat1SecScores[1] += (array_1[x] - 1) * 10;
                    else if(x == 6)
                        cat1SecScores[2] += (array_1[x] - 1) * 10;
                    else if(x == 7)
                        cat1SecScores[3] += (array_1[x] - 1) * 10;
                    else if(x == 8)
                        cat1SecScores[4] += (array_1[x] - 1) * 10;
                    else if(x == 9)
                        cat1SecScores[5] += (array_1[x] - 1) * 10;
                    else
                        cat1SecScores[6] += (array_1[x] - 1) * 10;

                getActivity().getSupportFragmentManager().popBackStack();
                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        // kira summation of this category
        for (int score : cat1SecScores)
            sumCategory1 += score;
    }
}
