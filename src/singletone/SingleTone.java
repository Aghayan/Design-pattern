package singletone;

public class SingleTone {

    //wallet
    private static SingleTone singleTone= null;

    private SingleTone(){

    }

    //access method
    public static SingleTone getSingleTone(){
        if(singleTone == null)
            singleTone = new SingleTone();
        return singleTone;
    }

}
