package State;

public interface State {
    public void action(Engine e);
    public String returnState();
}
