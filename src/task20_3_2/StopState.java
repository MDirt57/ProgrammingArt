package task20_3_2;

public class StopState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Playing music from 00:00");
        player.setState(new PlayState());
    }

    @Override
    public void pause(MediaPlayer player) {
        return;
    }

    @Override
    public void stop(MediaPlayer player) {
        return;
    }
}
