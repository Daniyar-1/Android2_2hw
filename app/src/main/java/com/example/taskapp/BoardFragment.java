package com.example.taskapp;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class BoardFragment extends Fragment {


    public BoardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_board, container, false);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textTitle = view.findViewById(R.id.textTitle);
        TextView textDesc = view.findViewById(R.id.textDesc);

        RelativeLayout background = view.findViewById(R.id.background);
        Button btnSkip = view.findViewById(R.id.button_skip);
        Button btnStart = view.findViewById(R.id.button_start);

        int pos = getArguments().getInt("pos");
        switch (pos) {
            case 0:
                imageView.setImageResource(R.drawable.smile1);
                textTitle.setText("Hello!");
                background.setBackgroundColor(Color.YELLOW);
                break;
            case 1:
                imageView.setImageResource(R.drawable.smile2);
                textTitle.setText("How is it going?");
                background.setBackgroundColor(Color.CYAN);
                break;
            case 2:
                imageView.setImageResource(R.drawable.smile3);
                textTitle.setText("Bye!");
                background.setBackgroundColor(Color.GREEN);
                btnSkip.setVisibility(View.GONE);
                btnStart.setVisibility(View.VISIBLE);
                break;
        }
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getActivity().getSharedPreferences("settings", Context.MODE_PRIVATE);
                preferences.edit().putBoolean("isShown", true).apply();
                startActivity(new Intent(getContext(), MainActivity.class));
                getActivity().finish();
            }
        });

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getActivity().getSharedPreferences("settings", Context.MODE_PRIVATE);
                preferences.edit().putBoolean("isShown", true).apply();
                startActivity(new Intent(getContext(), MainActivity.class));
                getActivity().finish();
            }
        });

        return view;
    }

}
