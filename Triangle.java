/**
 * 
 * Triangle with 3 sides only which will give you Perimeter........other wise in
 * invalid case will give you zero.........
 * 
 * Triangle
 */
public class Triangle {

    public static void main(String[] args) {
        int total = 0;
        int nums[] = { 1, 2, 1 };
        int a = nums[0] + nums[1];
        System.out.println(a);
        boolean aa = a > nums[2];
        System.out.println(aa);
        int b = nums[1] + nums[2];
        System.out.println(b);
        boolean bb = b > nums[0];
        System.out.println(bb);
        int c = nums[2] + nums[0];
        System.out.println(c);
        boolean cc = c > nums[1];
        System.out.println(cc);
        if (aa && bb && cc) {
            total = nums[0] + nums[1] + nums[2];

        }
        System.out.println(total);
    }
}