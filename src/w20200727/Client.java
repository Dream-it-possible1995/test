package w20200727;

import w20200727.A;
import w20200727.B;

public class Client {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        for (int i = 0; i < 5; i++) {
            b.getU(a.f());
        }

        b.useU();
    }
}
