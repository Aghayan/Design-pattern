package strategy;

import java.util.List;

public class TextProcessor {
    Strategy strategy ;
    StringBuilder sb = new StringBuilder();
    
    TextProcessor(OutPutFormat format){
        setOutPutFormat(format);
    }

    public void setOutPutFormat(OutPutFormat format) {
        switch (format){
            case HTML:
                strategy = new HtmlStragegy();
                break;
            case XML:
                strategy = new XmlStrategy();
                break;
        }
    }
    public void appendList(List<String> item){
        strategy.start(sb);
        for(String st : item)
            strategy.addlistitm(sb , st);
        strategy.end(sb);
    }

    public void clear(){
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
