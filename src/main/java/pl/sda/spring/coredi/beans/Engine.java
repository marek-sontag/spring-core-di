package pl.sda.spring.coredi.beans;

public class Engine {
    private int engineVolume = 1200;
    private EngineType engineType;

    public Engine(int engineVolume, EngineType engineType) {
        this.engineVolume = engineVolume;
        this.engineType = engineType;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
