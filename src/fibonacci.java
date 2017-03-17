/**
 * Created by Stefan on 10.03.2017.
 */
public class fibonacci {

    public static void main(String[] argv) {

        int number1 = 1;
        int number2 = 1;

        calculatefibonaccifolge(number1,number2);
    }

    public static void calculatefibonaccifolge(int number1,int number2){

        int result = 0;
        //Calculate next fibonacci number
        result = number1 + number2;
        //Change Values
        number1 = number2;
        number2 = result;

        //Testoutput
        System.out.println("Zahl1: "+number1+" Zahl2: "+number2+"\n");

        if(number1 < 10000)
            calculatefibonaccifolge(nuber1,number2);
        else
            System.out.println("Exit");
    }

    /*public class fibonacciTest {
        @Test
        public void calculatefibonaccifolge() throws Exception {

            int number1 = 1;
            int number2 = 1;

            fibonacci ff = new fibonacci();

            ff.calculatefibonaccifolge(number1,number2);
        }

    }*/

}
