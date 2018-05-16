package com.example.sebastian.fragmenttrial;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Sebastian on 16.05.2018.
 */

public class Fragment2 extends Fragment {
    private static final String TAG = "Fragment1";

    private Button button1;
    private Button button2;
    private Button button3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2_layout,container,false);

        button1 = (Button) view.findViewById(R.id.button1);
        button2 = (Button) view.findViewById(R.id.button2);
        button3 = (Button) view.findViewById(R.id.button3);
        Log.d(TAG, "onCreateView: started.");


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to fragment 1", Toast.LENGTH_SHORT).show();

                ((MainActivity)getActivity()).setViewPager(0);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to fragment 1", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going to layoud 2", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
