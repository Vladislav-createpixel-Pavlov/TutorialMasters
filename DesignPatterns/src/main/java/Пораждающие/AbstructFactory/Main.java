package Пораждающие.AbstructFactory;

public class Main
{
    public static void main(String[] var0) {
        RussianFactory var1 = new RussianFactory();
        Aircraft var2 = var1.createAirCeaft();
        var2.flight();
    }
}
