package Command.CompetenceCommands;

import Command.Competence;

public class CalculateCompetence implements CompetenceCommand{
    private Competence competence;

    public CalculateCompetence (Competence competence) {
        this.competence = competence;
    }

    @Override
    public void execute () {
        this.competence.calculate();
        this.competence.setStatus(Competence.CLOSED);
    }

    @Override
    public void cancel () {
        this.competence.setCompetenceInvoice(null);
    }
}
