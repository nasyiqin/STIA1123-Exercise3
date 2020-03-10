import java.util.Scanner;

public class Ques6 {

    public static void main(String[] args){
        //a
        Scanner input = new Scanner(System.in); //instantiate object input class Scanner
        //b
        System.out.print("Value 1: ");
        int x = input.nextInt();                //read 1st input
        System.out.print("Value 2: ");
        int y = input.nextInt();                //read 2nd input
        //c
        System.out.println("Product of " + x + " and " + y + " = " + (Math.multiplyExact(x,y))); //display total product of x y

    }
}
