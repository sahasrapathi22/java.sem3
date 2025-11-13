public class returnExample {
    public static void main(String[] args) {
        System.out.println("start of the program:");
        checkNumber(5);
        System.out.println("end of the program");
    }
    public static void checkNumber(int num){
        if(num<0){
            System.out.println("negative numebr");
            return;
        }
        System.out.println("positive number or zero");
    }
}
