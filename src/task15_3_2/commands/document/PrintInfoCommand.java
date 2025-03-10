package task15_3_2.commands.document;

import task15_3_2.Document;

public class PrintInfoCommand extends DocumentCommand{
    public PrintInfoCommand(Document doc) {
        super(doc);
    }

    @Override
    public void execute() {
        document.showInfo();
    }
}
