package com.jirawat.traffice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nook on 22/10/2559.
 */
public class ShowDetailActivity extends AppCompatActivity {
    private TextView showTitleTextView, showDetailTextView;
    private ImageView showTrafficImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        bindWidget();

        showWidget();
    }

    private void bindWidget (){
        showTitleTextView = (TextView) findViewById(R.id.txtTiltleDetail);
        showDetailTextView = (TextView) findViewById(R.id.txtDetail);
        showTrafficImageView = (ImageView) findViewById(R.id.imvTrafflcDetail);
    }
    private void showWidget(){
        int intClick = getIntent().getIntExtra("Click",0);

        Mydata objMydata = new Mydata();
        String[] strTitle = objMydata.title();
        showTitleTextView.setText(strTitle[intClick]);


        int[] intDrawable = objMydata.icon();
        showTrafficImageView.setImageResource(intDrawable[intClick]);

        String[] strDetail = getResources().getStringArray(R.array.traffice_deetail);
        showDetailTextView.setText(strDetail[intClick]);
    }
}

