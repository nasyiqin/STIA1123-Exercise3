public class Ques7 {

    public static void main(String[] args){

        String text1 = "School of Computing";
        String text2 = "College of Arts and Sciences";
        String text3 = "UUM Sintok";

        //a
        System.out.println("Length of \"School of Computing\" : " + text1.length());             //length string text1
        System.out.println("Length of \"College of Arts and Sciences\" : " + text2.length());    //length string text2
        System.out.println("Length of \"UUM Sintok\" : " + text3.length());                      //length string text3
        System.out.println("Total length: " + (text1.length() + text2.length() + text3.length()));  //total length text123

        //b
        System.out.println("\n" + text2.substring(0,20) + text1.substring(10,19)); //
    }
}
