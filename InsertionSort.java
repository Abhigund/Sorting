public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12,5,1223,3,223,6,8,2,1};
//using while loop
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j=i-1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

//using for loop
//        for(int i=1; i<arr.length; i++){
//
//            int temp=arr[i];
//            int j = i - 1;
//            for(; j>= 0; j--){
//                if(arr[j] > temp)
//
//                    arr[j+1] = arr[j];
//                else{
//                    break;
//                }
//
//            }
//            arr[j+1] = temp;
//        }


        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
