import java.util.Scanner;
public class twoDAcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] =  new int[3][4];
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print("give value for row="+row+" and column="+col+" :");
                arr[row][col] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("2D array elements are: ");
        for(int row=0; row < arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

    }
}
