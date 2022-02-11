import fruit.Apple;
import fruit.Orange;

public class App {
    public static void main(String[] args) {
        Box<Apple> appleBox = Box.create();
        Box<Orange> orangeBoxBox = Box.create();

        for (int i = 0; i < 7; i++) {
            appleBox.addFruit();
            orangeBoxBox.addFruit();
        }
        orangeBoxBox.addFruit();

    }
}
