public class ReverseNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int left=0;
        int right=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
            
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
