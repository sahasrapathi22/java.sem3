public class nested {
    public static void main(String[] args) {
        int marks=90;
        if(marks>=40){
            System.out.println("you passed the exam:");
            if(marks>=90){
                System.out.println("Grade:A+");
            }
            else if(marks>=75){
                System.out.println("grade:B+");
            }
            else{
                System.out.println("you failed the exam:");
            }
        }
    }
}
