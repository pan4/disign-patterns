package patterns.creational.factory.checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("You checked mac os checkbox");
    }
}
