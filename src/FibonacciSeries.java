import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int k= sc.nextInt();
        //int k, a,b;

        System.out.println(a);
        System.out.println(b);
        while(k<50){

            k=a+b;
            System.out.println(k);
            a=b;
            b=k;
        }

    }
}
