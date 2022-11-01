package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
    private static List<Car> carList = new ArrayList<Car>();

    static {
        carList.add(new Car("BMW", "m20b20", "e30"));
        carList.add(new Car("Volvo", "g26", "v20"));
        carList.add(new Car("Mercedes", "n43", "c63"));
        carList.add(new Car("Lada", "s50", "Largus"));
        carList.add(new Car("VW", "d30", "Passat"));
    }

    @Override
    public List<Car> getCar(int count) {
        if (count == 0 || count >= 5) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
