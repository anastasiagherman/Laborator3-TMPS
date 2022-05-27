package Command;

public class Client {
    public static void main(String[] args) {

        Operations operations = new Operations();

        CommandManager commandWithdrawal = new CommandManager(operations, 2540L, "Withdrawal");
        BankAccount atm = new BankAccount(commandWithdrawal);
        atm.setCommand(commandWithdrawal);
        atm.execute();

        CommandManager commandDeposit = new CommandManager(operations, 7530L, "Deposit");
        atm.setCommand(commandDeposit);
        atm.execute();


    }

}
