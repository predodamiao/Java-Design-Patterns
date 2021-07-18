package Strategy;

public class Vertical implements PrintMode{
    @Override
    public String format (String text) {
        String result = "";

        for(char ch : text.toCharArray()){
            result += ch+"\n";
        }

        return result.substring(0, result.length()-1);
    }
}
