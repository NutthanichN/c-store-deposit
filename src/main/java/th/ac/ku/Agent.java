package th.ac.ku;

import java.util.ArrayList;
import java.util.List;

public class Agent {

    private float allowedDepositCash = 30000.00f;
    private float dailyLimitCash = 50000.00f;
    private float minimumRate = 400.00f;
    private List<BankAccount> bankAccounts = new ArrayList<BankAccount>();

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public BankAccount getBankAccount(String accountId) {
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getId().equals(accountId)) {
                return bankAccount;
            }
        }
        return null;
    }

    public boolean checkDepositCashPerTransaction(float depositCash) {
        return depositCash <= allowedDepositCash;
    }

    public boolean checkDepositCashPerDay(float dailyDepositCash) {
        return this.checkDepositCashPerDay(dailyDepositCash, dailyLimitCash);
    }

    public boolean checkDepositCashPerDay(float dailyDepositCash, float limit) {
        return dailyDepositCash <= limit;
    }

    public boolean canDeposit(BankAccount account) {
        return !account.getSuspendedStatus();
    }

    public boolean meetMinimumRate(float depositCash) {
        return depositCash >= minimumRate;
    }

}
