package Пораждающие.AbstructFactory;

public class RussianFactory implements TransportFactory
{
    public RussianFactory() {
    }

    public Car createCar() {
        return new Niva();
    }

    public Aircraft createAirCeaft() {
        return new TU134();
    }
}
