package Пораждающие.Builder;

public class CarManualBuilder implements Builder{
    Manual manual;
    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setWheels() {
        manual.setWheels("Установлены колеса, указанного радиуса");
    }

    @Override
    public void setEngine() {
        manual.setEngine("Установлен указанный двигатель");
    }

    @Override
    public void setTripComputer() {
        manual.setTripComputer("Установлен укзанный компьютер");
    }

    @Override
    public void setGPS() {
        manual.setGps("Установлен указанный GPS навигатор");
    }
    public Manual getResult(){
        return manual;
    }
}
