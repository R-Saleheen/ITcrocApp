package com.itcroc.itcroc;

/**
 * Created by R_Saleheen on 1/4/2016.
 */
import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TeamAdapter extends ArrayAdapter<TeamModel> {

    private final Context context;
    private final ArrayList<TeamModel> modelsArrayList;

    public TeamAdapter(Context context, ArrayList<TeamModel> modelsArrayList) {

        super(context, R.layout.list_item_team, modelsArrayList);

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
            rowView = inflater.inflate(R.layout.list_item_team, parent, false);

            // 3. Get icon,title & counter views from the rowView
            ImageView imgView = (ImageView) rowView.findViewById(R.id.item_image);
            TextView nameView = (TextView) rowView.findViewById(R.id.item_name);
            TextView desView = (TextView) rowView.findViewById(R.id.item_des);


            // 4. Set the text for textView
            imgView.setImageResource(modelsArrayList.get(position).getIcon());
            nameView.setText(modelsArrayList.get(position).getname());
            desView.setText(modelsArrayList.get(position).getdes());
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