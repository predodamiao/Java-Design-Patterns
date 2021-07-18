package Command;

import Command.CompetenceCommands.CompetenceCommand;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Competence {

    public static Boolean OPEN = true;
    public static Boolean CLOSED = false;

    private String name;
    private List<Transaction> transactions;
    private Invoice competenceInvoice;
    private Boolean status = Competence.CLOSED;

    public Competence (String name) {
        this.name = name;
        this.transactions = new ArrayList<Transaction>();
    }

    public Boolean isOpen(){
        return status;
    }

    public void setStatus (Boolean status) {
        this.status = status;
    }

    public List<Transaction> getTransactions () {
        return transactions;
    }

    public void calculate(){
        BigDecimal total = BigDecimal.ZERO;

        for(Transaction t : transactions){
            total = total.add(t.getPrice());
        }

        this.competenceInvoice = new Invoice(total);
    }

    public void addTransaction(Transaction transaction){
        if(status == OPEN)
            this.transactions.add(transaction);
        else
            throw new IllegalArgumentException("The competence is closed.");
    }

    public Invoice getCompetenceInvoice () {
        return competenceInvoice;
    }

    public void setCompetenceInvoice (Invoice competenceInvoice) {
        this.competenceInvoice = competenceInvoice;
    }
}
