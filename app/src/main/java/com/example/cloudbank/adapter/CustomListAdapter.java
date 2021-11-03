package com.example.cloudbank.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cloudbank.R;
import com.example.cloudbank.model.Country;
import com.example.cloudbank.model.Transaction;

import java.util.List;

public class CustomListAdapter  extends BaseAdapter {

    private List<Country> listData;
    private List<Transaction> transactions;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomListAdapter(Context aContext,  List<Transaction> transactions) {
        this.context = aContext;
        this.transactions = transactions;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return transactions.size();
    }

    @Override
    public Object getItem(int position) {
        return transactions.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.iconView = (ImageView) convertView.findViewById(R.id.imageItem);
            holder.titleView = (TextView) convertView.findViewById(R.id.titleItem);
            holder.costView = (TextView) convertView.findViewById(R.id.costItem);
            holder.dateView=(TextView)convertView.findViewById(R.id.dateItem);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        Transaction transaction=this.transactions.get(position);
        holder.titleView.setText(transaction.getTitle());
        holder.dateView.setText(transaction.getDate());
        holder.costView.setText(transaction.getCost());



        int imageId = this.getMipmapResIdByName(transaction.getImageName());

        holder.iconView.setImageResource(imageId);

        return convertView;
    }

    // Find Image ID corresponding to the name of the image (in the directory mipmap).
    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.

        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        System.out.println(" this photo "+pkgName);
        Log.i("CustomListView", "Res Name  : "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    static class ViewHolder {
        ImageView iconView;
        TextView titleView;
        TextView costView;
        TextView dateView;
    }

}