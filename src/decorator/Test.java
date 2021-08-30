package decorator;

public class Test {
    public static void main(String[] args) {
        ChTree tree = new ChTreeImpl();
        System.out.println(tree.decorate());

        ChTree tree2 = new Lamp(tree);
        System.out.println(tree2.decorate());

        TreeDecorator treeDecorator = new Lamp(new Roban(tree));
        System.out.println(treeDecorator.decorate());
    }
}
