package com.zhengsonglan.tvanimation;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView iv_tv= (ImageView) findViewById(R.id.imageView);
        Button bt_start= (Button) findViewById(R.id.button);
        bt_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_tv.startAnimation(new TVOffAnimation());
            }
        });
    }

}
