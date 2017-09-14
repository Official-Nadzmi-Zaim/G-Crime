package com.g_crime.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.g_crime.R;
import static com.g_crime.Activity.MainActivity.array_1;
import static com.g_crime.Activity.MainActivity.array_2;
import static com.g_crime.Activity.MainActivity.array_3;

public class FrontPage extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_front_page, container, false);

        //1 - Hijau , 2 - Kuning, 3 - Oren, 4 - Merah;
        for (int i=0; i<array_1.length; i++){
            array_1[i] = 1;
        }
        for (int i=0; i<array_2.length; i++){
            array_2[i] = 1;
        }
        for (int i=0; i<array_3.length; i++){
            array_3[i] = 1;
        }

        Button btnStart = (Button) v.findViewById(R.id.btnStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new Result()).addToBackStack(null).commit();
            }
        });
        return v;
    }
}
