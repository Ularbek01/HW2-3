package com.example.lesson2_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class SceondFragment extends Fragment {

    private Button button2;
    private EditText editText2;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        editText2 = view.findViewById(R.id.edt_text2);
        String value = getArguments().getString(FirstFragment.KEY_FOR_BUNDLE);
        editText2.setText(value);

    }

    public void onClickListener(View view) {
        requireActivity().getSupportFragmentManager().beginTransaction().
                replace(R.id.conteiner, new ThirdFragment()).commit();
    }
}
