package task15_3_2.commands.document;

import task15_3_2.Document;
import task15_3_2.commands.interfaces.Command;

import javax.print.Doc;

public class SaveCommand implements Command {

    @Override
    public void execute(Document document) {
        document.save();
    }
}
