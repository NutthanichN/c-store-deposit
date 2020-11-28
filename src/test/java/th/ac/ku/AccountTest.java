package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {

    @Test
    void account_is_valid_and_can_deposit() {
        Agent agent = new Agent();
        String accountId = "123456789";
        agent.addBankAccount(new BankAccount(accountId, "Tester", false));
        BankAccount account = agent.getBankAccount(accountId);

        boolean actualResult = agent.canDeposit(account);
        assertTrue(actualResult);
    }

    @Test
    void account_is_invalid_and_cannot_deposit() {
        Agent agent = new Agent();
        String accountId = "123456789";
        agent.addBankAccount(new BankAccount(accountId, "Tester", true));
        BankAccount account = agent.getBankAccount(accountId);

        boolean actualResult = agent.canDeposit(account);
        assertFalse(actualResult);
    }
}
