package pl.sda.spring.coredi.beans;

import java.util.Objects;

public class PhilosopherAttribute {

    //We know that we must not hold money values in double. This is just for test.
    private double cost;
    private String name;

    public PhilosopherAttribute(double cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PhilosopherAttribute that = (PhilosopherAttribute) o;
        return Double.compare(that.cost, cost) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cost, name);
    }
}
