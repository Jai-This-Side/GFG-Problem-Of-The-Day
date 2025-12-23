import java.util.*;

public class countInRange {
    public static ArrayList<Integer> cntInRange(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        Arrays.sort(arr);

        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];

            int left = lowerBound(arr, a);

            int right = upperBound(arr, b);

            result.add(right - left);
        }

        return result;
    }

    private static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
    
    private static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 8, 5};
        int[][] queries = {{1, 4}, {3, 6}, {0, 10}};
        ArrayList<Integer> res = cntInRange(arr, queries);
        for (int count : res) {
            System.out.print(count + " ");
        }
        System.out.println();
    }
}

