package com.example.android.project1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by liber on 01.02.2017.
 */

public class FragmentOne extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup parent, Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_one, parent, false);
    }
    public void onViewCreated(View view, Bundle savedInstanceState){}
}
