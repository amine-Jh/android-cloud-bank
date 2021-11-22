package com.example.cloudbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
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

       /* Bundle extras=getIntent().getExtras();
        String email_text= new String(extras.getString("email"));
        Log.i("email text",email_text);*/

        List<Transaction> image_details = getListData();

        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(this, image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Transaction country = (Transaction) o;
                Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                intent.putExtra("price",country.getCost());
                intent.putExtra("date",country.getDate());
                intent.putExtra("title",country.getTitle());
                intent.putExtra("image",country.getImageName());
                startActivity(intent);
                Toast.makeText(AcceuilActivity.this, "Selected :" + " " + country, Toast.LENGTH_LONG).show();
            }
        });


    }

    private List<Transaction> getListData() {

        List<Transaction> transactions = new ArrayList<>();
        Transaction pay1 = new Transaction("accept","12/23/21","wifi paye","240");
        Transaction pay2 = new Transaction("laptop","12/23/21","logement","560");
        Transaction pay3 = new Transaction("logement","12/23/21","Laptop ","5890");

        transactions.add(pay1);
        transactions.add(pay2);
        transactions.add(pay3);
        transactions.add(pay1);
        transactions.add(pay2);
        transactions.add(pay3);


        return transactions;
    }

    public void  SkipAction(View v){

        System.out.println("SKIP CLICKED");


    }



}