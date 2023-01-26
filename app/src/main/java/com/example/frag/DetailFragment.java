package com.example.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class DetailFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }
    String[] info = {"Суверенное государство в Южной Америке",
            "Второе после Бразилии по территории и третье после Бразилии и Колумбии по населению государство Южной Америки","Государство на северо-западе Южной Америки",
            "Государство на юго-западе Южной Америки","Государство в юго-восточной части Южной Америки"};
    public void setSelectedItem(String selectedItem) {
        TextView view = getView().findViewById(R.id.detailsText);
        TextView view2 = getView().findViewById(R.id.detailsText2);
        view.setText(selectedItem);

    }
}
