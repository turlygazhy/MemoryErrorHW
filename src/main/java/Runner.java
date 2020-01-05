import java.util.LinkedList;
import java.util.List;

public class Runner {
    static final List<Object[]> arrays = new LinkedList<>();

    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            arrays.add(new Object[1000]);
            System.out.println(i);
        }
    }
}
