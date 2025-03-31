package task20_3_1;

public interface State {

    default void play(MediaPlayer player){}

    default void pause(MediaPlayer player){}

}
