package Interpreter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CommandInterpreter {

    public static Command interpret (String context) {

        Command c = new Command();

        List<String> elements = Arrays.asList(context.split(" "));
        Iterator<String> iterator = elements.iterator();

        if(elements.size() == 0){
            throw new IllegalArgumentException("Invalid command");
        }else if(elements.size() == 1 && elements.get(0).isEmpty()){
            throw new IllegalArgumentException("Invalid command");
        }else{
            c.setCommand(iterator.next());
        }

        while (iterator.hasNext()) {
            String param = iterator.next();
            String argument = "";
            if(param.startsWith("-")){
                if(iterator.hasNext()){
                    argument = iterator.next();
                    if(argument.startsWith("-")){
                        throw new IllegalArgumentException("Invalid command");
                    }else{
                        c.addOption(param, argument);
                    }
                }else{
                    throw new IllegalArgumentException("Invalid command");
                }
            }else{
                c.addOption(param, "");
            }
        }
        return c;
    }
}
