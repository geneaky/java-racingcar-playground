import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarGeneratorTest {

    CarGenerator carGenerator;

    @BeforeEach
    public void beforeEach() {
        carGenerator = new CarGenerator();
    }

    @Test
    public void 자동차의_이름은_5자를_초과할_수_없다() throws Exception {
        //given
        //when
        //then
        assertThatThrownBy(() -> {
            carGenerator.generate("abcde");
        }).isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    public void 자동차의_이름은_쉼표를_기준으로_입력() throws Exception {
        //given
        //when
        Cars cars = carGenerator.generate("hi,bi,me,mine");
        //then
        assertThat(cars.getCars().size()).isEqualTo(4);
    }
}
