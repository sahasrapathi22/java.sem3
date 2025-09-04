import java.util.Scanner;
public class str3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=sc.nextLine();
        if(str.length()>0){
            char first=str.charAt(0);
            char last=str.charAt(str.length()-1);
            System.out.println("first character:"+ first);
            System.out.println("last character:"+ last);
        }
        else{
            System.out.println("empty string");
        }

        
    }
}
    

