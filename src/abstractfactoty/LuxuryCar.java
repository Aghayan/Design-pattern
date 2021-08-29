package abstractfactoty;

public class LuxuryCar implements ICar{
    @Override
    public String getcarName() {
        return "safary";
    }

    @Override
    public String getcarFeatures() {
        return "light";
    }
}
