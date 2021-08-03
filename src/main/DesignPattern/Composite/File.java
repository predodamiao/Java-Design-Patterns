package Composite;

public abstract class File {

    private String name;

    public File (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public File setName (String name) {
        this.name = name;
        return this;
    }

    public abstract String getContent();
}
