public class MaxOnesInArray {
    public static void main(String[] args) {
        int[] arr={0,1,1,1,0,1,1,1,1,1,0,0};
        int count=0;
        int max_count=0;
        for(int n : arr){
            if(n==1){
                count++;
            }else{
                max_count=Math.max(count,max_count);
                count=0;
            }       
        }

        System.out.println(max_count);
    }
}
