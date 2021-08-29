package abstractfactoty;

public class CarAbstractFactory {
    public static ICar getcar(String factory ,String carname){
        ICar car = null;
        switch (factory){
            case "luxury":
                switch (carname){
                    case "benz2000":
                        car = new LuxuryCar();
                        break;
                    case "benz1000":
                        car = new LuxuryCar();
                        break;
                }
                break;
            case "nonluxury":
                switch (carname){
                    case "sapa140":
                        car = new NonLuxuryCar();
                        break;
                    case "sapa131":
                        car = new NonLuxuryCar();
                        break;
                }
        }
        return car;
    }
}
