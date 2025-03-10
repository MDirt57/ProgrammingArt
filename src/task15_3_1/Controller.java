package task15_3_1;

public class Controller {

    final private Command on;
    final private Command off;

    public Controller(Command on, Command off){
        this.on = on;
        this.off = off;
    }

    public void on() {
        on.execute();
    }

    public void off() {
        off.execute();
    }
}
