import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {

    StringCalculator stringCalculator;

    @BeforeEach
    public void beforeEach() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void null_입력시_0을_반환() throws Exception {
        //given
        //when
        int result = stringCalculator.calculate(null);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void 텅빈_문자열_0을합산() throws Exception {
        //given
        //when
        int result = stringCalculator.calculate("");
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void 숫자_하나_입력시_해당_숫자_반환() throws Exception {
        //given
        //when
        int result = stringCalculator.calculate("1");
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void 문자열을_콤마로_구분하여_합산() throws Exception {
        //given
        //when
        int result = stringCalculator.calculate("1,1");
        //then
        assertThat(result).isEqualTo(2);
    }
    
    @Test
    public void 문자열을_콜론으로_구분하여_합산() throws Exception {
        //given
        //when
        int result = stringCalculator.calculate("1:1");
        //then
        assertThat(result).isEqualTo(2);
        
    }

    @Test
    public void 문자열을_콜론_콤마로_구분하여_합산() throws Exception {
        //given
        //when
        int result = stringCalculator.calculate("1:2,3");
        //then
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void 커스텀_구분자로_구분하여_합산() throws Exception {
        //given
        //when
        int result = stringCalculator.calculate("//;\n1;2;3");
        //then
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void 올바르지_않은_문자_입력시_RuntimeException() throws Exception {
        //given
        //when
        //then
        assertThatThrownBy(() -> {
            stringCalculator.calculate("-1;2;3");
        }).isInstanceOf(RuntimeException.class);
    }
}
