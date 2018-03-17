package com.example.aswinnagarajan.kuruksastra2k18.aboutus_utilities;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.aswinnagarajan.kuruksastra2k18.proshow_utilities.Show;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by KavinRaju on 2018-03-16.
 */

public class AboutUs implements Parcelable {

    @SerializedName("cover_url")
    @Expose
    private String cover_url;

    @SerializedName("dp_url")
    @Expose
    private String dp_url;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("title")
    @Expose
    private String title;

    private AboutUs(Parcel parcel){
        cover_url = parcel.readString();
        dp_url = parcel.readString();
        name = parcel.readString();
        title = parcel.readString();
    }

    public static final Creator<AboutUs> CREATOR = new Creator<AboutUs>() {
        @Override
        public AboutUs createFromParcel(Parcel in) {
            return new AboutUs(in);
        }

        @Override
        public AboutUs[] newArray(int size) {
            return new AboutUs[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(cover_url);
        dest.writeString(dp_url);
        dest.writeString(name);
        dest.writeString(title);
    }

    public static final Creator<AboutUs> aboutUs = new Creator<AboutUs>() {

        @Override
        public AboutUs createFromParcel(Parcel source) {
            return new AboutUs(source);
        }

        @Override
        public AboutUs[] newArray(int size) {
            return new AboutUs[size];
        }
    };

    public String getCover_url() {
        return cover_url;
    }

    public void setCover_url(String cover_url) {
        this.cover_url = cover_url;
    }

    public String getDp_url() {
        return dp_url;
    }

    public void setDp_url(String dp_url) {
        this.dp_url = dp_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
