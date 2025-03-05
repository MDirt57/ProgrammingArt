package task14_3_2.handlers;

import java.util.Arrays;
import java.util.List;

public class DocumentHandler extends BaseHandler {

    final private List<String> formats = Arrays.asList("doc", "docx", "pdf");

    @Override
    public void handle(String filePath) {
        if (formats.contains(filePath.substring(filePath.lastIndexOf(".")+1))) {
            System.out.println("Document file successfully processed!");
        } else {
            super.handle(filePath);
        }
    }


}
