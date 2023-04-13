package edu.utsa.cs3443.coco_test;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ConnectionsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /**
         * TODOS:
         * - Crete a function that finds other profiles based on similarities with that user
         * - Find a way to parse that information ?
         *  -- Zach
         */
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_connections, container, false);
    }
}