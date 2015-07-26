package com.example.deepika.foodspot;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class FoodMenu extends ListActivity {

    private String mess[]={"Paneer Paratha","Aloo Paratha", "Sandwich", "Fried Rice", "Dosa", "Chocolate", "Ice- cream"};
    private int cost[]={100, 200, 50 ,100, 300, 300, 60};
    int total=0;
    CheckBox checkBox;
    String MENU= "MENU";
    int position;
    ArrayList<String> menuList= new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_food_menu);
        ListView listView= getListView();
        listView.setTextFilterEnabled(true);

        for(int i=0; i<mess.length; i++){
            switch(position){
                case 1:  menuList.add(i,mess[i]); break;
                case 2: menuList.add(i,mess[i]); break;
                case 3: menuList.add(i,mess[i]); break;
                case 4: menuList.add(i,mess[i]); break;
                case 5: menuList.add(i,mess[i]); break;
            }

            Log.d(MENU,"Switch");
        }

        ListAdapter adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,menuList);
        //ListView listView= (ListView)findViewById(android.R.id.list);
        listView.setAdapter(adapter);

        listView.setChoiceMode(listView.CHOICE_MODE_MULTIPLE);
        Log.d(MENU,"ListView");

        Bundle bundle= new Bundle();
        position= bundle.getInt("position");
        Log.d(MENU,"Bundle");


        Log.d(MENU,"adapter");
        listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                total+=cost[position];
                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    //@Override
    /*protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        checkBox= (CheckBox)getListView().findViewById(R.id.checkbox);
        if(checkBox.isChecked()){
        Toast.makeText(this, mess[position]+" added", Toast.LENGTH_SHORT).show();
    }
    }*/






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_food_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
