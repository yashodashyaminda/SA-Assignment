package Task02;

public class Tea extends Beverages {
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    protected void addExtras() {
        System.out.println("Adding honey");
    }
}
