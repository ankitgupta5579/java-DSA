public class maxElement {
    public static void main(String[] args) {
        int arr[] = {5,10,20,6,28,18,3,15};
        int max = arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array is "+max);
    }
}