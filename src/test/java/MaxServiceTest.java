import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {
    @Test
    public void shouldFindMax() {

        MaxService service = new MaxService();

        int a = 3;
        int b = 5;

        int expected = 5;
        int actual = service.max(a, b);

        Assertions.assertEquals(expected, actual);
    }
}
