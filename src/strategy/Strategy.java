package strategy;

public interface Strategy {
    default void start(StringBuilder sb){};
    void addlistitm(StringBuilder sb , String item);
    default void end(StringBuilder sb){};
}

enum OutPutFormat{
    XML,HTML
}
