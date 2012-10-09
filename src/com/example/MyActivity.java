package com.example;

import android.os.Bundle;
import com.actionbarsherlock.app.SherlockActivity;

public class MyActivity extends SherlockActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
