package Proxy;

public class DocumentProxy implements IDocument{

    private Document document;

    private String name;

    public DocumentProxy (String name) {
        this.name = name;
    }

    @Override
    public String getOwner () {
        if(this.document == null){
            this.document = new Document(this.name);
        }
        return this.document.getOwner();
    }

    @Override
    public String readDocument (String name) {
        if(this.document == null){
            this.document = new Document(this.name);
        }
        if(!this.document.getOwner().equals(name)){
            throw new IllegalArgumentException("Invalid Owner");
        }
        return this.document.readDocument(name);
    }
}
