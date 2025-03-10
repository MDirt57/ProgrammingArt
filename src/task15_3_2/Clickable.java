package task15_3_2;

import task15_3_2.commands.interfaces.Command;

abstract class Clickable {

    protected Command command;

    public Clickable(Command command){
        this.command = command;
    }

}
