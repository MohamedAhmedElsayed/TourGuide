package com.example.mohamed_ahmed.guide.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mohamed_ahmed.guide.Fragment.ListItem;
import com.example.mohamed_ahmed.guide.R;

import java.util.ArrayList;
import java.util.List;

public class My_custom_adapter extends BaseAdapter {
    private List<ListItem> items = new ArrayList<>();
    private Context context;
    private int resource;

    public My_custom_adapter(Context context, int resource, List<ListItem> Items) {
        this.items = Items;
        this.context = context;
        this.resource = resource;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(resource, parent, false);
        TextView name_txt = (TextView) v.findViewById(R.id.text_name);
        TextView location_txt = (TextView) v.findViewById(R.id.text_location);
        TextView tel_txt = (TextView) v.findViewById(R.id.text_tel);
        name_txt.setText(items.get(position).getName());
        location_txt.setText(items.get(position).getLocation());
        tel_txt.setText(items.get(position).getContact());
        return v;
    }
}
