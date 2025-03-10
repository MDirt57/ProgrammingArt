package task15_3_2;

import task15_3_2.commands.interfaces.Command;
import task15_3_2.commands.document.PrintCommand;
import task15_3_2.commands.document.PrintInfoCommand;
import task15_3_2.commands.document.SaveCommand;

public class TextEditor {

    private Document document;

    final private Button saveButton;
    final private Button printButton;

    final private MenuItem saveMenuItem;
    final private MenuItem printMenuItem;
    final private MenuItem showInfoMenuItem;

    final private Shortcut saveShortcut;
    final private Shortcut printShortcut;

    public TextEditor() {
        saveButton = new Button(new SaveCommand(document));
        printButton = new Button(new PrintCommand(document));

        saveMenuItem = new MenuItem(new SaveCommand(document));
        printMenuItem = new MenuItem(new PrintCommand(document));
        showInfoMenuItem = new MenuItem(new PrintInfoCommand(document));

        saveShortcut = new Shortcut((Command) new SaveCommand(document));
        printShortcut = new Shortcut((Command) new PrintCommand(document));
    }

    public void newDocument(String name) {
        document = new Document(name);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickPrintButton() {
        printButton.click();
    }

    public void selectSaveMenuItem() {
        saveMenuItem.select();
    }

    public void selectPrintMenuItem() {
        printMenuItem.select();
    }

    public void selectShowInfoMenuItem() {
        showInfoMenuItem.select();
    }

    public void pressSaveShortcut() {
        saveShortcut.press();
    }

    public void pressPrintShortcut() {
        printShortcut.press();
    }
}
