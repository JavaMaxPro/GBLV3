import java.util.ArrayList;

public class Box <T> implements Comparable <Box>{

    ArrayList <T> box;
    private T t;
    private float weightBox;

    public Box(){
        box = new ArrayList<>();
    }

    public void addFruit( ){
        this.box.add(t);
    }

    public static <F> Box<F> create(){
        return new Box<F>();
    }

    @Override
    public int compareTo(Box o) {
        return 0;
    }
}
