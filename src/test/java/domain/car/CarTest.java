package domain.car;

import domain.numbergenerator.RandomMoveStrategyImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void 자동차_이름_5자_이하_자동차_생성() throws Exception {
        //given
        String name = "hihi!";
        //when
        CarName.validateName(name);
        CarName carName = new CarName(name);
        Car car = new Car(carName, new RandomMoveStrategyImpl());
        //then
        Assertions.assertThat(car).isInstanceOf(Car.class);
    }
    
    @Test
    public void 자동차_출력시_좌표_이름_출력() throws Exception {
        //given
        String name = "mycar";
        //when
        CarName.validateName(name);
        CarName carName = new CarName(name);
        Car car = new Car(carName, new RandomMoveStrategyImpl());
        //then
        Assertions.assertThat(car.print("-")).isEqualTo("mycar : -");
    }
    
    @Test
    public void 자동차_전진() throws Exception {
        //given
        String name = "mycar";
        //when
        CarName.validateName(name);
        CarName carName = new CarName(name);
        Car car = new Car(carName, new RandomMoveStrategyImpl());
        car.move(1);
        //then
        Assertions.assertThat(car.print("-")).isEqualTo("mycar : --");
    }

}
