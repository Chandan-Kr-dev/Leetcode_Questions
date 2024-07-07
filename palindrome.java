public class palindrome {
    public static int pali(int x){
        int rev=0;
        while(x>0){
            int a=x%10;
            rev=(rev*10)+a;
            x/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(pali(-23));
    }
}
