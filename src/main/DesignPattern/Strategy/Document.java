package Strategy;

public class Document {

    private String text;

    public Document (String text) {
        this.text = text;
    }

    public void formatDefault(){
        Formatter formatter = new Formatter(this.text);
        this.text = formatter.format(new Default());
    }

    public void formatVertical(){
        Formatter formatter = new Formatter(this.text);
        this.text =  formatter.format(new Vertical());
    }

    public void formatStairsLike(){
        Formatter formatter = new Formatter(this.text);
        this.text = formatter.format(new StairsLike());
    }

    public String getText () {
        return text;
    }

    public Document setText (String text) {
        this.text = text;
        return this;
    }
}
