package th.ac.ku;

public class Agent {

    private float allowedDepositCash = 30000.00f;

    public boolean checkDepositPerTransaction(float depositCash) {
        return depositCash <= allowedDepositCash;
    }
}
