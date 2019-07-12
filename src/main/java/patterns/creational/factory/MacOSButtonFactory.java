package patterns.creational.factory;

import patterns.creational.factory.button.Button;
import patterns.creational.factory.button.MacOSButton;
import patterns.creational.factory.checkbox.Checkbox;
import patterns.creational.factory.checkbox.MacOSCheckbox;

public class MacOSButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
