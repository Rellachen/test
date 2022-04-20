package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.LinkedList;
import java.util.List;

import adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {

    //    private List<Animal> mData = null;
    private List<Data> mData = null;
    private Context mContext;
    //    private AnimalAdapter animalAdapter = null;
    private MyAdapter mAdapter = null;
    //    private ListView list_animal;
    private ListView list_one;
    int flag = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);
        mContext = MainActivity.this;
        bindViews();
        mData = new LinkedList<Data>();
        mAdapter = new MyAdapter(mContext, (LinkedList<Data>) mData);
        list_one.setAdapter(mAdapter);

        findViewById(R.id.add_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.add_button:
                        mAdapter.add(new Data(R.mipmap.guile, "太笨啦QAQ～～～ X " + flag));
                        flag++;
                        break;
                }
            }
        });
        findViewById(R.id.add_button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.add_button1:
                        mAdapter.add(5, new Data(R.mipmap.guile, "太笨啦QAQ～～～ X " + flag));
                        flag++;
                        break;
                }
            }
        });

        findViewById(R.id.remove_button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.remove_button1:
                        mAdapter.remove(2);
                        if (flag > 3) {
                            flag--;
                        }
                        break;
                }
            }
        });


//        list_animal = (ListView) findViewById(R.id.listView);
//
//        final LayoutInflater inflater = LayoutInflater.from(this);
//
//        mData = new LinkedList<Animal>();
//        mData.add(new Animal("小狗说","汪汪汪!",R.mipmap.xiaogou));
//        mData.add(new Animal("牛说","哞哞哞!",R.mipmap.moumou));
//        mData.add(new Animal("鸭子说","嘎嘎嘎!",R.mipmap.yazi));
//        animalAdapter = new AnimalAdapter((LinkedList<Animal>) mData, mContext);
//        list_animal.setAdapter(animalAdapter);

    }

    private void bindViews() {
        list_one = (ListView) findViewById(R.id.listView);
    }
    

}