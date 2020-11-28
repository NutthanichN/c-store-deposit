package th.ac.ku;

public class BankAccount {

    private String id;
    private String accountName;
    private boolean isSuspended;

    public BankAccount(String id, String accountName) {
        this(id, accountName, false);
    }

    public BankAccount(String id, String accountName, boolean suspended) {
        this.id = id;
        this.accountName = accountName;
        this.isSuspended = suspended;
    }

    public boolean getSuspendedStatus() {
        return this.isSuspended;
    }

    public String getId() {
        return this.id;
    }

}
