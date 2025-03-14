package Пораждающие.FactoryMethod.FM;

public class Main
{
    static Dialog dialog;
    static String button = "Windows";

    public static void initialize()
    {
        if(button.equals("HTML"))
            dialog = new HTMLDialog();
        else if(button.equals("Windows"))
            dialog = new WindowsDialog();
        else
            System.out.println("Ошибка неверные входные данные");
    }

    public static void main(String[] args) {
        initialize();
        dialog.createButton().render();
        dialog.createButton().onClick();
    }
}
