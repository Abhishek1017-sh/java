/*import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>0){
            n=n/10;
            c=c+1;
        }
        System.out.println(c);
    }
}*/
/*
import java.util.Scanner;
public class count{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int s=0;
        int number=n;
        while(n>0){
            int r=n%10;
            s=s+r;
            n=n/10;
        }
        System.out.println("sum"+" "+ s);
    }
}*/
/*import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("reveresed number is : "+rev);
    }
}*/
// series=1-2+3-4+....n
/*import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter range of the sries:");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<n+1;i++){
            if(i%2==0){
                s=s-i;
            }
            else{
                s=s+i;
            }
        }
        System.out.println("sum of the series: "+s);
    }
}*/
/*
import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=1;
        for (int i=1;i<n+1;i++){
            s=s*i;
            System.out.println(s);
        }
    }
}*/
/*import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int p=1;
        for(int i=1;i<=b;i++){
            p=p*a;
        }
        System.out.println(p);
    }
}*/
