public class SomeJavaClass {
    public int someField = 0;

    public static void main(String[] args) {
        System.out.println("Running java class");
        System.out.println("Printing java expression");
        System.out.println(new SomeJavaClass().someField);
        System.out.println("Printing scala expression");
        System.out.println(new SomeScalaClass());
    }
}
