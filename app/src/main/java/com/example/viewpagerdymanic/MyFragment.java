package com.example.viewpagerdymanic;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MyFragment extends Fragment {

    TextView txt_fragment;
    Button btn;
    int position;

    public MyFragment() {
        // Required empty public constructor
    }


    public static MyFragment newInstance(int position) {
        MyFragment fragment = new MyFragment();

        fragment.position = position;

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my, container, false);

        txt_fragment = view.findViewById(R.id.txt_fragment);
        btn = view.findViewById(R.id.btn);
        txt_fragment.setText("fragment " + position);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "fragment "+position + "selected", Toast.LENGTH_SHORT).show();
            }
        });



        return view;
    }
}