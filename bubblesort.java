import java.util.Scanner;
public class bubblesort {
     static void printarr(int[]arr){
          for(int i=0;i< arr.length;i++){
               System.out.print(arr[i]+" ");
          }
     }
     static void sortedarr(int[] arr,int idx){
          boolean flag=false;
          for(int i=0;i<arr.length-1;i++){
               for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                         int temp=arr[j];
                         arr[j]=arr[j+1];
                         arr[j+1]=temp;
                         flag=true;
                    }
               }
               if(flag==false){
                    printarr(arr);
                    return;
               }
          }
          printarr(arr);
     }
     public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
          System.out.println("enter size of array");
          int n=sc.nextInt();
          int[] arr=new int[n];
          System.out.println("enter elements of array:");
          for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
          }
          sortedarr(arr,0);
     }
}
