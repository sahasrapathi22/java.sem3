public class arr5 {
    public static void main(String[]args){
        int[] arr={10,20,30,39};
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        System.out.println("after swapping:");
        for(int num:arr){
            System.out.println(num+" ");
        }

    }
    
}
