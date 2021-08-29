package factory;

public class ProgrammerFactory {
    public static IProgrammer programmer(String type){
        IProgrammer programmer = null;
        switch (type){
            case "java" :
                programmer = new JavaProgrammer();
                break;
            case "php" :
                programmer = new PhpProgrammer();
                break;
        }
        return programmer;
    }
}
