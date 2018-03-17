package com.example.aswinnagarajan.kuruksastra2k18.classes;

/**
 * Created by Aswin Nagarajan on 16-03-2018.
 */

public class Event {
    public String name;
    public int participants;

    public Event(String name, int participants) {
        this.name = name;
        this.participants = participants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }
}
