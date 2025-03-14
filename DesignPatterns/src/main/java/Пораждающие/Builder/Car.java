package Пораждающие.Builder;

public class Car
{
    private String wheels;

    public String getEngine() {
        return engine;
    }

    public String getWheels() {
        return wheels;
    }

    public String getTripComputer() {
        return tripComputer;
    }

    public String getGps() {
        return gps;
    }

    private String engine;

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    private String tripComputer;
    private String gps;
}
