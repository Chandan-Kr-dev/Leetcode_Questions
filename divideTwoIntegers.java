
public class divideTwoIntegers {
    static int divide(int d,int a){
        int rem=d-a;
        int quo=1;
        while(rem>a){
            rem-=a;
            quo++;
        }
        return quo;
    }
    public static void main(String[] args) {
        int divi=7;
        int dis=-3;
        int ans=divide(divi, dis);
        System.out.println(ans);

    }
    
}
