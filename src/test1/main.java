package test1;
import java.util.ArrayList;
import java.util.Scanner;
public class main {
    private static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        // write your code here
        String in;
        System.out.println("What number do you want to encrypt? (Must be an Integer)");
        in = scanner.nextLine();
        int number;
        boolean trys = true;
        do{
            try{
                //number = Double.parseDouble(in);
                number = Integer.parseInt(in);
            }
            catch(Exception e){
                System.out.println("Enter a number (Must be an Integer)");
                trys = false;
                in = scanner.nextLine();
            }
        }while (trys);
        number = Integer.parseInt(in);
        System.out.println(number);
    }
}
