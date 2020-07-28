package w20200727;

import w20200727.FooAException;
import w20200727.FooBException;

public class Ship {
    public static void main(String[] args) {
        f();
    }

    static void g() throws FooAException {
        System.out.println("抛出A型异常!");
        throw new FooAException();
    }

    static void f() {
        try {
            g();
        }catch (FooAException fae) {
            System.out.println("捕获A异常，并抛出运行时异常B!");
            throw new FooBException();
        }
    }
}
