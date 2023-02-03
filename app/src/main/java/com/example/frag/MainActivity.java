package com.example.frag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements ListFragment.OnFragmentSendDataListener {


    String[] info = {"Суверенное государство в Южной Америке",
            "Второе после Бразилии по территории и третье после Бразилии и Колумбии по населению государство Южной Америки","Государство на северо-западе Южной Америки",
            "Государство на юго-западе Южной Америки","Государство в юго-восточной части Южной Америки"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSendData(String selectedItem) {
        DetailFragment fragment = (DetailFragment) getSupportFragmentManager()
                .findFragmentById(R.id.detailFragment);

        if (fragment != null && fragment.isVisible())
            fragment.setSelectedItem(selectedItem);

        else {
            Intent intent = new Intent(getApplicationContext(),
                    DetailActivity.class);
            intent.putExtra(DetailActivity.SELECTED_ITEM, selectedItem);
            startActivity(intent);

        }
    }
}