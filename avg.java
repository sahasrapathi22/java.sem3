public class avg {
    public static void main(String[] args) {
        int array[]={2,4,6,8};
        int sum=0;
        for(int num:array){
            sum+=num;
        }
       double average=(double)sum/array.length;
        System.out.println("average of the array:"+average);

        
    }
    
}
