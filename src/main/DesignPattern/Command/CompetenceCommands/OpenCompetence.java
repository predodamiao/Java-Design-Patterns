package Command.CompetenceCommands;

import Command.Competence;

public class OpenCompetence implements CompetenceCommand{

    private Competence competence;

    public OpenCompetence (Competence competence) {
        this.competence = competence;
    }

    @Override
    public void execute () {
        if(competence.getCompetenceInvoice() == null)
            this.competence.setStatus(Competence.OPEN);
        else{
            this.competence.setCompetenceInvoice(null);
        }
    }

    @Override
    public void cancel () {
        if(this.competence.getTransactions().size() == 0)
            this.competence.setStatus(Competence.CLOSED);
        else{
            throw new IllegalArgumentException("The competence have transactions. Can't be closed");
        }
    }
}
