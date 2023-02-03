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
            "Государство на юго-западе Южной Америки","Государство в юго-восточной части Южной Америки","Эквадор – страна в Южной Америке на побережье Тихого океана, территорию которой пересекает экватор"
    ,"Венесуэла – это страна на северном побережье Южной Америки, известная невероятной красотой своей природы",
    "Перу – страна в Южной Америке, на территории которой расположены тропические леса Амазонии и Мачу-Пикчу"};

    public void setSelectedItem(String selectedItem) {
        TextView view = getView().findViewById(R.id.detailsText);
        TextView view2 = getView().findViewById(R.id.detailsText2);
        String s = "";    switch (selectedItem){
            case "Бразилия": {
                s = info[0];            break;        }
            case "Аргентина": {
                s = info[1];            break;        }
            case "Колумбия":
                s = info[2];            break;        case "Чили":
                s = info[3];            break;        case "Уругвай":
                s = info[4];            break;
            case "Эквадор":
                s = info[5];
                break;

            case "Венесуэла":
                s = info[6];
                break;
            case"Перу":
                s = info[7];
                break;

        }
            view2.setText(s);

        view.setText(selectedItem);

    }
}


