package String;

public class Loops {

    public static void main(String[] args){
        char[] ab={0,1,2};
        char[] bb= {2,1,0};
        int sum;
        for(int i=0;i<ab.length; i++ )
        {
            for(int j =bb.length-1; j>=0;j--)
            {
                sum=+ab[i];
                sum=+bb[j];
                System.out.println(sum);
            }
    }
}
    }