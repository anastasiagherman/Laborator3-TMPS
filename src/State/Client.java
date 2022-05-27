package State;

public class Client {
    public static void main(String[] args) {
        State s = new RunningState();
        Engine engine = new Engine(s);
        System.out.println(engine.getState().returnState());
    }
}
