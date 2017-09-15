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

    private String[] listSoalan1_1 = new String[19];
    private int[] listNoSoalan1_1 = new int[19];
    private int[] listColor1_1 = new int[19];

    public Category1() {
        System.arraycopy(array_1, 0, listColor1_1, 0, listColor1_1.length);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category1, container, false);

        RecyclerView rcSoalan1_1 = (RecyclerView) v.findViewById(R.id.rcSoalan1_1);

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

        Button btnCalc = (Button) v.findViewById(R.id.btnCalcC1);
        btnCalc.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {

        //Copy nilai list _color ke dalam array_1.. Nnti boleh retreive balik
        System.arraycopy(listColor1_1, 0, array_1, 0, listColor1_1.length);

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
        sumCategory1 = 0;

        for (int score : cat1SecScores)
            sumCategory1 += score;
    }
}
