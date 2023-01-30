import java.util.ArrayList;

public class GenericsExample {

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(44);
        list.add(1);
       System.out.println("Element at position 1:" +list.get(2));
        for(Integer i: list)
            System.out.println(i);

          }
}
