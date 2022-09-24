/* String Object's created from String Class is immutable  */
public class StringTest {
    public static void main(String[] args) {
        String s = new String("Minhaj");
        System.out.println(s.concat("Haider")); // here, changes done in new memory and vanished
        System.out.println(s); // no change......
    }
}