import java.util.Arrays;

class busConductor{
    public static int findMoves(int[] chairs, int[] passengers){
        Arrays.sort(chairs);
        Arrays.sort(passengers);

        int ans = 0;
        int n = chairs.length;

        for(int i = 0; i < n; i++){
            ans += Math.abs(passengers[i] - chairs[i]);
        }
        return ans;
    }

    public static void main(String[] args){
        int[] chairs = {3, 1, 5};
        int[] passengers = {2, 7, 4};

        System.out.print(findMoves(chairs, passengers));
    }
}