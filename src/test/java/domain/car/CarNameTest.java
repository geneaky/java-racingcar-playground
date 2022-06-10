package domain.car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTest {

    @Test
    public void 자동차_이름은_5자_이상_예외() throws Exception {
        //given
        //when
        //then
        assertThatThrownBy(() -> {
            CarName.validateName("hihihi");
        }).isInstanceOf(IllegalArgumentException.class);

    }

}
