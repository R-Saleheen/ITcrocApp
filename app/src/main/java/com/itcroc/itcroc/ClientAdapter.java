package com.itcroc.itcroc;

/**
 * Created by R_Saleheen on 1/4/2016.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ClientAdapter extends ArrayAdapter<ClientModel> {

    private final Context context;
    private final ArrayList<ClientModel> modelsArrayList;

    public ClientAdapter(Context context, ArrayList<ClientModel> modelsArrayList) {

        super(context, R.layout.list_item_client, modelsArrayList);

        this.context = context;
        this.modelsArrayList = modelsArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // 1. Create inflater
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. Get rowView from inflater

        View rowView = null;
        if (!modelsArrayList.get(position).isGroupHeader()) {
            rowView = inflater.inflate(R.layout.list_item_client, parent, false);

            // 3. Get icon,title & counter views from the rowView
            ImageView imgView = (ImageView) rowView.findViewById(R.id.item_img);
            TextView reviewView = (TextView) rowView.findViewById(R.id.item_review);
            TextView nameView = (TextView) rowView.findViewById(R.id.item_c_name);
            TextView desView = (TextView) rowView.findViewById(R.id.item_desing);
            TextView companyView = (TextView) rowView.findViewById(R.id.item_company);


            // 4. Set the text for textView
            imgView.setImageResource(modelsArrayList.get(position).getIcon());
            reviewView.setText(modelsArrayList.get(position).getreview());
            nameView.setText(modelsArrayList.get(position).getname());
            desView.setText(modelsArrayList.get(position).getdes());
            companyView.setText(modelsArrayList.get(position).getcompany());

        }

            else{
                rowView = inflater.inflate(R.layout.group_header_item, parent, false);
                TextView titleView = (TextView) rowView.findViewById(R.id.header);
                titleView.setText(modelsArrayList.get(position).getname());

            }


            // 5. retrn rowView
            return rowView;
        }

}