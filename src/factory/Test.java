package factory;

public class Test {
    public static void main(String[] args) {
        IProgrammer javaprogrammer = ProgrammerFactory.programmer("java");
        javaprogrammer.code();
        javaprogrammer.test();
    }
}
