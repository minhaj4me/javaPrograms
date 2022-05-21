package Function;

/**
 * Armstrong
 */
public class Armstrong {
    public static void main(String[] args) {
        int num = 1634;
        int copyNum = num;
        int orginalNum = copyNum;
        int cd = 0;
        while (num != 0) {
            num /= 10;
            cd++;
        }
        int sum = 0;
        while (copyNum != 0) {
            int rem = copyNum % 10;
            sum += (int) Math.pow(rem, cd);
            copyNum /= 10;
        }
        if (sum == orginalNum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}