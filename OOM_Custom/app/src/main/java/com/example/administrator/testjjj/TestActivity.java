package com.example.administrator.testjjj;

import android.content.Intent;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.squareup.leakcanary.RefWatcher;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitytest);

        RefWatcher refWatcher = App.getRefWatcher(this);
        refWatcher.watch(this);

        MyUtils.mView =  findViewById(R.id.haha);

    }

}
