package task15_3_2;

import task15_3_2.commands.interfaces.Command;

public class Shortcut extends Clickable{
    public Shortcut(Command command) {
        super(command);
    }

    public void press() {
        command.execute();
    }
}
