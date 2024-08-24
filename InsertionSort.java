/*
public class InsertionSort {
    static void printarr(int[]arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void sortedarr(int[] arr){
       for(int i=1;i<arr.length;i++){
           for(int j=0;j<i;j++){
               if(arr[j]>arr[i]){
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }
        printarr(arr);
    }
    public static void main(String[] args) {
        int[] arr={8,3,6,2,4,5};
        sortedarr(arr);
    }
} */
//OR:
/*
public class InsertionSort {
    static void printarr(int[]arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void sortedarr(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        printarr(arr);
    }
    public static void main(String[] args) {
        int[] arr={8,3,6,2,4,5};
        sortedarr(arr);
    }
}*/
