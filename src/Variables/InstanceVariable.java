package Variables;
/* Instance variables are declared in a class, but outside a method,
   constructor or any block.
   Access modifiers can be given for instance variables.
   The instance variables are visible for all methods,
   constructors and block in the class.
   Instance variables have default values. For numbers, the default value is 0, for Booleans it is false, and for object references it is null.
   Values can be assigned during the declaration or within the constructor.
 */

public class InstanceVariable {
    private int age;
    public String name;

    public static double interestRate =0.5 ;//Static variable or class variable
   public InstanceVariable( int age)
    {
        this.age = age;
    }
    public InstanceVariable(String name, int age)
    {
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args)
    {
        InstanceVariable person= new InstanceVariable(25);

        System.out.println(person.age);
        System.out.println(person.name);
      //  InstanceVariable.age= 30; age is not a static variable
        System.out.println("Interest rate is : " + InstanceVariable.interestRate);
       // person.interestRate;
    }
}
