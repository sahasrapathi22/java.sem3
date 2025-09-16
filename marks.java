public class marks {
    public static void main(String[] args) {
        int marks =32;
        String grade=(marks>=90)?"A":
                     (marks>=75)?"B":
                     (marks>=40)?"P":"F";
        System.out.println("Grade:"+grade);

    }
    
}
