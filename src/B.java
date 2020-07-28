import java.util.ArrayList;
import java.util.List;

public class B {
    List<U> list = new ArrayList<>();

    public void getU(U u) {
        list.add(u);
    }

    public void useU() {
        for (U u : list) {
            u.sing();
            u.jump();
            u.rap();
        }
    }
}
