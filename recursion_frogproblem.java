import java.util.Scanner;
//Frog Problem:-
/*
public class recursion_frogproblem {
    static void frog(int[] arr,int cost,int idx){
        if(idx==arr.length-1){
            System.out.println(cost);
            return;
        }
        if(idx+2<arr.length){
            int a=Math.abs(arr[idx+1]-arr[idx]);
            int b=Math.abs(arr[idx+2]-arr[idx]);
            if(a<b && idx+1<=arr.length){
                cost=cost+a;
                frog(arr,cost,idx+1);
            }
            if(b<=a && idx+2<= arr.length){
                cost=cost+b;
                frog(arr,cost,idx+2);
            }
        }else{
            int a=Math.abs(arr[idx+1]-arr[idx]);
            cost=cost+a;
            frog(arr,cost,idx+1);
        } 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        frog(arr,0,0);
    }
}*/
//frogproblem using min function:-
/*public class recursion_frogproblem {
    static int frog(int[] arr,int cost,int idx){
        if(idx==arr.length-1){
            return 0;
        }
        int op1=Math.abs(arr[idx]-arr[idx+1]) + frog(arr,cost,idx+1);
        if(idx== arr.length-2) return op1;
        int op2=Math.abs(arr[idx]-arr[idx+2]) + frog(arr,cost,idx+2);
        return Math.min(op1,op2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int a=frog(arr, 0, 0);
        System.out.println(a);
    }
}*/
//Q:-  Given a string containing digits from 2-9 inclusive ,
// return all possible letter combinations that the number
// could represent. return the answer in any order:
