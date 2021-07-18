package Strategy;

public class StairsLike implements PrintMode{
    @Override
    public String format (String text) {
        String result = "";
        Integer spaces = 0;

        for(char ch : text.toCharArray()){
            for(int counter = 0; counter < spaces; counter++ ){
                result += " ";
            }
            result += ch+"\n";
            spaces ++;
        }

        return result.substring(0, result.length()-1);
    }
}
