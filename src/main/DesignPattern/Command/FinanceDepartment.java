package Command;

import Command.CompetenceCommands.CompetenceCommand;

public class FinanceDepartment{

    private static FinanceDepartment instance;
    private CompetenceCommand lastCommand;

    private FinanceDepartment () {
    }

    public static FinanceDepartment getInstance (){
        if(instance == null) {
            instance = new FinanceDepartment();
        }
        return instance;
    }

    public void executeCommand(CompetenceCommand command){
        command.execute();
        lastCommand = command;
    }

    public void cancelLastCommand(){
        lastCommand.cancel();
    }
}
