import java.util.*;
/*public class recursion {
    static void printIncreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printIncreasing(n);
    }
}*/

/*public class recursion {
    static void printDecreasing(int n){
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printDecreasing(n);
    }
}*/
/*
public class recursion {
    static int printFactorial(int n){
        if (n==0||n==1){
            return n;
        }
        int a=n*printFactorial(n-1);
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=printFactorial(n);
        System.out.println("factorial:"+c);
    }
}*/
/*
public class recursion {
    static int fibonacci(int n){
        if (n==0||n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = fibonacci(n);
        System.out.println(n+"th"+"fibonacci number is:"+c);
    }
}*/
/*public class recursion {
    static int addition(int a){
        if (a==0){
             return 0;
        }
        return addition(a/10)+a%10;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ans=addition(a);
        if (ans>=0){
            System.out.println(ans);
        }else{
            ans=-1*ans;
            System.out.println(ans);
        }

    }
}*/
/*
public class recursion {
    static int power(int p,int q){
        if(q==0){
            return 1;
        }
        return power(p,q-1)*p;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        int ans=power(p,q);
        System.out.println(ans);
    }
}*/
// ALTERNATE:
/*
public class recursion {
    static int power(int p,int q){
        if (q==0){
            return 1;
        }
        int a=power(p,q/2);
        if(q%2==0){
            return a*a;
        }else{
            return a*a*p;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        int ans=power(p,q);
        System.out.println(ans);
    }
}*/
/*
public class recursion {
    static int count(int n){
        if(n>0&&n<=9) return 1;
        return count(n/10)+1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ans=count(n);
        System.out.println(ans);
    }
}*/
/*
public class recursion {
    static void multiples(int n,int k){
        if (k==0){
            return;
        }
        multiples(n,k-1);
        System.out.print(n*k+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        multiples(n,k);
    }
}*/
/*
public class recursion {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return sum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sum(n);
        System.out.println(a);
    }
}*/
/*
public class recursion {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return sum(n-1)-n;
        }else{
            return sum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sum(n);
        System.out.println(a);
    }
}*/
//GCD:
// 1- BRUTE FORCE APPROACH:
/*
public class recursion {
    static void gcd(int x,int y){
        int ans=0;
        if(x<y){
            for(int i=1;i<=x;i++){
                if(x%i==0 && y%i==0){
                    ans=i;
                }
            }
            System.out.println(ans);
            }
        else{
            for(int i=1;i<=y;i++){
                if(x%i==0 && y%i==0){
                    ans=i;
                }
            }
            System.out.println(ans);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        gcd(x,y);
    }
}*/
// 2-Long division method:-
/*
public class recursion {
    static void gcd(int x,int y){
        while(x%y!=0){
            int c=x%y;
            x=y;
            y=c;
        }
        System.out.println(y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        gcd(x,y);
    }
}*/
// 3-EUCLID'S ALGORITHM TO FIND GCD:-
/*
public class recursion {
    static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int ans=gcd(x,y);
        System.out.println(ans);
    }
}*/
//ARRAY:-
/*
public class recursion {
    static void arrayrecursion(int[] arr,int idx){
        if(idx>=arr.length){
            return;
        }
        System.out.print(arr[idx]+" ");
        arrayrecursion(arr,idx+1);
    }
    public static void main(String[] args) {
        int idx=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        arrayrecursion(arr,idx);
    }
}*/
/*
public class recursion {
   static int maxarray(int[] arr,int idx){
      if(idx==arr.length-1){
         return arr[idx];
      }
      return Math.max(arr[idx],maxarray(arr,idx+1));
   }
   public static void main(String[] args) {
      int idx=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter size of array:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("enter array:");
      for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
      }
      int ans=maxarray(arr,idx);
      System.out.println(ans);
   }
}*/
/*public class recursion {
   static int sumarray(int[] arr,int idx){
      if(arr.length==idx){
         return 0;
      }
      return arr[idx]+sumarray(arr,idx+1);
   }
   public static void main(String[] args) {
      int idx=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter size of array:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("enter array:");
      for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
      }
      int ans=sumarray(arr,idx);
      System.out.println(ans);
   }
}*/
