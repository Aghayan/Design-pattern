package singletone;

public class TestSingleTone {

    public static void main(String[] args) {
        SingleTone app1 = SingleTone.getSingleTone();
        SingleTone app2 = SingleTone.getSingleTone();


        if(app1 == app2){
            System.out.println(app1);
            System.out.println(app2);
            System.out.println("app1 is exactly equal app2");
        }
    }
}
