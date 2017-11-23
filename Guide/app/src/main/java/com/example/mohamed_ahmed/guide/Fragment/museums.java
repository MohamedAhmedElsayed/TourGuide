package com.example.mohamed_ahmed.guide.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.mohamed_ahmed.guide.Adapter.Muse_custom_adapter;
import com.example.mohamed_ahmed.guide.R;

import java.util.ArrayList;
import java.util.List;

public class museums extends Fragment {
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.museums_layout, container, false);
        ListView listView_cafe = (ListView) myView.findViewById(R.id.list_mus);
        List<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem(getResources().getString(R.string.museum1_name), getResources().getString(R.string.museum1_location),
                getResources().getString(R.string.museum1_tel), R.drawable.azhar));
        items.add(new ListItem(getResources().getString(R.string.museum2_name), getResources().getString(R.string.museum2_location),
                getResources().getString(R.string.museum2_tel), R.drawable.egymuse));
        items.add(new ListItem(getResources().getString(R.string.museum3_name), getResources().getString(R.string.museum3_location),
                getResources().getString(R.string.museum3_tel), R.drawable.egy_art));
        items.add(new ListItem(getResources().getString(R.string.museum4_name), getResources().getString(R.string.museum4_location),
                getResources().getString(R.string.museum4_tel), R.drawable.pyramids));
        items.add(new ListItem(getResources().getString(R.string.museum5_name), getResources().getString(R.string.museum5_location),
                getResources().getString(R.string.museum5_tel), R.drawable.umma_museum));
        Muse_custom_adapter myCustomAdapter = new Muse_custom_adapter(getActivity(), R.layout.raw_item_with_image, items);
        listView_cafe.setAdapter(myCustomAdapter);
        return myView;
    }
}
