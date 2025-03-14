package Пораждающие.Singletone;

public class ST
{
    public static ST instance;

    public static ST getInstance() {
        if (instance == null) {
            instance = new ST();
        }

        return instance;
    }

    private ST() {
    }

    public void print() {
        System.out.println("print");
    }

}
