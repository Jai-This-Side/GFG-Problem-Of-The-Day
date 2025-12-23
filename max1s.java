class max1s {
    public static int rowWithMax1s(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;

        int maxRow = -1;
        int row = 0;
        int col = m - 1;

        while (row < n && col >= 0) {
            if (arr[row][col] == 1) {
                maxRow = row;  
                col--;        
            } else {
                row++;        
            }
        }
        return maxRow;
    }

    public static void main(String[] args)
    {
        int[][] mat = { { 0, 0, 0, 1 },
                        { 0, 1, 1, 1 },
                        { 1, 1, 1, 1 },
                        { 0, 0, 0, 0 } };

        System.out.println("Index of row with maximum 1s is " + rowWithMax1s(mat));
    }
}