import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import ru.example.entities.Account;
import ru.example.service.TransactionServiceImpl;

public class TransactionTest {

    @Test
    public void testSuccessTransaction() {
        final TransactionServiceImpl service = new TransactionServiceImpl();
        final Account firstAccount = new Account("Temnikov");
        final Account secondAccount = new Account("Ivanov");
        service.creditAccount(firstAccount, 100);
        service.makeTransaction(firstAccount, secondAccount, 100);
        Assert.assertEquals(firstAccount.getAmountOfMoney(), 0);
        Assert.assertEquals(secondAccount.getAmountOfMoney(), 100);
    }

    @Test
    public void testFailedTransaction() {
        final TransactionServiceImpl service = new TransactionServiceImpl();
        final Account firstAccount = new Account("Temnikov");
        final Account secondAccount = new Account("Ivanov");
        service.makeTransaction(firstAccount, secondAccount, 100);
        Assert.assertEquals(firstAccount.getAmountOfMoney(), 0);
        Assert.assertEquals(secondAccount.getAmountOfMoney(), 0);
    }
}
