/*public class quicksort {
    static void swap(int[] arr,int st,int pi){
        int temp=arr[st];
        arr[st]=arr[pi];
        arr[pi]=temp;
    }
    static void arrange(int[] arr,int i,int j,int pivot){
        while(i<j){
            if(arr[i]>pivot && arr[j]<pivot){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j--;
            }
            if(arr[i]<=pivot){
                i++;
            }
            if(arr[j]>=pivot){
                j--;
            }
        }
    }
    static void partition(int[] arr,int st,int end){
        if(st>=end){
            return;
        }
        int pivot=arr[st];
        int ele_less_than_pivot=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivot){
                ele_less_than_pivot++;
            }
        }
        int pivot_index=st+ele_less_than_pivot;
        swap(arr,st,pivot_index);
        arrange(arr,st,end,pivot);
        partition(arr,st,pivot_index-1);
        partition(arr,pivot_index+1,end);
    }
    public static void main(String[] args) {
        int[] arr={-1,5,98,-5,3,3,3};
        partition(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/
// few changes:
/*public class quicksort {
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition(int[] arr,int st,int end){
        int pivot=arr[st];
        int cnt=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivot) cnt++;
        }
        int pivotIdx=st+cnt;
        swap(arr,st,pivotIdx);
        int i=st,j=end;
        while(i<pivotIdx && j>pivotIdx){
            while (arr[i]<=pivot) i++;
            while (arr[j]>pivot) j--;
            if(i<pivotIdx && j>pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quicksort(int[] arr,int st,int end){
        if(st>=end) return;
        int pi=partition(arr,st,end);
        quicksort(arr, st, pi-1);
        quicksort(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int[] arr={-1,5,98,-5,3,3,3};
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/
