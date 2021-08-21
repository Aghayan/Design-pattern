package strategy;

public class XmlStrategy implements Strategy{
    @Override
    public void addlistitm(StringBuilder sb, String item) {
        sb.append("*").append(item).append(System.lineSeparator());
    }
}
