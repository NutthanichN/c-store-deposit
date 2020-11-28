package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DailyDepositCashTest {

    @Test
    void deposit_less_than_50000_in_one_day_should_succeed() {
        float depositCash = 15000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerDay(depositCash);
        assertTrue(actualResult);
    }

    @Test
    void deposit_equals_to_50000_in_one_day_should_succeed() {
        float depositCash = 50000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerDay(depositCash);
        assertTrue(actualResult);
    }

    @Test
    void deposit_greater_than_50000_in_one_day_should_fail() {
        float dailyDepositCash = 55000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerDay(dailyDepositCash);
        assertFalse(actualResult);
    }
}
