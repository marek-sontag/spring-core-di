package pl.sda.spring.coredi.beans;

public class Car {

    private String brand;
    private int maxSpped;
    private Engine engine;

    public Car(String brand, int maxSpped) {
        this.brand = brand;
        this.maxSpped = maxSpped;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpped() {
        return maxSpped;
    }

    public void setMaxSpped(int maxSpped) {
        this.maxSpped = maxSpped;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
