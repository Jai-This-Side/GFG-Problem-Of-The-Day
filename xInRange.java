import java.util.*;

class xInRange {
    public static ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int[] q : queries) {
            int l = q[0], r = q[1], x = q[2];
            
            int left = lowerBound(arr, x, l);
            int right = upperBound(arr, x, r) - 1;
            
            if (left <= right) {
                result.add(right - left + 1);
            } else {
                result.add(0);
            }
        }
        return result;
    }
    
    // First index >= x starting from l
    private static int lowerBound(int[] arr, int x, int l) {
        int low = l, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x) low = mid + 1;
            else high = mid;
        }
        return low;
    }
    
    // First index > x up to r
    private static int upperBound(int[] arr, int x, int r) {
        int low = 0, high = r + 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 5, 5, 8};
        int[][] queries = {
            {0, 7, 5},
            {1, 2, 2},
            {0, 3, 7}
        };

        ArrayList<Integer> res = countXInRange(arr, queries);
        for (int count : res)
            System.out.print(count + " ");
        System.out.println();
    }
}
