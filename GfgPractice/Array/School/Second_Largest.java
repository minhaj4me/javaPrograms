public class Second_Largest {

    int print2largest(int arr[], int n) {
        // code here
        int firstElement = -1;
        int secondElement = -1;

        if (n == 0 || n == 1)
            return -1;

        int i = 0;
        while (i < n) {
            if (arr[i] > firstElement) {
                secondElement = firstElement;
                firstElement = arr[i];
            } else {
                if (arr[i] > secondElement && arr[i] != firstElement) {
                    secondElement = arr[i];
                }

            }
            i++;
        }
        return secondElement;
        // Arrays.sort(arr);
        // return arr[arr.length-2];

    }
}
