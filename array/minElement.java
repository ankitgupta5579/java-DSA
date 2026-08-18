class minElement {
    public static void main(String[] args) {
        int arr[] = {5,10,20,6,28,18,3,15};
        int min = arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Minimum element in array is "+min);

    }
}
