import org.junit.Test;

/**
 * Created by Stefan on 16.03.2017.
 */
public class fibonacciTest {
    @Test
    public void calculatefibonaccifolge() throws Exception {

        int number1 = 1;
        int number2 = 1;

        fibonacci ff = new fibonacci();

        ff.calculatefibonaccifolge(number1,number2);
    }

}