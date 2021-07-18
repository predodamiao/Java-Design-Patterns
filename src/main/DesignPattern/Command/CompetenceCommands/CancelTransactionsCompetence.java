package Command.CompetenceCommands;

import Command.Competence;

public class CancelTransactionsCompetence implements CompetenceCommand{

    private Competence competence;

    public CancelTransactionsCompetence (Competence competence) {
        this.competence = competence;
    }

    @Override
    public void execute () {
        this.competence.getTransactions().clear();
    }

    @Override
    public void cancel () {
        throw new IllegalStateException("This command cannot be undone");
    }

}
