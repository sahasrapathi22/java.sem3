import java.util.Scanner;
public class str5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word:");
        String str=sc.nextLine();
        String newStr=str.replace('a','o');
        System.out.println("replaced string :"+newStr);
    }
    
}
