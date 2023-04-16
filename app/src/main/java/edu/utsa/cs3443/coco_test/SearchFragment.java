package edu.utsa.cs3443.coco_test;

//import static edu.utsa.cs3443.coco_test.LoginActivity.userNameList;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class SearchFragment extends Fragment {

    private SearchView searchView;
    ListView listView;
    ArrayAdapter<String> arrayAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Declaration and initialization of the View object that represents the Search fragment (screen) -- Josh
        View mainView = inflater.inflate(R.layout.fragment_search, container, false);
        // Inflate the layout for this fragment
        return mainView;
    }

   /* @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        searchView = view.findViewById(R.id.searchview_fragment_search);
        listView = view.findViewById(R.id.listview_fragment_search);
        arrayAdapter = new ArrayAdapter<>(view.getContext(), android.R.layout.simple_list_item_1, userNameList);
        listView.setAdapter(arrayAdapter);
        searchView.setQueryHint("Type here to search...");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });
    }*/
}