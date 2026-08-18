public class twoDMax {
    public static void main(String[] args) {
        int arr[][] = {
            {5,10,},
            {28,18,3,15},
            {7,12,9,}
        };
        int max = arr[0][0];
        for(int row=0; row < arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        System.out.println("Max element in this array is "+max);
    }
}
