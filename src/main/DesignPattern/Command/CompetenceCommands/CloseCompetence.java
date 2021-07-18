package Command.CompetenceCommands;

import Command.Competence;

public class CloseCompetence implements CompetenceCommand {

    private Competence competence;

    public CloseCompetence (Competence competence) {
        this.competence = competence;
    }

    @Override
    public void execute () {
        if(this.competence.getTransactions().size() == 0)
            this.competence.setStatus(Competence.CLOSED);
        else{
            throw new IllegalArgumentException("The competence have transactions. Can't be closed");
        }
    }

    @Override
    public void cancel () {
        this.competence.setStatus(Competence.OPEN);
    }

}
