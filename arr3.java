public class arr3 {
    public static void main(String[]args){
        int[] arr={10,50,60,40};
        int max=arr[0];
        for(int num:arr){
            if(num>max) max=num; 

        }
        System.out.println("maximum number is :"+ max);
    }
    
}
