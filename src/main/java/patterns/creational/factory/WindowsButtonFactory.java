package patterns.creational.factory;

import patterns.creational.factory.button.Button;
import patterns.creational.factory.button.WindowsButton;
import patterns.creational.factory.checkbox.Checkbox;
import patterns.creational.factory.checkbox.WindowsCheckbox;

public class WindowsButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
