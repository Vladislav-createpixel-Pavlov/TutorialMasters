package Пораждающие.FactoryMethod;

public class CarSelector
{
    public Car getCar(RoadType var1) {
        Object var2 = null;
        switch (var1) {
            case Dirt -> var2 = new RangeRover();
            case City -> var2 = new McLaren();
        }

        return (Car)var2;
    }
}
