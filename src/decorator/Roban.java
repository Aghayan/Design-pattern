package decorator;

public class Roban extends TreeDecorator{
    public Roban(ChTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decotarewithroban();
    }

    private String decotarewithroban(){
        return " DECORATE WITH ROBAN ";
    }
}
