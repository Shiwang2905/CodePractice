package main.java.Collections;

public class Songs {

    private String songName;
    private double duration;

    public Songs(String songName, double duration) {
        this.songName = songName;
        this.duration = duration;
    }

    public String getSongName() {
        return songName;
    }

    public double getDuration() {
        return duration;
    }
}
