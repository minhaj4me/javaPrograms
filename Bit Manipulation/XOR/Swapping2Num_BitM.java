import javax.swing.plaf.synth.SynthSpinnerUI;

public class Swapping2Num_BitM {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println("Before Swapping");
        System.out.println("a= " + a + "   " + "b= " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping");
        System.out.println("a= " + a + "   " + "b= " + b);
    }
}
