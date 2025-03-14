package Пораждающие.AbstructFactory;

public class USAFactory implements TransportFactory
{
    public USAFactory() {
    }

    public Car createCar() {
        return new Ford();
    }

    public Aircraft createAirCeaft() {
        return new Boeing747();
    }
}
