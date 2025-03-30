package task20_3_2;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

    final private List<String> tracks = new ArrayList<>();
    private State state = new StopState();
    private int currentTrackNum = 0;


    public String getCurrentTrack() {
        return tracks.get(currentTrackNum);
    }

    public void setTrackNum(int trackNum) {
        if (trackNum < 0 || trackNum >= tracks.size()) {
            return;
        }

        this.currentTrackNum = trackNum;
    }

    public int getCurrentTrackNum() {
        return currentTrackNum;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void addTrack(String track) {
        tracks.add(track);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void next() {
        setTrackNum(getCurrentTrackNum() + 1);
        System.out.println("Now playing track #"+getCurrentTrack());
        reset();
    }

    public void prev() {
        setTrackNum(getCurrentTrackNum() - 1);
        System.out.println("Now playing track #"+getCurrentTrack());
        reset();
    }

    public void reset(){
        state.stop(this);
        state.play(this);
    }

    public void stop() {
        state.stop(this);
    }

}
