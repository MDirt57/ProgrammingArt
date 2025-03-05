package task14_3_2;

import task14_3_2.handlers.*;

public class Client {
    public static void main(String[] args) {

        String[] files = {
                "image.jpg",
                "image.png",
                "document.docx",
                "document.doc",
                "table.xls",
                "dataset.csv",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf",
        };

        Handler imageHandler = new ImageHandler();
        Handler documentHandler = new DocumentHandler();
        Handler presentationHandler = new PresentationHandler();
        Handler tableHandler = new TableHandler();

        imageHandler.setNext(documentHandler);
        documentHandler.setNext(presentationHandler);
        presentationHandler.setNext(tableHandler);

        // Create Chain of responsibility to open file by correct program according to the extension.
        for (String file : files) {
            imageHandler.handle(file);
        }


    }
}
