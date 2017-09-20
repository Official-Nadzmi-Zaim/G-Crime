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

import static com.g_crime.Activity.MainActivity.array_2;
import static com.g_crime.Activity.MainActivity.cat2SecScores;
import static com.g_crime.Activity.MainActivity.sumCategory2;

public class Category2 extends Fragment implements View.OnClickListener {

    private String[] listSoalan2_1 = new String[3];
    private String[] listSoalan2_2 = new String[2];
    private String[] listSoalan2_3 = new String[1];
    private String[] listSoalan2_4 = new String[2];
    private String[] listSoalan2_5 = new String[3];
    private String[] listSoalan2_6 = new String[2];
    private String[] listSoalan2_7 = new String[1];
    private String[] listSoalan2_8 = new String[2];
    private String[] listSoalan2_9 = new String[2];

    private int[] listNoSoalan2_1 = new int[3];
    private int[] listNoSoalan2_2 = new int[2];
    private int[] listNoSoalan2_3 = new int[1];
    private int[] listNoSoalan2_4 = new int[2];
    private int[] listNoSoalan2_5 = new int[3];
    private int[] listNoSoalan2_6 = new int[2];
    private int[] listNoSoalan2_7 = new int[1];
    private int[] listNoSoalan2_8 = new int[2];
    private int[] listNoSoalan2_9 = new int[2];

    private int[] listColor2_1 = new int[3]; //0, 1, 2
    private int[] listColor2_2 = new int[2]; //3, 4
    private int[] listColor2_3 = new int[1]; //5
    private int[] listColor2_4 = new int[2]; //6, 7
    private int[] listColor2_5 = new int[3]; //8, 9, 10
    private int[] listColor2_6 = new int[2]; //11, 12
    private int[] listColor2_7 = new int[1]; //13
    private int[] listColor2_8 = new int[2]; //14, 15
    private int[] listColor2_9 = new int[2]; //16

    public Category2() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category2, container, false);

        sumCategory2 = 0;
        cat2SecScores = new int[9];

        Button btnCalc = (Button) v.findViewById(R.id.btnCalcC2);
        btnCalc.setOnClickListener(this);

        RecyclerView rcSoalan2_1 = (RecyclerView) v.findViewById(R.id.rcSoalan2_1);
        RecyclerView rcSoalan2_2 = (RecyclerView) v.findViewById(R.id.rcSoalan2_2);
        RecyclerView rcSoalan2_3 = (RecyclerView) v.findViewById(R.id.rcSoalan2_3);
        RecyclerView rcSoalan2_4 = (RecyclerView) v.findViewById(R.id.rcSoalan2_4);
        RecyclerView rcSoalan2_5 = (RecyclerView) v.findViewById(R.id.rcSoalan2_5);
        RecyclerView rcSoalan2_6 = (RecyclerView) v.findViewById(R.id.rcSoalan2_6);
        RecyclerView rcSoalan2_7 = (RecyclerView) v.findViewById(R.id.rcSoalan2_7);
        RecyclerView rcSoalan2_8 = (RecyclerView) v.findViewById(R.id.rcSoalan2_8);
        RecyclerView rcSoalan2_9 = (RecyclerView) v.findViewById(R.id.rcSoalan2_9);

        //Setup no soalan
        listNoSoalan2_1[0] = 1;
        listNoSoalan2_1[1] = 2;
        listNoSoalan2_1[2] = 3;
        listNoSoalan2_2[0] = 4;
        listNoSoalan2_2[1] = 5;
        listNoSoalan2_3[0] = 6;
        listNoSoalan2_4[0] = 7;
        listNoSoalan2_4[1] = 8;
        listNoSoalan2_5[0] = 9;
        listNoSoalan2_5[1] = 10;
        listNoSoalan2_5[2] = 11;
        listNoSoalan2_6[0] = 12;
        listNoSoalan2_6[1] = 13;
        listNoSoalan2_7[0] = 14;
        listNoSoalan2_8[0] = 15;
        listNoSoalan2_8[1] = 16;
        listNoSoalan2_9[0] = 17;
        listNoSoalan2_9[1] = 18;

        //Setup soalan
        listSoalan2_1[0] = getString(R.string.cS20);
        listSoalan2_1[1] = getString(R.string.cS21);
        listSoalan2_1[2] = getString(R.string.cS22);
        listSoalan2_2[0] = getString(R.string.cS23);
        listSoalan2_2[1] = getString(R.string.cS24);
        listSoalan2_3[0] = getString(R.string.cS25);
        listSoalan2_4[0] = getString(R.string.cS26);
        listSoalan2_4[1] = getString(R.string.cS27);
        listSoalan2_5[0] = getString(R.string.cS28);
        listSoalan2_5[1] = getString(R.string.cS29);
        listSoalan2_5[2] = getString(R.string.cS30);
        listSoalan2_6[0] = getString(R.string.cS31);
        listSoalan2_6[1] = getString(R.string.cS32);
        listSoalan2_7[0] = getString(R.string.cS33);
        listSoalan2_8[0] = getString(R.string.cS34);
        listSoalan2_8[1] = getString(R.string.cS35);
        listSoalan2_9[0] = getString(R.string.cS36);
        listSoalan2_9[1] = getString(R.string.cS37);

        //setup jawapan
        System.arraycopy(array_2, 0, listColor2_1, 0, listColor2_1.length);
        System.arraycopy(array_2, 3, listColor2_2, 0, listColor2_2.length);
        System.arraycopy(array_2, 5, listColor2_3, 0, listColor2_3.length);
        System.arraycopy(array_2, 6, listColor2_4, 0, listColor2_4.length);
        System.arraycopy(array_2, 8, listColor2_5, 0, listColor2_5.length);
        System.arraycopy(array_2, 11, listColor2_6, 0, listColor2_6.length);
        System.arraycopy(array_2, 13, listColor2_7, 0, listColor2_7.length);
        System.arraycopy(array_2, 14, listColor2_8, 0, listColor2_8.length);
        System.arraycopy(array_2, 16, listColor2_9, 0, listColor2_9.length);

        //Setup recyclelist
        rcSoalan2_1.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_1.setItemAnimator(new DefaultItemAnimator());
        rcSoalan2_2.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_2.setItemAnimator(new DefaultItemAnimator());
        rcSoalan2_3.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_3.setItemAnimator(new DefaultItemAnimator());
        rcSoalan2_4.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_4.setItemAnimator(new DefaultItemAnimator());
        rcSoalan2_5.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_5.setItemAnimator(new DefaultItemAnimator());
        rcSoalan2_6.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_6.setItemAnimator(new DefaultItemAnimator());
        rcSoalan2_7.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_7.setItemAnimator(new DefaultItemAnimator());
        rcSoalan2_8.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_8.setItemAnimator(new DefaultItemAnimator());
        rcSoalan2_9.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcSoalan2_9.setItemAnimator(new DefaultItemAnimator());

        rcSoalan2_1.setAdapter(new SoalanAdapter(listNoSoalan2_1, listSoalan2_1, listColor2_1));
        rcSoalan2_2.setAdapter(new SoalanAdapter(listNoSoalan2_2, listSoalan2_2, listColor2_2));
        rcSoalan2_3.setAdapter(new SoalanAdapter(listNoSoalan2_3, listSoalan2_3, listColor2_3));
        rcSoalan2_4.setAdapter(new SoalanAdapter(listNoSoalan2_4, listSoalan2_4, listColor2_4));
        rcSoalan2_5.setAdapter(new SoalanAdapter(listNoSoalan2_5, listSoalan2_5, listColor2_5));
        rcSoalan2_6.setAdapter(new SoalanAdapter(listNoSoalan2_6, listSoalan2_6, listColor2_6));
        rcSoalan2_7.setAdapter(new SoalanAdapter(listNoSoalan2_7, listSoalan2_7, listColor2_7));
        rcSoalan2_8.setAdapter(new SoalanAdapter(listNoSoalan2_8, listSoalan2_8, listColor2_8));
        rcSoalan2_9.setAdapter(new SoalanAdapter(listNoSoalan2_9, listSoalan2_9, listColor2_9));

        return v;
    }

    @Override
    public void onClick(View v) {

        //Copy balik ke dalam original array
        System.arraycopy(listColor2_1, 0, array_2, 0, listColor2_1.length);
        System.arraycopy(listColor2_2, 0, array_2, 3, listColor2_2.length);
        System.arraycopy(listColor2_3, 0, array_2, 5, listColor2_3.length);
        System.arraycopy(listColor2_4, 0, array_2, 6, listColor2_4.length);
        System.arraycopy(listColor2_5, 0, array_2, 8, listColor2_5.length);
        System.arraycopy(listColor2_6, 0, array_2, 11, listColor2_6.length);
        System.arraycopy(listColor2_7, 0, array_2, 13, listColor2_7.length);
        System.arraycopy(listColor2_8, 0, array_2, 14, listColor2_8.length);
        System.arraycopy(listColor2_9, 0, array_2, 16, listColor2_9.length);

        switch (v.getId()){
            case R.id.btnCalcC2:
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

                for(int x=0 ; x<array_2.length ; x++)
                    if(x >= 0 && x <= 2)
                        cat2SecScores[0] += (array_2[x] - 1) * 10;
                    else if(x >= 3 && x <= 4)
                        cat2SecScores[1] += (array_2[x] - 1) * 10;
                    else if(x == 5)
                        cat2SecScores[2] += (array_2[x] - 1) * 10;
                    else if(x >= 6 && x <= 7)
                        cat2SecScores[3] += (array_2[x] - 1) * 10;
                    else if(x >= 8 && x <= 10)
                        cat2SecScores[4] += (array_2[x] - 1) * 10;
                    else if(x >= 11 && x <= 12)
                        cat2SecScores[5] += (array_2[x] - 1) * 10;
                    else if(x == 13)
                        cat2SecScores[6] += (array_2[x] - 1) * 10;
                    else if(x >= 14 && x <= 15)
                        cat2SecScores[7] += (array_2[x] - 1) * 10;
                    else
                        cat2SecScores[8] += (array_2[x] - 1) * 10;

                getActivity().getSupportFragmentManager().popBackStack();
                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        // kira summation of this category
        for (int score : cat2SecScores)
            sumCategory2 += score;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Save", "Saving bundle yawwww");
    }
}
