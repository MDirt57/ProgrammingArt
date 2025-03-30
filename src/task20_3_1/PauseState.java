package task20_3_1;

public class PauseState implements State{

    @Override
    public void play(MediaPlayer player) {
        player.setState(new PlayState());
        player.setIcon("pause button");
        System.out.println("Video playing, icon set to " + player.getIcon());
    }

    @Override
    public void pause(MediaPlayer player){
        return;
    }
}
