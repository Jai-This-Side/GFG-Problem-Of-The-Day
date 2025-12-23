import java.util.*;

class mergeOverlappingIntervals {

    public static ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        int n = arr.length;

        // sort
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1)[1]) {
                ans.add(arr[i]);
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], arr[i][1]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[][] arr = {
            {1, 3},
            {2, 6},
            {8, 10},
            {9, 12}
        };

        ArrayList<int[]> result = mergeOverlappingIntervals.mergeOverlap(arr);

        for (int[] interval : result) {
            System.out.println(interval[0] + " " + interval[1]);
        }

    }

}
