package Пораждающие.Builder;

public class OrdinaryCarBuilder implements Builder{
    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setWheels() {
        car.setWheels("");
    }

    @Override
    public void setEngine() {
        car.setEngine("N20B5");
    }

    @Override
    public void setTripComputer() {
        car.setTripComputer("");
    }

    @Override
    public void setGPS( ) {
        car.setGps("");
    }
    public Car getResult(){
        return car;
    }
}
