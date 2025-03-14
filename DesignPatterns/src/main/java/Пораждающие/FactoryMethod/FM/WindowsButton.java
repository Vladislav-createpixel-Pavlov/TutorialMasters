package Пораждающие.FactoryMethod.FM;

public class WindowsButton implements Button
{
    @Override
    public void render() {
        System.out.println("Windows button - render");
    }

    @Override
    public void onClick() {
        System.out.println("Windows button - onclick");
    }
}
