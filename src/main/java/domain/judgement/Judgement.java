package domain.judgement;

import domain.car.Car;
import domain.car.Cars;

import java.util.List;

public class Judgement {

    public String judge(Cars cars) {
        List<Car> carList = cars.mostFastCars();
        String winner = "";

        for(int i = 0; i < carList.size(); i++) {
            winner += carList.get(i).getCarName();
            if((i + 1) != carList.size()) {
                winner += ",";
            }
        }

        return winner+"가 최종 우승입니다.";
    }
}
