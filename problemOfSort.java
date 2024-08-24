//q1-given an integer array arr,move all 0's to the end of it while
// maintaining the relative order of the non zero elements.
/*
public class problemOfSort {
    static void printarr(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void sortedarr(int[] arr){
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
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
        int[] arr={0,5,0,3,42};
        sortedarr(arr);
    }
}*/
//q2-given an array of names of the fruits; your are supposed to sort
//it in lexicographical order using the selection sort.
/*
public class problemOfSort {
    static void sortedarr(String[] arr){
        for(int i=0;i< arr.length-1;i++){
            int min_index=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j].compareTo(arr[min_index])<0){
                    min_index=j;
                }
            }
            String temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        String[] arr={"papaya","lime","watermelon","apple","mango","kiwi"};
        sortedarr(arr);
        for(String val:arr){
            System.out.print(val+" ");
        }
    }
}*/
