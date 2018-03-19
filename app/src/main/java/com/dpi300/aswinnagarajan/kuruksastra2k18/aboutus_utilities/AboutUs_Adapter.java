package com.dpi300.aswinnagarajan.kuruksastra2k18.aboutus_utilities;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.dpi300.aswinnagarajan.kuruksastra2k18.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by KavinRaju on 2018-03-16.
 */

public class AboutUs_Adapter extends RecyclerView.Adapter<AboutUs_Adapter.AboutUs_ViewHolder> {

    private static final String TAG = AboutUs_Adapter.class.getSimpleName();

    final private ListItemClickListener mOnClickListener;

    private int mNumberItems;
    List<AboutUs> mAboutUsList = new ArrayList<>();




    public interface ListItemClickListener {
        void onListItemClick(int clickedItemIndex, int clickedCard);
    }

    public AboutUs_Adapter(int numberOfItems, List<AboutUs> aboutUsList, ListItemClickListener listener) {
        mNumberItems = numberOfItems;
        mOnClickListener = listener;
        mAboutUsList = aboutUsList;


    }



    @Override
    public AboutUs_ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        int layout = R.layout.aboutus_recyl;
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(layout , parent , false);


        return new AboutUs_ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AboutUs_ViewHolder holder, int position) {

                AboutUs aboutUs = mAboutUsList.get(position);

               /* Picasso.with(holder.itemView.getContext()).load(aboutUs.getCover_url())
                        .into( holder.imageView_cover);*/

                Picasso.with(holder.itemView.getContext()).load(aboutUs.getDp_url())
                        .into( holder.circleImageView_DP);

                holder.textView_name.setText(aboutUs.getName());
                holder.textView_desig.setText(aboutUs.getTitle());


    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    public class AboutUs_ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView_cover;
        CircleImageView circleImageView_DP;
        TextView textView_name, textView_desig;

        public AboutUs_ViewHolder(View itemView) {
            super(itemView);

            //imageView_cover = itemView.findViewById(R.id.imageView_cover);
            circleImageView_DP = itemView.findViewById(R.id.imageView_profilePic_recyl);
            textView_name = itemView.findViewById(R.id.textView_name_recyl);
            textView_desig = itemView.findViewById(R.id.textView_posi_recyl);


            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

            Animation animation_zoom_in  = AnimationUtils.loadAnimation(v.getContext(),R.anim.zoom_in);
            circleImageView_DP.startAnimation(animation_zoom_in);
        }
    }
}
