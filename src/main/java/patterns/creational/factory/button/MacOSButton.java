package patterns.creational.factory.button;

public class MacOSButton implements Button {
    @Override
    public void push() {
        System.out.println("You pushed mac os button");
    }
}
