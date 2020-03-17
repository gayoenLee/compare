package com.example.comparelistviewrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class listtViewAdapter extends BaseAdapter {

    Context listContext = null;
    LayoutInflater layoutInflater = null;
    ArrayList<listviewData>listviewData;

    public listtViewAdapter(Context context, ArrayList<listviewData> data){
        listContext = context;
        listviewData = data;
        layoutInflater = LayoutInflater.from(listContext);
    }
    @Override
    public int getCount() {
        return listviewData.size();
    }
    @Override
    public listviewData getItem(int position) {
        return listviewData.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.activity_listview_layout, null);

        ImageView imageView = (ImageView)view.findViewById(R.id.poster);
        TextView movieName = (TextView)view.findViewById(R.id.movieName);
        TextView grade = (TextView)view.findViewById(R.id.grade);

        imageView.setImageResource(listviewData.get(position).getPoster());
        movieName.setText(listviewData.get(position).getMovieName());
        grade.setText(listviewData.get(position).getGrade());


        return view;
    }
}
