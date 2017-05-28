package com.example.android.androidtourguide;

/**
 * Created by Nicholas Krause on 5/7/2017.
 */
import java.util.ArrayList;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ArrayAdapter;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.app.Activity;

public class LocationAdapter extends ArrayAdapter<Location>
{
    public LocationAdapter(Activity aContext, ArrayList<Location> aLocationList)
    {
        super(aContext, 0, aLocationList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        // Check if the existing view is being reused, otherwise inflate the view
        View locationView = convertView;

        if(locationView == null)
        {
            locationView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_list_item, parent, false);
        }
        Location currentLocation = getItem(position);
        //
        ImageView imageView = (ImageView) locationView.findViewById(R.id.image_view);
        imageView.setImageResource(currentLocation.getImage());
        //
        TextView nameView = (TextView) locationView.findViewById(R.id.name_field);
        nameView.setText(getContext().getString(currentLocation.getName()));
        //
        TextView descriptionView = (TextView) locationView.findViewById(R.id.desc_field);
        descriptionView.setText(getContext().getString(currentLocation.getDesc()));



        return locationView;
    }
}
