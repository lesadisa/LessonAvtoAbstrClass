package engine;

public interface Engine {

    // TODO: я бы переименовал этот метод в например getSpeed, так как makeEngine больше похож на фабричный метод и мы ожидаем, что он вернет Engine, а не String
    public String makeEngine();
}
