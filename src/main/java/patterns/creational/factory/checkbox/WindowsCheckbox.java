package patterns.creational.factory.checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("You checked windows checkbox");
    }
}
