package domain.car;

import domain.strategy.MoveStrategy;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    private final MoveStrategy moveStrategy;

    public CarFactory(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public Cars generateCars(String names) {
        String[] nameList = names.split(",");

        List<Car> cars = new ArrayList<>();
        for (String name : nameList) {
            CarName.validateName(name);
            CarName carName = new CarName(name);
            Car car = new Car(carName, moveStrategy);
            cars.add(car);
        }

        return new Cars(cars);
    }
}
