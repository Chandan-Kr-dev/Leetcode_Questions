import java.util.*;
class twoSumProblem{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={2,7,11,15};
        int [] sums=new int[2];
        int target=in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    sums[0]=i;
                    sums[1]=j;
                    break;
                }
                
            }
            
        }
        System.out.println(Arrays.toString(sums));
    }
}