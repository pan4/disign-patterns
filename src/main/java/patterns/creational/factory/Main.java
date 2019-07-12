package patterns.creational.factory;

import patterns.creational.factory.button.Button;
import patterns.creational.factory.checkbox.Checkbox;

public class Main {
    public static void main(String[] args) {
        MacOSButtonFactory macOSButtonFactory = new MacOSButtonFactory();

        Button button = macOSButtonFactory.createButton();
        button.push();

        Checkbox checkbox = macOSButtonFactory.createCheckbox();
        checkbox.check();
    }
}
