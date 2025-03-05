package task14_3_1.handlers;

import java.util.Map;

public class BaseHandlerWithStorage extends BaseHandler{

    final protected Map<String, String> storage;

    public BaseHandlerWithStorage(Map<String, String> storage){
        this.storage = storage;
    }

}
