package com.example.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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
    private ListView listView;
    private ListViewAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity().getApplicationContext();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_listview, container, false);
        listView = (ListView)view.findViewById(R.id.fragment_listview);
        adapter = new ListViewAdapter(context, 10);
        listView.setAdapter(adapter);
        return view;
    }
}
