package domain.judgement;

import domain.car.Car;
import domain.car.CarName;
import domain.car.Cars;
import domain.numbergenerator.RandomMoveStrategyImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class JudgementTest {

    @Test
    public void 자동차의_이동거리로_순위를_반환한다() throws Exception {
        //given
        Judgement judgement = new Judgement();
        List<Car> carList = new ArrayList<>();
        Car car1 = new Car(new CarName("hihi"), new RandomMoveStrategyImpl());
        car1.move(1);
        Car car2 = new Car(new CarName("bibib"), new RandomMoveStrategyImpl());
        car2.move(3);
        Car car3 = new Car(new CarName("titit"), new RandomMoveStrategyImpl());
        car3.move(2);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        Cars cars = new Cars(carList);
        //when
        //then
        assertThat(judgement.judge(cars)).isEqualTo("bibib가 최종 우승입니다.");

    }

    @Test
    public void 공동_우승이_가능하다() throws Exception {
        //given
        Judgement judgement = new Judgement();
        List<Car> carList = new ArrayList<>();
        Car car1 = new Car(new CarName("hihi"), new RandomMoveStrategyImpl());
        car1.move(3);
        Car car2 = new Car(new CarName("bibib"), new RandomMoveStrategyImpl());
        car2.move(3);
        Car car3 = new Car(new CarName("titit"), new RandomMoveStrategyImpl());
        car3.move(2);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        Cars cars = new Cars(carList);
        //when
        //then
        assertThat(judgement.judge(cars)).isEqualTo("hihi,bibib가 최종 우승입니다.");
    }
}
