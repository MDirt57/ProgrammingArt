package task15_3_2.commands.document;

import task15_3_2.Document;
import task15_3_2.commands.interfaces.Command;

public class PrintInfoCommand implements Command {

    @Override
    public void execute(Document document) {
        document.showInfo();
    }
}
