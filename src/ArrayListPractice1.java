import java.util.ArrayList;
public class ArrayListPractice1 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(4);
        array.add(6);
        array.add(0, 2);
        System.out.println(array);
        System.out.println(array.get(2));
        array.set(0, 1);
        System.out.println(array);
        array.remove(0);
        System.out.println(array);
        array.remove(1);
        System.out.println(array);
        array.add(2);
        array.add(5);
        System.out.println(array);

        int total = 0;
        for (int x = 0; x < array.size(); x++)
            total += array.get(x);

        System.out.println(total);

        ArrayList<Student>
    }
}
