/*
public class countsort {
    static int max(int[] arr){
        int m=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        return m;
    }
    static void sortedarr(int[] arr,int a){
        int[] count=new int[a+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        printarr(count);
        for(int i=0;i<count.length-1;i++){
            count[i+1]=count[i]+count[i+1];
        }
        System.out.println();
        System.out.println("prefix sum array of count array:");
        printarr(count);
        ansarray(count,arr.length,arr);
    }
    static void ansarray(int[] count,int n,int[]arr){
        int[] output=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        System.out.println();
        System.out.println("final ans after doing inplace:");
        printarr(output);
    }
    static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={0,1,1,1,1,1,6,7,54,7,7,5};
        int a=max(arr);
        sortedarr(arr,a);
    }
}*/
