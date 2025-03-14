package Пораждающие.FactoryMethod;

public class Main
{
    public static void main(String[] var0) {
        CarSelector var1 = new CarSelector();
        Car var2 = var1.getCar(RoadType.Dirt);
        var2.drive();
        var2.stop();
    }
}
