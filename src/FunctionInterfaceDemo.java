import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterfaceDemo {

    public static void main(String args[]){
        //Predicate
        Predicate<String> str= s-> s.length() >=5;
        System.out.println("Length of the string is greater than 5:"+ str.test("JavaPractice"));

        //Function
        Function<Integer, Integer> sqr = i -> i * i;
        System.out.println("Square is:"+ sqr.apply(2));


    }
}
