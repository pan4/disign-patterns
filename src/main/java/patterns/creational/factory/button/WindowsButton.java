package patterns.creational.factory.button;

public class WindowsButton implements Button {
    @Override
    public void push() {
        System.out.println("You pushed windows button");
    }
}
