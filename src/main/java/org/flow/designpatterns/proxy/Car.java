package org.flow.designpatterns.proxy;

public class Car implements ICar {
    private String type;

    public Car(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void drive(Driver driver) {
        System.out.println("Witness me Brother! (driver age: " + driver.getAge() + ")");
    }
}
