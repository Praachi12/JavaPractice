import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;




public class StreamsFilterDemo {

    public static void main(String[] args){

        List<Integer> ids= new ArrayList<>();
        ids.add(34);
        ids.add(90);
        ids.add(22);
        ids.add(85);
        System.out.println("List of ids:" + ids);


      List<Integer> newList =ids.stream().filter(i-> i>=50 ).collect(Collectors.toList());

        System.out.println("New list is :"+ newList);

}
    }
