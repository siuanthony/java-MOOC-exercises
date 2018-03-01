
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int numberOne = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());
        
        double division = (double)numberOne/numberTwo;
        
        System.out.print("Division: " + numberOne + " / " + numberTwo + " = " + division);
        
    }
}
