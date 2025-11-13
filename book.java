 import java.util.Stack;
 public class book {
    String title;
    String author;
    double price;
    public book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;

    }
    @Override
    public String toString(){
        return "book[title"+title+",author"+author+",price"+price+"]";


    }
    public static void main(String[] args) {
        Stack <book> s=new Stack<>();
        s.push(new book("the white tiger","aryan adhi",2233));
        s.push(new book("the god","anonymous",0.0));
        System.out.println("lakshmi book stack:"+s);
    }

    
}
