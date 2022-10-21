public class MergeSort {

    static void mergeSort_conquer(int arr[], int si, int mid, int ei){
        // Collecting all sorted elements using array space
        int merged[] = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x=0;
        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }

        for(int i=0, j=si; i<merged.length; i++, j++ ){
            arr[j] = merged[i];
        }

    }
    static void mergeSort_divide(int[] arr, int si, int ei){

        // Dividing list into two halfs
        if(si >= ei){
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort_divide(arr, si, mid);
        mergeSort_divide(arr, mid+1, ei);
        mergeSort_conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        //Driver Code
        int[] arr = {1,12,13,4,5,765,3};
        mergeSort_divide(arr, 0, arr.length-1);
        for(int i: arr){
            System.out.print(i+" ");

        }

    }
}
