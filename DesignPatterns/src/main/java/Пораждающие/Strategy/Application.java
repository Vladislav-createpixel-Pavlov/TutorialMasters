package Пораждающие.Strategy;

public class Application
{


    public static void main(String[] args) {
        Strategy strategy;
        Context context = new Context();
        strategy = new StrategyNumberOne();
        context.setStrategy(strategy);
        context.ExecuteStrategy(strategy);
        strategy = new StrategyNumberTwo();
        context.setStrategy(strategy);
        context.ExecuteStrategy(strategy);
        strategy = new StrategyNumberThree();
        context.setStrategy(strategy);
        context.ExecuteStrategy(strategy);

    }
}
