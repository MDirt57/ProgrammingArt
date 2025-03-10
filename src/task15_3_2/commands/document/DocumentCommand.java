package task15_3_2.commands.document;

import task15_3_2.Document;
import task15_3_2.commands.interfaces.Command;

public abstract class DocumentCommand implements Command {

    protected Document document;

    public DocumentCommand(Document doc){
        document = doc;
    }

    @Override
    abstract public void execute();
}
