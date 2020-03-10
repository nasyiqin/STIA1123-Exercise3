import java.util.Random;

public class Ques5 {

    public static void main(String[] args){

        String test = "abc";
        test = test + test;
        System.out.println(test);

        Random random = new Random();
        double d = Math.round ( 2.5 + random.nextInt(1) );
        System.out.println("The value is " + d);
    }
}
