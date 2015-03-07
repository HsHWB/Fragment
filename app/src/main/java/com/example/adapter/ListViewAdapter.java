package com.example.adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.R;

/**
 * Created by Administrator on 2015/3/6.
 */
public class ListViewAdapter extends BaseAdapter {

    private int count = 0;
    private Context context;

    public ListViewAdapter(Context context, int count){
        super();
        this.context = context;
        this.count = count;
    }

    public void setCount(int count){
        this.count = count;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout ll = new LinearLayout(context);
        ll.setOrientation(LinearLayout.HORIZONTAL);//设置线性布局的朝向，可取horizontal和vertical两种排列方式
        TextView tx = new TextView(context);
        String itemPosition = context.getResources().getString(R.string.list_item_position);
        tx.setText(String.format(itemPosition, position));
        ll.addView(tx);
        return ll;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
