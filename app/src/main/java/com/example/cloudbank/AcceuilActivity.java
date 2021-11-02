package com.example.cloudbank;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.cloudbank.adapter.Country;
import com.example.cloudbank.adapter.CustomListAdapter;
import com.example.cloudbank.adapter.UserAccount;

import java.util.ArrayList;
import java.util.List;


public class AcceuilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);

        List<Country> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(this, image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Country country = (Country) o;
                Toast.makeText(AcceuilActivity.this, "Selected :" + " " + country, Toast.LENGTH_LONG).show();
            }
        });

    }

    private List<Country> getListData() {
        List<Country> list = new ArrayList<>();
        Country vietnam = new Country("Vietnam", "1", 98000000);
        Country usa = new Country("United States", "1", 320000000);
        Country russia = new Country("Russia", "1", 142000000);


        list.add(vietnam);
        list.add(usa);
        list.add(russia);

        return list;
    }


}