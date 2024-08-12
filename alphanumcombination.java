import java.util.Scanner;

//Q:-  Given a string containing digits from 2-9 inclusive ,
// return all possible letter combinations that the number
// could represent. return the answer in any order:
/*public interface alphanumcombination {
    static void combination(String dig,String[]kp,String res){
        if(dig.length()==0){
            System.out.print(res+" ");
            return;
        }
        int currNum=dig.charAt(0)-'0';
        String currChoices=kp[currNum];
        for(int i=0;i<currChoices.length();i++){
            combination(dig.substring(1),kp,res+currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String [] kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(a,kp,"");
    }
} */
