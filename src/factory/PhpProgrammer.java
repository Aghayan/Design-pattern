package factory;

public class PhpProgrammer implements IProgrammer{
    @Override
    public void code() {
        System.out.println("php code");
    }

    @Override
    public void test() {
        System.out.println("php test");
    }
}
