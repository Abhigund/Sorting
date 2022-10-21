public class SelectionSort{

    public static void main(String[] args) {
        int[] arr = {12,5,21,223,6,8,2,1};

        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}