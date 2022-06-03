import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    public void 자동차_위치_조회시_이름과_함께_출력() throws Exception {
        //given
        Car car = new Car("hi");
        //when
        String position = car.getPosition();
        //then
        assertThat(position).isEqualTo("hi : -");
    }

    @Test
    public void 자동차_전진시_현재_위치_변경() throws Exception {
        //given
        Car car = new Car("hi");
        //when
        car.goFoward();
        String position = car.getPosition();
        //then
        assertThat(position).isEqualTo("hi : --");
    }
}
