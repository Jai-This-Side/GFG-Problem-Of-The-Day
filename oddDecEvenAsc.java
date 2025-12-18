import java.util.Arrays;
import java.util.Comparator;

class oddDecEvenAsc {

    // Function to sort array as per the condition
    public static void sortIt(Integer[] arr) {

        // Sort using the custom comparator
        Arrays.sort(arr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {

                // When both are even: sort in ascending order
                if (a % 2 == 0 && b % 2 == 0) {
                    return a - b;
                }

                // When both are odd: sort in descending order
                if (a % 2 == 1 && b % 2 == 1) {
                    return b - a;
                }

                // If one is odd and one is even: odd comes first
                return (a % 2 == 1) ? -1 : 1;
            }
        });
    }

    // Driver code
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 5, 4, 7, 10};

        sortIt(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}