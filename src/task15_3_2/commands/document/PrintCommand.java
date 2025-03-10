package task15_3_2.commands.document;

import task15_3_2.Document;

public class PrintCommand extends DocumentCommand{
    public PrintCommand(Document doc) {
        super(doc);
    }

    @Override
    public void execute() {
        document.print();
    }
}
