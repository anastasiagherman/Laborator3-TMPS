package State;

public class Engine {
    private State state;

    public Engine(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public void setState(State state){
        this.state = state;
    }
}
