package proxy;

public class ServiceImpl implements IService{
    public ServiceImpl() {
        config();
    }

    @Override
    public void process() {
        System.out.println("process complete");
    }

    private void config(){
        System.out.println("initial config");
    }
}
