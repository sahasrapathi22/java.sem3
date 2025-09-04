
import java.util.Scanner;
public class str1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sting:");
        String x=sc.nextLine();
        String upper=x.toUpperCase();
        String lower=x.toLowerCase();
        System.out.println("upper case:"+ upper);
        System.out.println("lower case:"+ lower);

    }
    
}
