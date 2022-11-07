import java.util.ArrayList;

/**
 * AL_1
 */
public class AL_1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(30);
        list.add(20);
        System.out.println();
        System.out.print(list + " ");
        System.out.println();
        System.out.println("Before Adding List Size- " + list.size());
        list.add(1, 50);
        System.out.println("After Adding List Size- " + list.size());
        for (int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
        // Returns true if element is Present
        System.out.println(list.contains(50));
        // Upadate element at index 3
        System.out.println(list.set(3, 70));
        System.out.println(list);
        // Return index of first occurence of 20
        System.out.println(list.indexOf(20));
        // Get the element at index 4
        System.out.println(list.get(4));
        // Return true if list is empty
        System.out.println(list.isEmpty());
        // Return index of last occurence of 20
        System.out.println(list.lastIndexOf(20));
        // Return and remove thr element at index 2
        System.out.println(list.remove(2));
        System.out.print(list + " ");
        System.out.println();
        // Clear the list
        list.clear();
        System.out.print(list + " ");
    }
}