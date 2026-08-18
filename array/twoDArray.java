public class twoDArray {
    public static void main(String[] args) {
        int arr[][] = {
            {5,10,},
            {28,18,3,15},
            {7,12,9,}
        };
        for(int row=0; row < arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
