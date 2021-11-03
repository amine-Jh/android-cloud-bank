package com.example.cloudbank;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.cloudbank.model.Country;
import com.example.cloudbank.adapter.CustomListAdapter;
import com.example.cloudbank.model.Transaction;

import java.util.ArrayList;
import java.util.List;


public class AcceuilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);

        List<Transaction> image_details = getListData();
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

    private List<Transaction> getListData() {
        List<Country> list = new ArrayList<>();
        List<Transaction> transactions = new ArrayList<>();
        Transaction pay1 = new Transaction("usa","12/23/21","wifi paye","12");
        Transaction pay2 = new Transaction("usa","12/23/21","logement","12");
        Transaction pay3 = new Transaction("usa","12/23/21","alteres ","12");
        Transaction pay4 = new Transaction("usa","12/23/21","alteres ","12");
        transactions.add(pay1);
        transactions.add(pay2);
        transactions.add(pay3);
        transactions.add(pay4);

        return transactions;
    }


}