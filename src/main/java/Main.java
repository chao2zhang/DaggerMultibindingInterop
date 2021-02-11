
public class Main {

    public static void main(String[] args) {
        MyComponent myComponent = DaggerMyComponent.create();
        myComponent.useViewModelFactory();
        myComponent.viewModelFactory();
    }
}
