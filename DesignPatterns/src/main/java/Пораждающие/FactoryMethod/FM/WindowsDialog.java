package Пораждающие.FactoryMethod.FM;

import java.io.DataOutput;

public class WindowsDialog extends Dialog
{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
