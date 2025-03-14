package Пораждающие.FactoryMethod.FM;

public class HTMLButton implements Button
{
    @Override
    public void render() {
        System.out.println("HTML button - render");
    }

    @Override
    public void onClick() {
        System.out.println("HTML button - onclick");
    }
    
}
