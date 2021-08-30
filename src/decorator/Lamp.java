package decorator;

public class Lamp extends TreeDecorator{

    public Lamp(ChTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decotarewithlamp();
    }

    private String decotarewithlamp(){
        return " DECORATE WITH LAMP ";
    }
}
