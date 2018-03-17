package com.dpi300.aswinnagarajan.kuruksastra2k18.FlipPager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Aswin Nagarajan on 08-03-2018.
 */

public class HomeEvent {
    private int avatar;
    private String nickname;
    private int background;
    private List<String> interests = new ArrayList<>();


    public HomeEvent(int avatar, String nickname, int background, String... interest) {
        this.avatar = avatar;
        this.nickname = nickname;
        this.background = background;
        interests.addAll(Arrays.asList(interest));
    }

    public HomeEvent() {
    }

    public int getAvatar() {
        return avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public int getBackground() {
        return background;
    }

    public List<String> getInterests() {
        return interests;
    }
}


