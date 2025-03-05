package task14_3_2.handlers;

import java.util.Arrays;
import java.util.List;

public class PresentationHandler extends BaseHandler {

    final private List<String> formats = Arrays.asList("pptx");

    @Override
    public void handle(String filePath) {
        if (formats.contains(filePath.substring(filePath.lastIndexOf(".")+1))) {
            System.out.println("Presentation file successfully processed!");
        } else {
            super.handle(filePath);
        }
    }


}
