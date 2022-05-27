package State;

public class StopState implements State{

    @Override
    public void action(Engine e) {
        System.out.println("Action on stopping State");
        e.setState(this);
    }

    @Override
    public String returnState() {
        return "Stopping State";
    }
}
