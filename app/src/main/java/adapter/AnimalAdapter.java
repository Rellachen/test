package adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import androidx.appcompat.widget.ActivityChooserView;

import com.example.myapplication.Animal;
import com.example.myapplication.R;

import java.util.LinkedList;

public class AnimalAdapter extends BaseAdapter {

    private LinkedList<Animal> mData;
    private Context context;

    public AnimalAdapter(LinkedList<Animal> mData, Context context) {
        this.mData = mData;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item_list_animal, parent, false);
        ImageView img_icon = (ImageView) convertView.findViewById(R.id.image);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView speak = (TextView) convertView.findViewById(R.id.speak);
        img_icon.setBackgroundResource(mData.get(position).getaIcon());
        name.setText(mData.get(position).getaName());
        speak.setText(mData.get(position).getaSpeak());
        return convertView;
    }
}
