package th.ac.ku;

public class Agent {

    private float allowedDepositCash = 30000.00f;
    private float dailyLimitCash = 50000.00f;

    public boolean checkDepositPerTransaction(float depositCash) {
        return depositCash <= allowedDepositCash;
    }

    public boolean checkDepositPerDay(float dailyDepositCash) {
        return this.checkDepositPerDay(dailyDepositCash, dailyLimitCash);
    }

    public boolean checkDepositPerDay(float dailyDepositCash, float limit) {
        return dailyDepositCash <= limit;
    }

    public boolean canDeposit(BankAccount account) {
        return !account.getSuspendedStatus();
    }

}
