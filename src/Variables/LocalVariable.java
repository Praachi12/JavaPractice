package Variables;
/* Local variables are declared in methods, constructors, or blocks.
   Access modifiers cannot be used for local variables.
   Local variables are visible only within the declared method, constructor, or block.
   There is no default value for local variables, so local variables should be declared
   and an initial value should be assigned before the first use.
*/

public class LocalVariable {
    public void age()
    {
        int age =25;
        //If you don't initialize variable you will get a compile time error
        age = age+2;
        System.out.println("Person age after 2 years :  " + age);
    }

    public static void main(String[] args)
    {
        LocalVariable person= new LocalVariable();
        person.age();
    }
}
