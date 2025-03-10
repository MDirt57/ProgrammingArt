package task15_3_2.commands.document;

import task15_3_2.Document;

import javax.print.Doc;

public class SaveCommand extends DocumentCommand {
    public SaveCommand(Document doc) {
        super(doc);
    }

    @Override
    public void execute() {
        document.save();
    }
}
