package domain.car;

import domain.numbergenerator.RandomMoveStrategyImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarFactoryTest {

    @Test
    public void 문자열_입력받아_자동차_생성() throws Exception {
        //given
        CarFactory carFactory = new CarFactory(new RandomMoveStrategyImpl());
        //when
        String names = "abcd,efghi";
        Cars cars = carFactory.generateCars(names);
        //then
        Assertions.assertThat(cars.getSize()).isEqualTo(2);
    }
}
