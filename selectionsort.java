import java.util.Scanner;
public class selectionsort {
    static void printarr(int[]arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sortedarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    int temp=min;
                    min=arr[j];
                    arr[j]=temp;
                }
            }
            arr[i]=min;
        }
        printarr(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sortedarr(arr);
    }
}