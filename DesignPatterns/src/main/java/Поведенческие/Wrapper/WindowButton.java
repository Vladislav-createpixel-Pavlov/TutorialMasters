package Поведенческие.Wrapper;

public class WindowButton implements Button{
    @Override
    public void click() {
        System.out.println("Поведение кнопки");
    }
}
