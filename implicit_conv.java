import java.lang.ref.Cleaner;

public class implicit_conv {
    public static void main(String[] args) {
        double number1 = 10.1;
        int number2 = (int)number1;
        // the cast operator (int) is used to convert the double value to an int value.
        
        System.out.println(number2);
    }    
}
