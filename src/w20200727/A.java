package w20200727;

public class A {

    public U f() {
        return new U() {
            @Override
            public void sing() {
                System.out.print("唱 ");
            }

            @Override
            public void jump() {
                System.out.print("跳 ");
            }

            @Override
            public void rap() {
                System.out.println("Rap");
            }
        };
    }
}
