package Command;

import Command.CompetenceCommands.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class FinanceDepartmentTest {

    Transaction t1;
    Transaction t2;
    Competence competence;
    FinanceDepartment financeDepartment;
    CompetenceCommand open;
    CompetenceCommand close;
    CompetenceCommand cancelTransactions;
    CompetenceCommand calculate;

    @BeforeEach
    public void init(){
        t1 = new Transaction(new BigDecimal("10"));
        t2 = new Transaction(new BigDecimal("20"));
        competence = new Competence("Test");
        financeDepartment = FinanceDepartment.getInstance();
        open = new OpenCompetence(competence);
        close = new CloseCompetence(competence);
        cancelTransactions = new CancelTransactionsCompetence(competence);
        calculate = new CalculateCompetence(competence);
    }


    @Test
    public void competenceShouldBeClosedAfterCreation() {
        assertFalse(competence.isOpen());
    }

    @Test
    public void competenceShouldBeOpen() {
        CompetenceCommand open = new OpenCompetence(competence);
        financeDepartment.executeCommand(open);
        assertTrue(competence.isOpen());
    }

    @Test
    public void competenceOpenCommandCannotBeUndoneAfterAnyTransaction() {
        financeDepartment.executeCommand(open);
        competence.addTransaction(t1);

        try {
            financeDepartment.cancelLastCommand();
            fail();
        }catch(Exception e) {
            assertEquals(e.getMessage(), "The competence have transactions. Can't be closed");
            assertTrue(competence.isOpen());
        }
    }

    @Test
    public void clearTransactionsShouldAllowCloseCompetence() {
        financeDepartment.executeCommand(open);
        competence.addTransaction(t1);
        competence.addTransaction(t2);
        financeDepartment.executeCommand(cancelTransactions);
        financeDepartment.executeCommand(close);
        assertFalse(competence.isOpen());
    }
    @Test
    public void calculateShouldCloseCompetence() {
        financeDepartment.executeCommand(open);
        competence.addTransaction(t1);
        competence.addTransaction(t2);
        financeDepartment.executeCommand(calculate);
        assertFalse(competence.isOpen());
    }

    @Test
    public void shouldNotAddTransactionOnClosedCompetence() {
        try {
            competence.addTransaction(t1);
            fail();
        }catch(Exception e) {
            assertEquals(e.getMessage(), "The competence is closed.");
        }
    }

    @Test
    public void calculateCompetence() {
        financeDepartment.executeCommand(open);
        competence.addTransaction(t1);
        competence.addTransaction(t2);
        financeDepartment.executeCommand(calculate);
        assertEquals(new BigDecimal("30"), competence.getCompetenceInvoice().getPrice());
    }

}
