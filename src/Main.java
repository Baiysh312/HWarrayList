import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array= new ArrayList<>();
        array.add(12);
        array.add(7);
        array.add(17);
        array.add(9);
        array.add(65);

        Arraylist arraylist= new Arraylist();
        arraylist.addArray(12);
        arraylist.addArray(13);
        arraylist.addArray(5);
        arraylist.addArray(1);

        arraylist.delete(2);

        arraylist.info();
        System.out.println(arraylist.proverka(12));
    }
}