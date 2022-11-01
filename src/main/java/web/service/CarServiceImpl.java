package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{
    private static List<Car> carList = new ArrayList<Car>();

    static {
        carList.add(new Car("BMW", "m20b20", "e30"));
        carList.add(new Car("Volvo", "g26", "v20"));
        carList.add(new Car("Mercedes", "n43", "c63"));
        carList.add(new Car("Lada", "s50", "Largus"));
        carList.add(new Car("VW", "d30", "Passat"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0 || count >= 5) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
