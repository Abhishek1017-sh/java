/*public class countsort {
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
        for(int i=0;i<a+1;i++) {
            int c=0;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    c++;
                }
            }
            count[i]=c;
        }
        ansarray(count,arr.length,arr);
    }
    static void ansarray(int[] count,int n,int[]arr){
        int k=0;
        for(int i=0;i< count.length;i++){
            while(count[i]!=0){
                arr[k]=i;
                k++;
                count[i]--;
            }
        }
        printarr(arr);
    }
    static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={4,3,1,5,3,1,3,5};
        int a=max(arr);
        sortedarr(arr,a);
    }
}*/
