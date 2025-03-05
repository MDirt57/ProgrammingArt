package task14_3_2.handlers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImageHandler extends BaseHandler {

    final private List<String> formats = Arrays.asList("jpg", "png", "webp");

    @Override
    public void handle(String filePath) {
        if (formats.contains(filePath.substring(filePath.lastIndexOf(".")+1))) {
            System.out.println("Image file successfully processed!");
        } else {
            super.handle(filePath);
        }
    }


}
