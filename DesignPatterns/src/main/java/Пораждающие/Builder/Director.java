package Пораждающие.Builder;

public class Director
{
    public void createSportCar(Builder builder){
        builder.reset();
        builder.setWheels();
        builder.setEngine();
        builder.setGPS();
        builder.setTripComputer();
    }
}
