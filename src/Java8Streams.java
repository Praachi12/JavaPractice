import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Streams {
    public static void main(String args[]){

        List<String> studentName= new ArrayList<>();
        studentName.add("Ram");
        studentName.add("Shyam");
        studentName.add("Siya");
        studentName.add("Geeta");

        System.out.println("Elements in list:"+ studentName);
        Stream s= studentName.stream();
       List<String> sortedList =  studentName.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List:"+sortedList);
    }
}
