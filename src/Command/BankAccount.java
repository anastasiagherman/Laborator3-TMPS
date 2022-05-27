package Command;

public class BankAccount {

    private CommandManager command;

    public BankAccount(CommandManager command) {
        super();
        this.command = command;
    }

    public CommandManager getCommand() {
        return command;
    }

    public void setCommand(CommandManager command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}

