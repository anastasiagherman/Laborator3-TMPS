package State;

public class RunningState implements State{
    @Override
    public void action(Engine e) {
        System.out.println("Action on running State");
        e.setState(this);
    }

    @Override
    public String returnState() {
        return "Running  State";
    }
}
