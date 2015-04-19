/*package com.example.deepika.foodspot;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


import java.util.List;

/**
 * Created by Deepika on 18-04-2015.
 */
/*public class MenuListAdapter extends ArrayAdapter<String> {
    private LayoutInflater inflater;
    private Context context;
    private String[] item;
    private String[] cost;
    private String ADAPTER="ADAPTER";


    public MenuListAdapter(Context context, int resource,String[] item, String[] cost) {
        super(context, resource);
        this.item=item;
        this.cost=cost;
        this.context= context;

    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public String getItem(int position) {
        return item[position];
    }


    public int getCost(int position){
        return Integer.parseInt(cost[position]);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView itemName, cost;
        CheckBox check;
        inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.my_list, parent, false);
        itemName = (TextView) view.findViewById(R.id.item);
        cost = (TextView) view.findViewById(R.id.cost);
        check = (CheckBox) view.findViewById(R.id.checkbox);
        itemName.setText(getItem(position));
        cost.setText(getCost(position) + "");
        if (check.isChecked()) {
            Toast.makeText(context, item[position] + " added", Toast.LENGTH_SHORT).show();
            Log.d(ADAPTER,"is checked");

        }
        return view;

    }





    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }



    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }



    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}*/
