package com.dpi300.aswinnagarajan.kuruksastra2k18.proshow_utilities;

import android.content.Context;
import android.graphics.Point;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.dpi300.aswinnagarajan.kuruksastra2k18.R;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.annotations.Click;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.swipe.SwipeCancelState;
import com.mindorks.placeholderview.annotations.swipe.SwipeIn;
import com.mindorks.placeholderview.annotations.swipe.SwipeInDirectional;
import com.mindorks.placeholderview.annotations.swipe.SwipeOut;
import com.mindorks.placeholderview.annotations.swipe.SwipeOutDirectional;
import com.mindorks.placeholderview.annotations.swipe.SwipeTouch;
import com.mindorks.placeholderview.annotations.swipe.SwipeView;
import com.mindorks.placeholderview.annotations.swipe.SwipingDirection;

import jp.wasabeef.glide.transformations.RoundedCornersTransformation;


/**
 * Created by KavinRaju on 2018-03-13.
 */
@Layout(R.layout.pro_show_cardview)
public class StackedCardView {

    @View(R.id.imageView_proshow)
    private ImageView imageView;



    @SwipeView
    private FrameLayout mSwipeView;

    private Show mShow;
    private Context mContext;
    private Callback mCallback;
    private Point mCardViewHolderSize;
    private SwipeDirectionalView mSwipeDirectionalView;

    public StackedCardView(Context context , Show show , Point cardViewHolderSize, SwipeDirectionalView swipeDirectionalView , Callback callback)
    {
        mContext = context;
        mShow = show;
        mCardViewHolderSize = cardViewHolderSize;
        mCallback =callback;
        mSwipeDirectionalView = swipeDirectionalView;

    }

    @Resolve
    private void onResolved(){


        /*Glide.with(mContext).load(mShow.getUrl())
                .bitmapTransform(new RoundedCornersTransformation(mContext, Utils_ProShow.dpTopx(7),0,
                        RoundedCornersTransformation.CornerType.ALL))
                .into(imageView);*/

        //Toast.makeText(mContext, mShow.getUrl(), Toast.LENGTH_SHORT).show();
        //imageView.setBackgroundResource(R.drawable.ic_launcher_background);
        //write code to set title

        setmSwipeDirectionalViewBackground();


        mSwipeView.setAlpha(1);
    }

    @Click(R.id.imageView_proshow)
    private void onClick(){
/*
        ConstraintSet constraintSet_1 = new ConstraintSet();
        ConstraintSet constraintSet_2 = new ConstraintSet();

        constraintSet_2.clone(mContext, R.layout.pro_show_cardview_1);
        constraintSet_1.clone(mConstraintLayout);

        TransitionManager.beginDelayedTransition(mConstraintLayout);
        constraintSet_2.applyTo(mConstraintLayout);*/

        Animation animation_zoom_in  = AnimationUtils.loadAnimation(mContext,R.anim.zoom_in);
        imageView.startAnimation(animation_zoom_in);
    }


    @SwipeIn
    private void onSwipeIn(){

        mCallback.onSwipeUp();
    }

    @SwipeOut
    private void onSwipedOut(){
        Log.d("EVENT", "onSwipedOut");
//        mSwipeView.addView(this);
        mCallback.onSwipeUp();


    }


    @SwipeOutDirectional
    private void onSwipeOutDirectional(SwipeDirection direction) {
        Log.d("DEBUG", "SwipeOutDirectional " + direction.name());
       /* if (direction.getDirection() == SwipeDirection.TOP.getDirection()) {
            mCallback.onSwipeUp();
        }*/

        mCallback.onSwipeUp();

        setmSwipeDirectionalViewBackground();

    }

    @SwipeCancelState
    private void onSwipeCancelState() {
        Log.d("DEBUG", "onSwipeCancelState");
        mSwipeView.setAlpha(1);

    }

    @SwipeInDirectional
    private void onSwipeInDirectional(SwipeDirection direction) {
        Log.d("DEBUG", "SwipeInDirectional " + direction.name());
            mCallback.onSwipeUp();
            setmSwipeDirectionalViewBackground();
    }

    @SwipingDirection
    private void onSwipingDirection(SwipeDirection direction) {
        Log.d("DEBUG", "SwipingDirection " + direction.name());

    }

    @SwipeTouch
    private void onSwipeTouch(float xStart, float yStart, float xCurrent, float yCurrent) {

        float cardHolderDiagonalLength =
                (float) Math.sqrt(Math.pow(mCardViewHolderSize.x, 2) + (Math.pow(mCardViewHolderSize.y, 2)));
        float distance = (float) Math.sqrt(Math.pow(xCurrent - xStart, 2) + (Math.pow(yCurrent - yStart, 2)));

        float alpha = 1 - distance / cardHolderDiagonalLength;

        Log.d("DEBUG", "onSwipeTouch "
                + " xStart : " + xStart
                + " yStart : " + yStart
                + " xCurrent : " + xCurrent
                + " yCurrent : " + yCurrent
                + " distance : " + distance
                + " TotalLength : " + cardHolderDiagonalLength
                + " alpha : " + alpha
        );

        mSwipeView.setAlpha(alpha);
    }


    private void setmSwipeDirectionalViewBackground(){

        if(mShow.getTitle().equalsIgnoreCase("Shravan Sridhar")){

            //mSwipeDirectionalView.setBackgroundResource(R.drawable.shravan_sridhar);
            imageView.setBackgroundResource(R.drawable.shravan_sridhar);
            /*Glide.with(mContext).load(mShow.getUrl())
                    .bitmapTransform(new RoundedCornersTransformation(mContext, Utils_ProShow.dpTopx(7),0,
                            RoundedCornersTransformation.CornerType.ALL))
                    .error(R.drawable.shravan_sridhar)
                    .into(imageView);*/
        }
        else if(mShow.getTitle().equalsIgnoreCase("Karthik")){
                //mSwipeDirectionalView.setBackgroundResource(R.drawable.karthik);
                imageView.setBackgroundResource(R.drawable.karthik);
            /*Glide.with(mContext).load(mShow.getUrl())
                    .bitmapTransform(new RoundedCornersTransformation(mContext, Utils_ProShow.dpTopx(7),0,
                            RoundedCornersTransformation.CornerType.ALL))
                    .error(R.drawable.karthik)
                    .into(imageView);*/
        }
        else if(mShow.getTitle().equalsIgnoreCase("Aalap Raju")){
//            mSwipeDirectionalView.setBackgroundResource(R.drawable.aalap_raju);
            imageView.setBackgroundResource(R.drawable.aalap_raju);
           /* Glide.with(mContext).load(mShow.getUrl())
                    .bitmapTransform(new RoundedCornersTransformation(mContext, Utils_ProShow.dpTopx(7),0,
                            RoundedCornersTransformation.CornerType.ALL))
                    .error(R.drawable.aalap_raju)
                    .into(imageView);*/
        } else if(mShow.getTitle().equalsIgnoreCase("Vijayagopal")){

//            mSwipeDirectionalView.setBackgroundResource(R.drawable.vijay);
                imageView.setBackgroundResource(R.drawable.vijay);
           /* Glide.with(mContext).load(mShow.getUrl())
                    .bitmapTransform(new RoundedCornersTransformation(mContext, Utils_ProShow.dpTopx(7),0,
                            RoundedCornersTransformation.CornerType.ALL))
                    .error(R.drawable.vijay)
                    .into(imageView);*/
        } else if(mShow.getTitle().equalsIgnoreCase("Crea Shakthi")){

            //mSwipeDirectionalView.setBackgroundResource(R.drawable.crea_shakthi);
            imageView.setBackgroundResource(R.drawable.crea_shakthi);
            /*Glide.with(mContext).load(mShow.getUrl())
                    .bitmapTransform(new RoundedCornersTransformation(mContext, Utils_ProShow.dpTopx(7),0,
                            RoundedCornersTransformation.CornerType.ALL))
                    .error(R.drawable.crea_shakthi)
                    .into(imageView);*/
        }
        else if(mShow.getTitle().equalsIgnoreCase("Sid Sriram")){

            //mSwipeDirectionalView.setBackgroundResource(R.drawable.sidsriram);
            imageView.setBackgroundResource(R.drawable.sidsriram);
            /*Glide.with(mContext).load(mShow.getUrl())
                    .bitmapTransform(new RoundedCornersTransformation(mContext, Utils_ProShow.dpTopx(7),0,
                            RoundedCornersTransformation.CornerType.ALL))
                    .error(R.drawable.sidsriram)
                    .into(imageView);*/
        }

    }




    public interface Callback {
        void onSwipeUp();
    }
}
