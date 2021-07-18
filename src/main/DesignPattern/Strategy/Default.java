package Strategy;

public class Default implements PrintMode{
    @Override
    public String format (String text) {
        return text.replace(" ", "").replace("\n", "");
    }
}
