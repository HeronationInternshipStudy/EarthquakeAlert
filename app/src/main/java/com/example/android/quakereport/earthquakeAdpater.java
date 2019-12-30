package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.sql.Date;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class earthquakeAdpater extends ArrayAdapter<earthquake> {
    public earthquakeAdpater(Activity context, ArrayList<earthquake> earthquakes){
        super(context,0,earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        earthquake currentEarthquake=getItem(position);

        TextView magnitudeView=(TextView)listItemView.findViewById(R.id.tv_intensity);
        magnitudeView.setText(currentEarthquake.getIntensity());

        TextView locationView=(TextView)listItemView.findViewById(R.id.tv_location);
        locationView.setText(currentEarthquake.getLocation());

        Date dateObject=new Date(currentEarthquake.getDate());
        TextView dateView=(TextView)listItemView.findViewById(R.id.tv_date);
        String formattedDate=formatDate(dateObject);
        dateView.setText(formattedDate);

        TextView timeView=(TextView)listItemView.findViewById(R.id.tv_time);
        String formattedTime=formatTime(dateObject);
        timeView.setText(formattedTime);

        return listItemView;
    }

    private String formatDate(Date dateObject){
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    private String formatTime(Date dateObject){
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}
