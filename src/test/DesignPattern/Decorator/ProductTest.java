package Decorator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void shouldReturnJustSubscriptionsPrice(){
        Product subscriptions = new Subscription(new BigDecimal(10), 100L);

        assertEquals(new BigDecimal(1000), subscriptions.getTotalPrice());
        assertEquals("Subscription (100 users)", subscriptions.getModules());
    }

    @Test
    public void shouldReturnSubscriptionsWithFMPrice(){
        Product subscriptions = new Subscription(new BigDecimal(10), 100L);
        Product financialModule = new FinancialModule(subscriptions);

        assertEquals(new BigDecimal(2000), financialModule.getTotalPrice());
        assertEquals("Subscription (100 users) | Financial", financialModule.getModules());
    }

    @Test
    public void shouldReturnSubscriptionsWithPOPPrice(){
        Product subscriptions = new Subscription(new BigDecimal(10), 100L);
        Product popModule = new PointOfPurchaseModule(subscriptions);

        assertEquals(new BigDecimal(2000), popModule.getTotalPrice());
        assertEquals("Subscription (100 users) | POP", popModule.getModules());
    }

    @Test
    public void shouldReturnSubscriptionsWithCRMPrice(){
        Product subscriptions = new Subscription(new BigDecimal(10), 100L);
        Product crmModule = new CustomerRelatioshipManagementModule(subscriptions);

        assertEquals(new BigDecimal(1700), crmModule.getTotalPrice());
        assertEquals("Subscription (100 users) | CRM", crmModule.getModules());
    }

    @Test
    public void shouldReturnSubscriptionsWithAccountingPrice(){
        Product subscriptions = new Subscription(new BigDecimal(10), 100L);
        Product accountingModule = new AccountingModule(subscriptions);

        assertEquals(new BigDecimal(1200), accountingModule.getTotalPrice());
        assertEquals("Subscription (100 users) | Accounting", accountingModule.getModules());
    }

    @Test
    public void shouldReturnSubscriptionsWithCfPopCrmAccountingPrice(){
        Product subscriptions = new Subscription(new BigDecimal(10), 100L);
        Product financialModule = new FinancialModule(subscriptions);
        Product popModule = new PointOfPurchaseModule(financialModule);
        Product crmModule = new CustomerRelatioshipManagementModule(popModule);
        Product accountingModule = new AccountingModule(crmModule);

        assertEquals(new BigDecimal(3900), accountingModule.getTotalPrice());
        assertEquals("Subscription (100 users) | Financial | POP | CRM | Accounting", accountingModule.getModules());
    }

}
