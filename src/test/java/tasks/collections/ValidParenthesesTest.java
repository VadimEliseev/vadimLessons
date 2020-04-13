package tasks.collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ValidParenthesesTest {
    @Parameterized.Parameters(name = " {0} -> {1} ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"()", true},
                {"[]", true},
                {"{}", true},
                {"([{}])", true},
                {"(){}[]", true},
                {"((([{([{}])}])))", true},
                {"()[{()}]([{}[]()])", true},
                {"()()()()()", true},
                {"{()[](){(){}[()]}}", true},
                {"(", false},
                {"(]", false},
                {")(", false},
                {"}{", false},
                {"([[])", false},
                {"([)]", false},
                {"{([)(])}", false},
                {"[(((()))))]", false},
                {"", true},
        });
    }
    private String p1;
    private boolean result;

    public ValidParenthesesTest(String p1, boolean result) {
        this.p1 = p1;
        this.result = result;
    }

    @Test
    public void checkValidness() {
        assertEquals(result, ValidParentheses.checkValidness(p1));
    }
}