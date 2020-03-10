import java.util.Random;

public class Ques4 {

    public static void main(String[] args){

        Random rd = new Random();

        int x = rd.nextInt(100);
        int y = rd.nextInt(100);
        int largNum = Math.max(x,y);

        System.out.println("Number 1: " + x);
        System.out.println("Number 2: " + y);
        System.out.println("Largest value: " + largNum);



    }
}
