package decorator;

public class TreeDecorator implements ChTree{
    private ChTree tree;

    public TreeDecorator(ChTree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
