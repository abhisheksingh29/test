import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class testCheck {

    testCalc calc = new testCalc();
@Test
    public void shouldReturnZeroOnEmptyString() throws Exception {
    assertEquals(calc.calculate(""),0);
}
@Test
    public void singleValueReplied() throws Exception {
    assertEquals(calc.calculate("1"),1);
}
@Test
    public void commaDelimitedReturnSum() throws Exception {
    assertEquals(calc.calculate("1,2"),3);
}
@Test
public void newLineDelimitedReturnSum() throws Exception {
    assertEquals(calc.calculate("1\n2"),3);
}
    @Test
    public void threeNumbersDelimitedReturnSum() throws Exception {
        assertEquals(calc.calculate("1\n2,3"),6);
    }
    @Test
    public void customDelimiterIsValid() throws Exception {
        assertEquals(calc.calculate("//;\n1;2"),3);
    }
    @Test(expected = Exception.class)
    public void testNegativeNumber() throws Exception{
    calc.calculate("-1,-2");
    }
}
