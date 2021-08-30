package proxy;

public class ServiceProxy implements IService{
    private static IService object;
    @Override
    public void process() {
        if(object == null){
            object = new ServiceImpl();
        }
        object.process();
    }
}
