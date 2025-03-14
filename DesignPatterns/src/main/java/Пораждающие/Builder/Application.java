package Пораждающие.Builder;

public class Application
{
    public static void main(String[] args) {
        Director director = new Director();
        OrdinaryCarBuilder ordinaryCarBuilder = new OrdinaryCarBuilder();
        director.createSportCar(ordinaryCarBuilder);
        Car car = ordinaryCarBuilder.getResult();
        System.out.println(car.getEngine());
    }

}
