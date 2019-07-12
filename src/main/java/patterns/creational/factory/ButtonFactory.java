package patterns.creational.factory;

import patterns.creational.factory.button.Button;
import patterns.creational.factory.checkbox.Checkbox;

public interface ButtonFactory {
    Button createButton();
    Checkbox createCheckbox();
}
