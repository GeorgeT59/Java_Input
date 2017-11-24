package java_practice;

//Needed to use the Scanner class.
import java.util.*;

public class Java_Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Making the object 'input' of the Scanner class - 'input' name is ARBITURARY.
        Scanner input = new Scanner(System.in);
        
        //This is the 'cout' equivalant for Java.
        System.out.println("Please enter a number. ");
        
        //This is the 'cin' equivalent for Java.
        int num = input.nextInt();
        
        int numTwo = input.nextInt();
        
        //Another message.
        System.out.print("The sum you typed is ");
        
        //This will print the variable that the user typed.
        System.out.println(num + numTwo);
    }
    
}
