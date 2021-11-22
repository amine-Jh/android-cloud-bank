package com.example.cloudbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cloudbank.helper.LoadResource;
import com.example.cloudbank.model.Transaction;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Bundle extras=getIntent().getExtras();
        String title= new String(extras.getString("title"));
        String cost= new String(extras.getString("price"));
        String date= new String(extras.getString("date"));
        String image= new String(extras.getString("image"));
        System.out.println(title+"   "+cost+"  "+date);

        TextView titleView=(TextView) findViewById(R.id.titleDetails);
        TextView costView=(TextView) findViewById(R.id.priceDetaills);
        TextView dateView=(TextView) findViewById(R.id.dateDetails);
        ImageView imageView=(ImageView)findViewById(R.id.imageDetail);

        int id=LoadResource.getMipmapResIdByName(image);
        Log.e("IMAGE id",image);
       // imageView.setImageResource(LoadResource.getMipmapResIdByName(image));

        titleView.setText(title);
        costView.setText(cost);
        dateView.setText(date);


    }
}