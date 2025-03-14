package Пораждающие.Strategy;

public class Context {
    private Strategy strategy;
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    public void ExecuteStrategy(Strategy strategy){
        strategy.execute();
    }

}
