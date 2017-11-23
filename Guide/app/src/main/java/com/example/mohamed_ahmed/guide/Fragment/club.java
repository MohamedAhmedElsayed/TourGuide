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
public class club extends Fragment {
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.clubs_layout, container, false);
        ListView listView_cafe = (ListView) myView.findViewById(R.id.list_club);
        List<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem("El Zamalek Club", "El-Zamalek,Cairo", "+201223555511"));
        items.add(new ListItem("Lobby Lounge", "1089 El Nile Corniche ,Cairo", "0223910151"));
        items.add(new ListItem("El Gezera", "130 Nile Street", "+20112211457"));
        items.add(new ListItem("Regina Club", "30 Nile Street,Cairo", "+20124544577"));
        items.add(new ListItem("Stage One  ", "Cornad Cairo", "+20104544474"));
        My_custom_adapter myCustomAdapter = new My_custom_adapter(getActivity(), R.layout.raw_view, items);
        listView_cafe.setAdapter(myCustomAdapter);
        return myView;
    }
}
