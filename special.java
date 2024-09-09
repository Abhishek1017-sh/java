import java.util.Scanner;
//armstrong:
/*public class special {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int backup=n;
        while(n!=0){
            c++;
            n=n/10;
        }
        int armstrong=0;
        n=backup;
        while(n!=0){
            int rem=n%10;
            armstrong= (int) (armstrong+Math.pow(rem,c));
            n=n/10;
        }
        n=backup;
        if(armstrong==n){
            System.out.println("yes number is armstrong");
        }else{
            System.out.println("no");
        }
    }
}*/
//fibonacci sereies nth number:
/*
public class special {
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
// print fibonacci series:
/*public class special {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }
    }
}*/
//factorial:
/*
public class special {
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
