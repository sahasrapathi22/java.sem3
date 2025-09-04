import java.util.Scanner;
public class str4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word:");
        String str=sc.nextLine();
        String rev=new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(rev))
        {
            System.out.println(str+"it is a palindrome");
        }
        else{
            System.out.println(str+"it is not a palindrome");
        }
        
    }
}
    

