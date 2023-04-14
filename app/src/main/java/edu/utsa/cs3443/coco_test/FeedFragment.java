package edu.utsa.cs3443.coco_test;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class FeedFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /**
         * TODOS:
         *  - Check to see if this code below works ( if anyone sees this can yall please try to run this and see if theres 11
         *  TextViews in feed )
         *  - Find out a way to get a feed to refresh the top X amount of posts
         *      - Probably with a function
         *          -- Zach
         *
         */
        LinearLayout L = new LinearLayout(getContext());
        final int N = 10; // total number of textviews to add

        final TextView[] myTextViews = new TextView[N]; // create an empty array;

        for (int i = 0; i < N; i++) {
            // create a new textview
            final TextView rowTextView = new TextView(getContext());

            // set some properties of rowTextView or something
            rowTextView.setText("This is row #" + i);

            // add the textview to the linearlayout
            L.addView(rowTextView);

            // save a reference to the textview for later
            myTextViews[i] = rowTextView;
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feed, container, false);

    }
}