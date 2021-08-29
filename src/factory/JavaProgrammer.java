package factory;

public class JavaProgrammer implements IProgrammer{
    @Override
    public void code() {
        System.out.println("java code");
    }

    @Override
    public void test() {
        System.out.println("java test");
    }
}
