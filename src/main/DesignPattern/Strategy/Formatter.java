package Strategy;

public class Formatter {

    private String text;

    public Formatter (String text){
        this.text = text;
    }

    public String format(PrintMode printMode){
        return printMode.format(this.text);
    }

}
