package task20_3_2;

public class PlayState implements State {
    @Override
    public void play(MediaPlayer player) {
        return;
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Pause music at current position");
        player.setState(new PauseState());
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Set current position on 00:00 and pause");
        player.setState(new StopState());
    }
}
