public class arr4 {
    public static void main(String[]args){
        int[] arr={1076,1,2};
        int min=arr[0];
        for(int num:arr){
            if(num<min) min=num;
        }
        System.out.println("minimum number is :"+min);
    
    }
    
}
