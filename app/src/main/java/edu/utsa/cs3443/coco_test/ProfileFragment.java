package edu.utsa.cs3443.coco_test;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProfileFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /**
         * TODOS:
         * - Probably create a TextView with a layout of the profile so we can change it
         *   _______________________
         * - |{ImageView}{TextView}| profile picture with their username and/or Name
         *   |{      TextView     }| maybe the profile description?
         *   |{      Button       }| maybe like a change name button?
         *   |{      Button       }| other settings?
         *   |{      Button       }| ...
         *   |{      Button       }| ...
         *   -----------------------
         *    -- Zach
         *
         */
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}