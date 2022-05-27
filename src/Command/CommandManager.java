package Command;

public class CommandManager implements Command{
    private Operations operation;
    private Long amount;
    private String operationType;

    public CommandManager(Operations operation, Long amount, String operationType) {
        this.operation = operation;
        this.amount = amount;
        this.operationType = operationType;
    }

    @Override
    public void execute() {

        if(operationType.equalsIgnoreCase("Withdrawal")) {
            this.operation.withdrawal(amount);
        }
        else if(operationType.equalsIgnoreCase("Deposit")) {
            this.operation.deposit(amount);
        }

    }
}
