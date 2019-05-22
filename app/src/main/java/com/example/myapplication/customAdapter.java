package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customAdapter extends ArrayAdapter<String> {
    int [] images = {R.drawable.bds, R.drawable.ieee, R.drawable.igc, R.drawable.udc, R.drawable.plektra};
    public customAdapter(Context context, String[] societies) {
        super(context, R.layout.custom_row, societies);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater myInflater = LayoutInflater.from(getContext());
        View customView = myInflater.inflate(R.layout.custom_row, parent, false);

        TextView myText = customView.findViewById(R.id.row_textview);

        ImageView myImage= customView.findViewById(R.id.row_imageview);

        String singleSociety = getItem(position);
        myText.setText(singleSociety);
        myImage.setImageResource(images[position]);
        return customView;
    }
}
