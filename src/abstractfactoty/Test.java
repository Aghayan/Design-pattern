package abstractfactoty;

public class Test {
    public static void main(String[] args) {
        ICar benz = CarAbstractFactory.getcar("luxury" , "benz2000");
        System.out.println(benz.getcarName());
        System.out.println(benz.getcarFeatures());


    }
}
