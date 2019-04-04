import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class IsTriangleTrueTest {
    @Parameterized.Parameter
    public int a;
    @Parameterized.Parameter(1)
    public int b;
    @Parameterized.Parameter(2)
    public int c;
    @Parameterized.Parameter(3)
    public boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(
                new Object[]{5, 2, 6, true},
                new Object[]{1, 1, 2, true},
                new Object[]{1, 2, 4, false},
                new Object[]{0, 0, 0, false},
                new Object[]{-2, -3, -4, false}
        );
    }

    @Test
    public void isTriangleTrue() {
        Triangle triangle = new Triangle();
        boolean actual = triangle.isTriangle(a, b, c);
        assertThat(actual).isEqualTo(expected);
    }
}
