package Strategy;

public class Student {
    Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;

    }

    public void executeStrategy(){
        strategy.activity();
    }
}
