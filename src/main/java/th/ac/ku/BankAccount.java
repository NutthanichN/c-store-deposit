package th.ac.ku;

public class BankAccount {

    private int id;
    private String accountName;
    private boolean isSuspended;

    public BankAccount(int id, String accountName) {
        this(id, accountName, false);
    }

    public BankAccount(int id, String ownerName, boolean suspended) {
        this.id = id;
        this.accountName = ownerName;
        this.isSuspended = suspended;
    }

    public boolean getSuspendedStatus() {
        return this.isSuspended;
    }

}
