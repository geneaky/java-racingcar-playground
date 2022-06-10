package domain.car;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getValue() {
        return cars;
    }

    public int getSize() {
        return this.cars.size();
    }

    public List<Car> mostFastCars() {
        List<Car> mostFastCars = new ArrayList<>();
        Integer tempPosition = 0;
        tempPosition = getMostFastCarPosition(tempPosition);

        getMostFastCars(mostFastCars, tempPosition);

        return mostFastCars;
    }

    private void getMostFastCars(List<Car> mostFastCars, Integer tempPosition) {
        for (Car car : this.cars) {
            isEqualsToMostFastCarPosition(mostFastCars, tempPosition, car);
        }
    }

    private void isEqualsToMostFastCarPosition(List<Car> mostFastCars, Integer tempPosition, Car car) {
        if(car.getPosition().equals(tempPosition)) {
            mostFastCars.add(car);
        }
    }

    private Integer getMostFastCarPosition(Integer tempPosition) {
        for (Car car : this.cars) {
            Integer position = car.getPosition();
            tempPosition = getMaxPosition(tempPosition, position);
        }
        return tempPosition;
    }

    private Integer getMaxPosition(Integer tempPosition, Integer position) {
        if(position > tempPosition) {
            tempPosition = position;
        }
        return tempPosition;
    }
}
