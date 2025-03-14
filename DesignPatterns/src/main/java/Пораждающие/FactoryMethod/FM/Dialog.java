package Пораждающие.FactoryMethod.FM;

public abstract class Dialog {
    public void render() {
        Button button = createButton();
    }


     public abstract Button createButton();

}
