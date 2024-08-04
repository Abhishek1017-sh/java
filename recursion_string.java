import java.util.Scanner;

//remove occurence of 'a' from given string:-
/*public class recursion_string {
    static String occurences(String s,int idx){
        if(idx>=s.length()){
            return "";
        }
        String smallAns=occurences(s,idx+1);
        if(s.charAt(idx)!='a'){
            return s.charAt(idx)+smallAns;
        }
        else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans=occurences(s,0);
        System.out.println(ans);
    }
}*/
//remove occurence of 'a' from given string using sub-string method:-
/*
public class recursion_string {
    static String occurences(String s) {
        if (s.length() == 0) {
            return "";
        }
        String smallAns = occurences(s.substring(1));
        if(s.charAt(0)!='a'){
            return s.charAt(0)+smallAns;
        }
        else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans=occurences(s);
        System.out.println(ans);
    }
}*/
// wap to print reverse of a string using rescursion:-
/*
public class recursion_string {
    static String reverse(String s,int idx){
        //1:-
//        if (idx-1<0) {
//            return "";
//        }
//        return s.charAt(idx-1)+reverse(s,idx-1);
        //2:-
//        if(s==""){
//            return "";
//        }
//        return reverse(s.substring(1),idx)+s.charAt(idx);
        //3-
        if(idx==s.length()){
            return "";
        }
        return reverse(s,idx+1)+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans=reverse(s,*//*s.length()*//*0);
        System.out.println(ans);
    }
}*/
//wap to check given string is palindrome or not:-
/*
public class recursion_string {
    static String palindrome(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        return palindrome(s,idx+1)+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(palindrome(s,0).equals(s)){
            System.out.printf("%s is palindrome",s);
        }else{
            System.out.printf("%s is not palindrome",s);
        }
    }
}*/
//Palindrome Method 2: (using pointers in recursion)
/*public class recursion_string {
    static boolean palindrome(String s,int idx,int lastIdx){
        if(idx>=lastIdx) return true;
        return s.charAt(idx) == s.charAt(lastIdx) && palindrome(s, idx + 1, lastIdx - 1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(palindrome(s,0,s.length()-1)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}*/
//wap to know whether the number is palindrome or not:-
/*
public class recursion_string {
    static int palindrome(int a,int n){
        if(a==0){
            return n;
        }
        n=(n*10)+(a%10);
        return palindrome(a/10,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(palindrome(a,0)==a){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}*/
