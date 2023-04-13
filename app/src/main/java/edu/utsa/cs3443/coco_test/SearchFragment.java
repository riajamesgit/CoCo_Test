package edu.utsa.cs3443.coco_test;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SearchFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /**
         * TODOS:
         * - Create a search function that finds the profile ( and maybe other profiles similar to the input? ) that user inputs
         * - Not sure what else to do lol
         *  -- Zach
         */
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);
    }
}