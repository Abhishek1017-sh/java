import java.util.*;

/*
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter"+n+"elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enetr element to find occurance:");
        int a=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                count++;
            }
        }
        System.out.println("number of occurances of"+a+"are:"+count);
    }
}*/
/*
public class second {
    static int lastoccurance(int[] arr,int a){
        int b=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==a)
                b=i;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        System.out.println("enter elements of array:");
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element to find last occurance:");
        int a= sc.nextInt();
        System.out.println("last occurance of"+a+"is at index:"+lastoccurance(arr,a));
    }
}*/
/*public class second {
    static int greater_occurances(int[] arr,int x){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element x:");
        int x=sc.nextInt();
        System.out.println("number of elements greater than"+x+"are:"+greater_occurances(arr,x));
    }
}*/
/*public class second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        System.out.println("enter elements of array:");
        int[] arr=new int[n];
        for  (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int a=arr[0];
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<a){
                flag++;
                break;
            }
            else{
                a=arr[i];
            }
        }
        if (flag>0){
            System.out.println("not");
        }
        else{
            System.out.println("yes");
        }
    }
}*/
// OR
/*public class second {
    static boolean sort_check(int[]arr){
        boolean flag=true;
        int a=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<a){
                flag=false;
                break;
            }
            else{
                a=arr[i];
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n= sc.nextInt();
        System.out.println("enter"+" "+n+" "+"elements of array:");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array is sorted ?--"+sort_check(arr));
    }
}*/
/*
public class second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        System.out.println("enter elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=arr[0];
        int b=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<a){
                a=arr[i];
            }
            if(arr[i]>b){
                b=arr[i];
            }
        }
        int[] c=new int[2];
        c[0]=a;
        c[1]=b;
        System.out.println("array formed is:"+(Arrays.toString(c)));
    }
}*/
/*
public class second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        System.out.println("enter elements of array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target sum:");
        int s=sc.nextInt();
        int p=0;
        int [] c=new int[2];
        int[] fi=new int[n];
        for(int j=0;j<n;j++) {
            for (int i = j + 1; i < n; i++) {
                if (arr[j] + arr[i] == s) {
                    p++;
                    c[0]=arr[j];
                    c[1]=arr[i];
                    System.out.println(Arrays.toString(c));
                }
            }
        }
        System.out.println("number of pairs:"+p);
    }
}*/
/*public class second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        System.out.println("enter elements of array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target sum:");
        int s=sc.nextInt();
        int p=0;
        int[] c=new int[3];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k =j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==s){
                        p++;
                        c[0]=arr[i];
                        c[1]=arr[j];
                        c[2]=arr[k];
                        System.out.println(Arrays.toString(c));
                    }
                }
            }
        }
        System.out.println("number of triplets:"+p);
    }
}*/
/*public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        System.out.println("enter elements of array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] c=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=-1){
                System.out.println("unique element is:"+arr[i]);
            }
        }

    }
}*/
/*public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        System.out.println("enter elements of array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] c=new int[n];
        int a=0;
        for (int i = 0; i < n; i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    a=arr[j];
                    arr[j]=arr[i];
                    arr[i]=a;
                }
            }
            c[i]=arr[i];
        }
        int lar=c[c.length-1];
        int count=0;
        for(int i=0;i<n;i++){
            if (arr[i]==lar){
                count++;
            }
        }
        int[] fi=new int[n-count];
        for (int i=0;i<n;i++){
            if(c[i]!=lar){
                fi[i]=c[i];            }
        }
        int seclar=fi[fi.length-1];
        System.out.println(seclar);
    }
}*/
/*
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        System.out.println("enter elements of array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a=-1;
        m: for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                if(arr[i]==arr[j]){
                    a=arr[j];
                    break m;
                }
            }
        }
        System.out.println("first repeating element is:"+a);
    }
}*/
/*public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        System.out.println("enter elements of array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    a = arr[j];
                }
            }
        }
        System.out.println("last repeating element is:" + a);
    }
}*/
/*
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        System.out.println("enter elements of array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<a){
                a=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==a){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int b=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<b){
                b=arr[i];
            }
        }
        System.out.println("second smallest element is:"+b);

    }
}*/
/*
public class second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
        System.out.println("enter b:");
        int b=sc.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("swaped a:"+a+" "+"swaped b:"+b);
    }
}*/
/*
public  class second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
        System.out.println("enter b:");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
}*/
/*
public class second {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        System.out.println("enter the array;");
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] revarr=new int[n];
        int k=0;
        for(int i=n-1;i>=0;i--){
            revarr[k]=arr[i];
            k++;
        }
        System.out.println(Arrays.toString(revarr));
    }
}*/
/*
public class second {
    static int[] revarr(int[] arr){
        int i=0, j=arr.length-1;
        while (i < j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        System.out.println("enter the array;");
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(revarr(arr)));
    }
}*/
/*public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        System.out.println("enter the array;");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter number of rotations:");
        int k=sc.nextInt();
        k=k%n;
        int d=0;
        int[] rotatedarr=new int[n];
        for(int i=n-k;i<n;i++){
            rotatedarr[d]=arr[i];
            d++;
        }
        int s=k;
        for(int i=0;i<n-k;i++){
            rotatedarr[s]=arr[i];
            s++;
        }
        System.out.println(Arrays.toString(rotatedarr));
    }
}*/
/*
public class second {
    static int[] reverse(int[] arr, int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        System.out.println("enter the array;");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter number of rotations:");
        int k=sc.nextInt();
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}*/

// FREQUENCY ARRAY CONCEPT:-

/*
public class second {
    static int[] makefrequencyarray(int[] arr){
        int[] freq=new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        System.out.println("enter the array;");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq= makefrequencyarray(arr);
        System.out.println("enter number of queries:" );
        int q=sc.nextInt();
        while(q>0){
            System.out.println("enter number:");
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
            q--;
        }
    }
}*/

//sorting a array containing only 0s and 1s:--(my way of doing is by sorting as simple simple sorting we do)

/*
public  class second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        System.out.println("enter the array;");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] c=new int[n];
        int a=0;
        for (int i = 0; i < n; i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    a=arr[j];
                    arr[j]=arr[i];
                    arr[i]=a;
                }
            }
            c[i]=arr[i];
        }
        System.out.println(Arrays.toString(c));
    }
} */

//other way of doing is count number of zeros and inplace in the same array:-

/*public  class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        System.out.println("enter the array;");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                a++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<a){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
        System.out.println("sorted array containing only 0s and 1s:"+Arrays.toString(arr));
    }
}*/

// other way of doing is in one traversal of array only:--

/*public  class second {
    static void sortzeroesandones(int[] arr){
        int n =arr.length;
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        System.out.println("enter the array;");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortzeroesandones(arr);
        System.out.println(Arrays.toString(arr));
    }
}*/
/*
public  class second {
    static void arrangedarray(int[] arr){
        int n=arr.length;
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                swapcase(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }
    }
    static void swapcase(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        System.out.println("enter the array;");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arrangedarray(arr);
        System.out.println(Arrays.toString(arr));
    }
}*/
/*
public  class second {
    static void nondecarr(int[] ans){
        int n=ans.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=ans[i];
                ans[i]=ans[j];
                ans[j]=temp;
            }
        }
    }
    static int[] sortsqaures(int[] arr){
        int n= arr.length;
        int left=0,right=n-1;
        int[] ans=new int[n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k]=arr[left] * arr[left];
                k++;
                left++;
            }else{
                ans[k]=arr[right] * arr[right];
                k++;
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        System.out.println("enter the array;");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans=sortsqaures(arr);
        nondecarr(ans);
        System.out.println(Arrays.toString(ans));
    }
}*/

// prefix sum method:-

/*
public class second {
    static void prefsum(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            arr[i]=sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        System.out.println("enter the array;");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        prefsum(arr);
        System.out.println(Arrays.toString(arr));

    }
}*/
/*public class second {
    static void prefsum(int[] arr){
        int sum=0;
        for (int i=1;i<arr.length;i++){
            sum=sum+arr[i];
            arr[i]=sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        System.out.println("enter the array;");
        int[] arr = new int[n+1];
        for (int i =1; i <=n; i++) {
            arr[i] = sc.nextInt();
        }
        prefsum(arr);
        System.out.println("enter number of queries:");
        int q=sc.nextInt();
        while (q>0){
            System.out.println("enter start:");
            int s=sc.nextInt();
            System.out.println("enter end:");
            int e=sc.nextInt();
            System.out.println(arr[e]-arr[s-1]);
            q--;
        }

    }
}*/
/*public class second {
    static int[] prefsum(int[] arr){
        int[] prearr=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            prearr[i]=sum;
        }
        return prearr;
    }
    static int[] sufsum(int[] arr){
        int[] sufarr=new int[arr.length];
        int sum=0;
        for (int i=arr.length-1;i>=0;i--){
            sum=sum+arr[i];
            sufarr[i]=sum;
        }
        return sufarr;
    }
    static void ans(int[] prearr,int[] sufarr){
        String flag="False";
        int start1=0;
        int start2=0;
        int end1=0;
        int end2=sufarr.length-1;
        for(int i=0;i<prearr.length-1;i++){
                if (prearr[i]==sufarr[i+1]){
                    flag="True";
                    end1=i;
                    start2=i+1;
                }
        }
        System.out.println(flag+" "+"("+start1+":"+end1+" , "+start2+":"+end2+")");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        System.out.println("enter the array;");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prearr=prefsum(arr);
        int[] sufarr=sufsum(arr);
        ans(prearr,sufarr);
    }
}*/

//OR

/*public class second {
    static void ans(int[] arr){
        String flag="Flase";
        int tsum=0;
        for(int i=0;i<arr.length;i++){
            tsum=tsum+arr[i];
        }
        int sum=0;
        int start1=0;
        int start2=0;
        int end1=0;
        int end2=arr.length-1;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum==tsum-sum){
                flag="True";
                end1=i;
                start2=i+1;
            }
        }
        System.out.println(flag+" "+"indexes ->"+"("+start1+":"+end1+","+start2+":"+end2+")");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        System.out.println("enter the array;");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ans(arr);
    }
}*/

// 2-D Array:-

/*
public class second {
    static void add(int[][] a,int r1,int c1,int[][] b,int r2, int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("wrong dimensions");
        }
        else{
            int[][] c=new int[r1][c1];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
            System.out.println(Arrays.deepToString(c));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r1:");
        int r1=sc.nextInt();
        System.out.println("enter c1:");
        int c1=sc.nextInt();
        System.out.println("enter elements of array 1:");
        int[][] a=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter r2:");
        int r2=sc.nextInt();
        System.out.println("enter c2:");
        int c2=sc.nextInt();
        System.out.println("enter elements of array 2:");
        int[][] b=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        add(a,r1,c1,b,r2,c2);
    }
}*/
/*public class second {
    static void multiply(int[][] a,int r1,int c1,int[][] b,int r2, int c2) {
        if (c1 != r2) {
            System.out.println("wrong dimensions");
        } else {
            int[][] c = new int[r1][c2];
            int sum=0;
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for(int k=0;k<c1;k++){
                        c[i][j] = c[i][j]+(a[i][k] * b[k][j]);
                    }
                }
            }
            System.out.println(Arrays.deepToString(c));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r1:");
        int r1=sc.nextInt();
        System.out.println("enter c1:");
        int c1=sc.nextInt();
        System.out.println("enter elements of array 1:");
        int[][] a=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter r2:");
        int r2=sc.nextInt();
        System.out.println("enter c2:");
        int c2=sc.nextInt();
        System.out.println("enter elements of array 2:");
        int[][] b=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        multiply(a,r1,c1,b,r2,c2);
    }
}*/
/*public class second {
    static void transpose(int[][] a, int r1,int c1){
        int[][] ans=new int[c1][r1];
        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < r1; j++) {
                ans[i][j]=a[j][i];
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter r1:");
        int r1 = sc.nextInt();
        System.out.println("enter c1:");
        int c1 = sc.nextInt();
        System.out.println("enter elements of array 1:");
        int[][] a = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        transpose(a,r1,c1);
    }
} */
/*
public class second {
    static void transpose(int[][] a,int r1,int c1){
        for (int i = 0; i < r1; i++) {
            for (int j = i; j < c1; j++) {
                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter r1:");
        int r1 = sc.nextInt();
        System.out.println("enter c1:");
        int c1 = sc.nextInt();
        System.out.println("enter elements of array 1:");
        int[][] a = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        transpose(a,r1,c1);
    }
}*/
/*
public class second {
    static void reverse(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void turn(int[][] a,int r1,int c1){
        for (int i = 0; i < r1; i++) {
            for (int j = i; j < c1; j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for(int i=0;i<r1;i++){
             reverse(a[i]);
        }
        System.out.println(Arrays.deepToString(a));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter r1:");
        int r1 = sc.nextInt();
        System.out.println("enter c1:");
        int c1 = sc.nextInt();
        System.out.println("enter elements of array 1:");
        int[][] a = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        turn(a,r1,c1);
    }
}*/
/*
public class second {
    static int[][]  pascal(int n){
        int[][] ans=new int[n][];
        for(int i=0;i<n;i++){
            ans[i]=new int[i+1];
            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter n:");
          int n=sc.nextInt();
          int[][] ans=pascal(n);
          System.out.println(Arrays.deepToString(ans));
    }
}*/
/*public class second {
    static void spiralmatrix(int[][] matrix,int r,int c){
        int toprow=0,bottomrow=r-1,leftcol=0,rightcol=c-1;
        int totalelements=0;
        while(totalelements<r*c){
            for(int j=leftcol;j<=rightcol && totalelements<r*c;j++){
                System.out.println(matrix[toprow][j]+" ");
                totalelements++;
            }
            toprow++;
            for(int i=toprow;i<=bottomrow && totalelements<r*c;i++){
                System.out.println(matrix[i][rightcol]+" ");
                totalelements++;
            }
            rightcol--;
            for(int j=rightcol;j>=leftcol && totalelements<r*c;j--){
                System.out.println(matrix[bottomrow][j]+" ");
                totalelements++;
            }
            bottomrow--;
            for(int i=bottomrow;i>=toprow && totalelements<r*c;i--){
                System.out.println(matrix[i][leftcol]+" ");
                totalelements++;
            }
            leftcol++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter r1:");
        int r = sc.nextInt();
        System.out.println("enter c1:");
        int c = sc.nextInt();
        System.out.println("enter elements of array 1:");
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        spiralmatrix(a,r,c);
    }
}*/
/*
public class second {
    static void printarray(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] spiralorder(int r,int c){
        int toprow=0,bottomrow=r-1,leftcol=0,rightcol=c-1;
        int totalelements=0;
        int num=1;
        int[][] a=new int[r][c];
        while(totalelements<r*c){
            for(int j=leftcol;j<=rightcol && totalelements<r*c;j++){
                a[toprow][j]=num;
                totalelements++;
                num++;
            }
            toprow++;
            for(int i=toprow;i<=bottomrow && totalelements<r*c;i++){
                a[i][rightcol]=num;
                totalelements++;
                num++;
            }
            rightcol--;
            for(int j=rightcol;j>=leftcol && totalelements<r*c;j--){
                a[bottomrow][j]=num;
                totalelements++;
                num++;
            }
            bottomrow--;
            for(int i=bottomrow;i>=toprow && totalelements<r*c;i--){
                a[i][leftcol]=num;
                totalelements++;
                num++;
            }
            leftcol++;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        int[][] a=spiralorder(n,n);
        printarray(a);

    }
}*/
/*public class second {
    static void sumarray(int[][] a, int l1,int l2,int r1,int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum=sum+a[i][j];
            }
        }
        System.out.println("enter sum of selected rectangular part:"+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter r:");
        int r = sc.nextInt();
        System.out.println("enter c :");
        int c = sc.nextInt();
        System.out.println("enter elements of array 1:");
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter coordinates 1:");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        System.out.println("enter coordinates 2:");
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        sumarray(a,l1,l2,r1,r2);
    }
}*/
// Method-2: pre calculating the horizontal sum of each row in the matrix:

/*public class second {
    static void sumarray(int[][] a,int l1,int l2,int r1,int r2){
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[i].length;j++){
                sum=sum+a[i][j];
                a[i][j]=sum;
            }
        }
        int required_sum=0;
        for(int i=l1;i<=l2;i++){
            if(r1>=1){
                required_sum=(a[i][r2]-a[i][r1-1])+required_sum;
            }
            else{
                required_sum=a[i][r2]+required_sum;
            }
        }
        System.out.println(required_sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter r:");
        int r = sc.nextInt();
        System.out.println("enter c :");
        int c = sc.nextInt();
        System.out.println("enter elements of array 1:");
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter coordinates 1:");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        System.out.println("enter coordinates 2:");
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        sumarray(a,l1,l2,r1,r2);
    }
}*/
// PREFIX SUM OVER COLUMNS AND ROWS BOTH:-

/*public class second {
    static void sumarray(int[][] a, int l1, int l2, int r1, int r2, int c) {
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
                a[i][j] = sum;
            }
        }
        for (int i = 0; i < c; i++) {
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum = sum + a[j][i];
                a[j][i] = sum;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        if (l1 >= 1 && r1 >= 1) {
            int sum = (a[l2][r2] - a[l1 - 1][r2] + a[l1 - 1][r1 - 1] - a[l2][r1 - 1]);
            System.out.println("sum of rectangle formed by given coordinates is:" + sum);
        } else if (l1 > 0 && r1 == 0) {
            int sum = (a[l2][r2] - a[l1 - 1][r2]);
            System.out.println("sum of rectangle formed by given coordinates is:" + sum);
        } else if (l1 == 0 && r1 > 0) {
            int sum = (a[l2][r2] - a[l2][r1 - 1]);
            System.out.println("sum of rectangle formed by given coordinates is:" + sum);
        } else {
            int sum = a[l2][r2];
            System.out.println("sum of rectangle formed by given coordinates is:" + sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter r:");
        int r = sc.nextInt();
        System.out.println("enter c :");
        int c = sc.nextInt();
        System.out.println("enter elements of array 1:");
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter coordinates 1:");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        System.out.println("enter coordinates 2:");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        sumarray(a, l1, l2, r1, r2, c);
    }
}*/
/*public class second {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter ");
    }
}*/
