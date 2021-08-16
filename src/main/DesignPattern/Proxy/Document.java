package Proxy;

public class Document implements IDocument{

    private String name;
    private String owner;
    private String content;



    public Document (String name, String owner, String content) {
        this.name = name;
        this.owner = owner;
        this.content = content;
    }

    public Document (String name) {
        this.name = name;
        Document document = SSD.getDocument(name);
        this.owner = document.owner;
        this.content = document.content;
    }

    public String getName () {
        return name;
    }

    @Override
    public String getOwner () {
        return owner;
    }

    @Override
    public String readDocument (String name) {
        return content;
    }
}
