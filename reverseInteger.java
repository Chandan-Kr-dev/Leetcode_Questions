public class reverseInteger {
    public static void main(String[] args) {
        int ans=reverse(1534236469);
        System.out.println(ans);
        
    }
    public static int reverse(int x) {
        
        int rev=0;
        int s=1;
        if(x<0){
            x*=-1;
            s=-1;
        }
        
        while(x>0){
            int a=x%10;
            if(rev>(Integer.MAX_VALUE -a)/10) return 0;
            rev=(rev*10)+a;
            x/=10;
        }
        return s*rev;
    }
}
