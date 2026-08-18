public class twoDSum {
    public static void main(String[] args) {
        int arr[][] = {
            {5,10,},
            {28,18,3,15},
            {7,12,9,}
        };
        int sum = 0;
        for(int row=0; row < arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                sum += arr[row][col];
            }
        }
        System.out.println("Sum of the 2D array elements are: "+sum);
    }
}
