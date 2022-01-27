import javax.swing.*;

public class ArraysAndArrayListPractice {

    public static void main(String[] args) {

        String question1 = IO.getString("1.) What is the first letter of the alphabet?\na. A\nb. B\nc. C\nd. D");

        System.out.println("Welcome\n");

        System.out.println("1.) What is the first letter of the alphabet?");
        System.out.println("a. A");
        System.out.println("b. B");
        System.out.println("c. C");
        System.out.println("d. D");
        System.out.println(question1);

        if (question1.equalsIgnoreCase("a")){
            System.out.println("Correct!");
        }
        else
            System.out.println("Incorrect");
    }
}
