package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DepositCashTest {

    @Test
    void deposit_less_than_30000_result_should_be_True() {
        float depositCash = 5000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositCashPerTransaction(depositCash);
        assertTrue(actualResult);
    }

    @Test
    void deposit_equals_to_30000_result_should_be_True() {
        float depositCash = 30000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositCashPerTransaction(depositCash);
        assertTrue(actualResult);
    }

    @Test
    void deposit_greater_than_30000_result_should_be_False() {
        float depositCash = 32000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositCashPerTransaction(depositCash);
        assertFalse(actualResult);
    }

}
