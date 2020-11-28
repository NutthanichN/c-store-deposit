package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MinimumDepositRateTest {

    @Test
    void deposit_less_than_minimum_rate_and_result_should_be_false() {
        float depositCash = 350.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.meetMinimumRate(depositCash);
        assertFalse(actualResult);
    }

    @Test
    void deposit_equals_to_minimum_rate_and_result_should_be_true() {
        float depositCash = 400.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.meetMinimumRate(depositCash);
        assertTrue(actualResult);
    }

    @Test
    void deposit_greater_than_minimum_rate_and_result_should_be_true() {
        float depositCash = 1500.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.meetMinimumRate(depositCash);
        assertTrue(actualResult);
    }
}
