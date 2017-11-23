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

/**
 * Created by Mohamed_Ahmed on 29/09/2017.
 */
public class resturant extends Fragment {
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.resturant_layout, container, false);
        ListView listView_cafe = (ListView) myView.findViewById(R.id.list_res);
        List<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem(getResources().getString(R.string.rest1_name), getResources().getString(R.string.rest1_location),
                getResources().getString(R.string.rest1_tel)));
        items.add(new ListItem(getResources().getString(R.string.rest2_name), getResources().getString(R.string.rest2_location),
                getResources().getString(R.string.rest2_tel)));
        items.add(new ListItem(getResources().getString(R.string.rest3_name), getResources().getString(R.string.rest3_location),
                getResources().getString(R.string.rest3_tel)));
        items.add(new ListItem(getResources().getString(R.string.rest4_name), getResources().getString(R.string.rest4_location),
                getResources().getString(R.string.rest4_tel)));
        items.add(new ListItem(getResources().getString(R.string.rest5_name), getResources().getString(R.string.rest5_location),
                getResources().getString(R.string.rest5_tel)));
        My_custom_adapter myCustomAdapter = new My_custom_adapter(getActivity(), R.layout.raw_view, items);
        listView_cafe.setAdapter(myCustomAdapter);
        return myView;
    }
}
