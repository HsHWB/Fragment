package com.example.activity;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.R;
import com.example.fragment.fragment;

/**
 * Created by Administrator on 2015/3/6.
 */
public class MainAcitivity extends Activity{

    private Button button;
    private Fragment fragment;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)this.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new com.example.fragment.fragment();
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.framLayout, fragment);
                fragmentTransaction.commit();
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onResume(){
        super.onResume();
    }
}
