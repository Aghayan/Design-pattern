package proxy;

public class Client {
    public static void main(String[] args) {
        IService obj = new ServiceProxy();
        obj.process();
        obj.process();
        obj.process();
        obj.process();
        obj.process();
        obj.process();
    }
}
