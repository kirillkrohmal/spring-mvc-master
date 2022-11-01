package web.model;


import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;


public class Car {
    int id;
    String carName;
    String carEngine;
    String model;

    public Car() {
    }

    public Car(String carName, String carEngine, String model) {
        this.carName = carName;
        this.carEngine = carEngine;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
