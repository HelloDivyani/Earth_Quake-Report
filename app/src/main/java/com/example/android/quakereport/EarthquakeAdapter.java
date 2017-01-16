package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Divyani on 15-01-2017.
 */
public class EarthquakeAdapter extends ArrayAdapter<EarthQuake_Single> {
    // Custom Adapter class

    public EarthquakeAdapter(Context context, List<EarthQuake_Single> earthquakes) {
        // Default constructor calling parent class constructor

        super(context, 0, earthquakes);

    }
    // overide th getItem


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The adapter calls the getView method and checks whether the convertView is null or not
        // convertView is the old View to be recycled
        // On the first call to getView the convertView is always null.


        View listitemView = convertView;
        if(listitemView == null)
        {
            // create a new View
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout,parent,false);
        }

        EarthQuake_Single current = getItem(position);
        TextView magnitudeView =(TextView)listitemView.findViewById(R.id.mag);
        magnitudeView.setText(current.getMagnitude());
        TextView dataView =(TextView)listitemView.findViewById(R.id.date);
        dataView.setText(current.getDate());
        TextView locationView= (TextView)listitemView.findViewById(R.id.location);
        locationView.setText(current.getLocation());

        //return super.getView(position, convertView, parent);
        return listitemView;
    }

}
