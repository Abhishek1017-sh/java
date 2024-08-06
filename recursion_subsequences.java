import java.util.ArrayList;
// given a string ,write a method to return all the subsequences in a arraylist:-
/*public class recursion_subsequences {
    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans=new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char curr=s.charAt(0);
        ArrayList<String> smallAns=getSSQ(s.substring(1));
        for(String ss:smallAns){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans=getSSQ("abc");
        for(String ss: ans){
            System.out.println(ss);
        }
    }
}*/
//given a string,write a method to print all its subsequences:-
/*
public class recursion_subsequences {
    static void printSSQ(String s,String currAns){
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr=s.charAt(0);
        String remstring=s.substring(1);
        printSSQ(remstring,currAns+curr);
        printSSQ(remstring,currAns);
    }
    public static void main(String[] args) {
        printSSQ("abc","");
    }
}*/
//wap to find sum of all subsets of a integer array:-
/*
public class recursion_subsequences {
    static void subsetSum(int[] a,int idx,int sum){
        if(idx>a.length-1){
            System.out.println(sum);
            return;
        }
        subsetSum(a,idx+1,sum+a[idx]);
        subsetSum(a,idx+1,sum);
    }
    public static void main(String[] args) {
        int[]a={2,3,4};
        subsetSum(a,0,0);
    }
}*/  
