package task15_3_2;

import task15_3_2.commands.interfaces.Command;

public class MenuItem extends Clickable{
    public MenuItem(Command command) {
        super(command);
    }

    public void select() {
        command.execute();
    }
}
