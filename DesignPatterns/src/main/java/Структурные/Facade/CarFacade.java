package Структурные.Facade;

public class CarFacade {
    private Door door = new Door();
    private Engine engen = new Engine();
    private Wheel wheel = new Wheel();


    public void go() {
        this.door.open();
        this.engen.start();
        this.wheel.turn();
    }
}

