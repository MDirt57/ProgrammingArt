package task15_3_2;

import task15_3_2.commands.interfaces.Command;

public class Button extends Clickable {

    public Button(Command command) {
        super(command);
    }

    public void click(Document document){
        command.execute(document);
    }
}
