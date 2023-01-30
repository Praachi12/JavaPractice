public interface InterfaceTwo extends InterfaceOne {
    default void defaultMethod() {
        System.out.println("From interface two");
    }
}
