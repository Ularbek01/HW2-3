package com.example.lesson2_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class ThirdFragment extends Fragment {

    private Button button03;
    private TextView txtView;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button03 = view.findViewById(R.id.button3);
        txtView = view.findViewById(R.id.txt_view);
        String value2 = getArguments().getString(FirstFragment.KEY_FOR_BUNDLE);
        txtView.setText(value2);



    }

    public void onClickButton(View view) {
        requireActivity().getSupportFragmentManager().beginTransaction().
                replace(R.id.conteiner, new FirstFragment()).commit();
    }
}
