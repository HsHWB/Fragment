package com.example.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.example.R;
import com.example.adapter.ListViewAdapter;


import java.util.List;


/**
 * Created by Administrator on 2015/3/6.
 */
public class fragment extends Fragment {

    private int screenWidth = 0;
    private int screenHeight = 0;
    private Context context;
    private Context myContext;
    private ListView listView;
    private ListViewAdapter adapter;
//    private BaseAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity().getApplicationContext();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_listview, container, false);
        listView = (ListView)view.findViewById(R.id.fragment_listview);

        /**
         * 为了解决第一次进入Fragment的时候listview显示数据，第二次不显示的数据的问题
         * 不显示的问题大概有这么几种：1、没有适配adapter 2、adapter里面没有数据
         * 3、也是最容易忽视的问题，前后两次进入的时候adapter对象没有发生变化，但是ListView对象发生变化了，
         * 也就是说不是之前那个已经适配过数据的ListView了，但是这个时候你判断你的 adapter 不等于null，直接notify了，
         * 但是这时候其实listView对象是一个新的对象，并没有设置适配器adapter
         */
        if(adapter == null) {
            adapter = new ListViewAdapter(this.context, 10);
        }

        listView.setAdapter(adapter);
//        TextView tx = (TextView)view.findViewById(R.id.fragment_listview);
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }
}
