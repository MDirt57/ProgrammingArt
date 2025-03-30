package task20_3_2;

public class PauseState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Playing music from current position");
        player.setState(new PlayState());
    }

    @Override
    public void pause(MediaPlayer player) {
        return;
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Set current position on 00:00");
        player.setState(new StopState());
    }
}
