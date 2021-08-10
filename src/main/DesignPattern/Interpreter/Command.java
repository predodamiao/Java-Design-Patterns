package Interpreter;

import java.util.HashMap;
import java.util.Map;

public class Command {
    private String command;
    private Map<String,String> options;

    public Command () {
        options = new HashMap<>();
    }

    public Command (String command) {
        this.command = command;
        options = new HashMap<>();
    }

    public String getCommand () {
        return command;
    }

    public Command setCommand (String command) {
        this.command = command;
        return this;
    }

    public Map<String, String> getOptions () {
        return options;
    }

    public Command setOptions (Map<String, String> options) {
        this.options = options;
        return this;
    }

    public Command addOption(String param, String argument){
        this.options.put(param, argument);
        return this;
    }

    @Override
    public String toString () {
        return "Command{" +
                "command='" + command + '\'' +
                ", options=" + options +
                '}';
    }
}
