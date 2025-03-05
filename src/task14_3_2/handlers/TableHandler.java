package task14_3_2.handlers;

import java.util.Arrays;
import java.util.List;

public class TableHandler extends BaseHandler {

    final private List<String> formats = Arrays.asList("xls", "xlsx");

    @Override
    public void handle(String filePath) {
        if (formats.contains(filePath.substring(filePath.lastIndexOf(".")+1))) {
            System.out.println("Table file successfully processed!");
        } else {
            super.handle(filePath);
        }
    }


}