package Proxy;

import java.util.HashMap;
import java.util.Map;

public class SSD {

    private static final Map<String, Document> documents = new HashMap<>();

    public static Document getDocument(String name){
        return documents.get(name);
    }

    public static void saveDocument(Document document){
        documents.put(document.getName(), document);
    }

}
