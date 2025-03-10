package task15_3_2.commands.interfaces;

import task15_3_2.Document;

public interface Command {
    void execute(Document document);
}
