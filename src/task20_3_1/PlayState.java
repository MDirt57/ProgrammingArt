package task20_3_1;

public class PlayState implements State {

    @Override
    public void pause(MediaPlayer player) {
        player.setState(new PauseState());
        player.setIcon("play button");
        System.out.println("Video paused, icon set to " + player.getIcon());
    }
}
