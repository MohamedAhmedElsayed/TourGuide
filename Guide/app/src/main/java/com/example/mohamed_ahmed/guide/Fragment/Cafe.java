package com.example.mohamed_ahmed.guide.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.mohamed_ahmed.guide.Adapter.My_custom_adapter;
import com.example.mohamed_ahmed.guide.R;

import java.util.ArrayList;
import java.util.List;

public class Cafe extends Fragment {
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.cafe_layout, container, false);
        ListView listView_cafe = (ListView) myView.findViewById(R.id.list_cafe);
        List<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem(getResources().getString(R.string.cafe1_name), getResources().getString(R.string.cafe1_location),
                getResources().getString(R.string.cafe1_tel)));
        items.add(new ListItem(getResources().getString(R.string.cafe2_name), getResources().getString(R.string.cafe2_location),
                getResources().getString(R.string.cafe2_tel)));
        items.add(new ListItem(getResources().getString(R.string.cafe3_name), getResources().getString(R.string.cafe3_location),
                getResources().getString(R.string.cafe3_tel)));
        items.add(new ListItem(getResources().getString(R.string.cafe4_name), getResources().getString(R.string.cafe4_location),
                getResources().getString(R.string.cafe4_tel)));
        items.add(new ListItem(getResources().getString(R.string.cafe5_name), getResources().getString(R.string.cafe5_location),
                getResources().getString(R.string.cafe5_tel)));
        My_custom_adapter myCustomAdapter = new My_custom_adapter(getActivity(), R.layout.raw_view, items);
        listView_cafe.setAdapter(myCustomAdapter);
        return myView;
    }
}