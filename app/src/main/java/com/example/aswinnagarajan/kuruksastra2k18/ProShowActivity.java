package com.example.aswinnagarajan.kuruksastra2k18;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.example.aswinnagarajan.kuruksastra2k18.proshow_utilities.Show;
import com.example.aswinnagarajan.kuruksastra2k18.proshow_utilities.StackedCardView;
import com.example.aswinnagarajan.kuruksastra2k18.proshow_utilities.Utils_ProShow;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirectionalView;

public class ProShowActivity extends AppCompatActivity implements StackedCardView.Callback {


    Context mcontext;

    int count;
    private SwipeDirectionalView mSwipeDirectionalView;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_show);

        mcontext = getApplicationContext();
        mSwipeDirectionalView = findViewById(R.id.swipePlaceHolderView);
        constraintLayout = findViewById(R.id.constraintLayout_proShows);

        count = 0;
        createCardStack(mcontext);
    }

    void createCardStack(Context mcontext){


        int bottomMargin = Utils_ProShow.dpTopx(64);

        Point windowsSize = Utils_ProShow.getDisplaySize(getWindowManager());

        // All actions for swipe card are set here
        mSwipeDirectionalView.getBuilder()
                .setDisplayViewCount(6)
                .setIsUndoEnabled(true)
                .setHeightSwipeDistFactor(10)
                .setWidthSwipeDistFactor(5)
                .setSwipeDecor(new SwipeDecor()
                        .setViewWidth(windowsSize.x)
                        .setViewHeight(windowsSize.y - bottomMargin)
                        .setViewGravity(Gravity.CENTER)
                        .setPaddingTop(20)
                        .isAnimateScale(true)
                        .setSwipeAnimFactor(1)
                        .setRelativeScale(0.01f));
        //.setSwipeInMsgLayoutId(R.layout.swipe_right_view)
        //.setSwipeOutMsgLayoutId(R.layout.swipe_left_view));

        Point cardViewHolderSize = new Point(windowsSize.x, windowsSize.y - bottomMargin);

        for (Show show: Utils_ProShow.loadShows(this.getApplicationContext() )){

            // Views are being added here on the card view
            mSwipeDirectionalView.addView(new StackedCardView(mcontext , show, cardViewHolderSize , mSwipeDirectionalView,  this));
            count++;
        }

    }

    @Override
    public void onSwipeUp() {

        count--;
        if (count == 1 ) {
            createCardStack(mcontext);
        }
    }
}