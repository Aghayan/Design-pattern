package strategy;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        TextProcessor tp = new TextProcessor(OutPutFormat.HTML);
        tp.appendList(List.of("Amir" , "Muhammad" , "Ali"));
        System.out.println(tp);

        System.out.println("////////////////////");
        tp.clear();
        tp.setOutPutFormat(OutPutFormat.XML);
        tp.appendList(List.of("aa" , "bb" , "cc"));
        System.out.println(tp);

    }
}
