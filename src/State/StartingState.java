package State;

public class StartingState implements State {
    @Override
    public void action(Engine e) {
        System.out.println("Action on starting State");
        e.setState(this);
    }

    @Override
    public String returnState() {
        return "Starting State";
    }
}
