package Composite;

public class Archive extends File{

    private String data;

    public Archive (String name) {
        super(name);
    }

    public String getData () {
        return data;
    }

    public Archive setData (String data) {
        this.data = data;
        return this;
    }

    @Override
    public String getContent () {
        return "-" + getName();
    }
}
