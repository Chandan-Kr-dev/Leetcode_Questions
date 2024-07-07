public class medianOfTwoMergedArray {
    public static double mergedarray(int a[],int b[]){
        int m=a.length;
        int n=b.length;
        int res[]=new int [m+n];
        int i=0,j=0,k=0;
        double median;
        while(i<m && j<n){
            if (a[i]<b[j]) {
                res[k++]=a[i++];
            }else{
                res[k++]=b[j++];
            }
        }
        while(i<m){
            
            res[k++]=a[i];
            i++;
        }
        while(j<n){
            res[k++]=b[j];
            j++;

        }
        for (int l : res) {
            
            System.out.println(l);
        }
        if((m+n)%2==0){
            int idx=(m+n)/2;
            
            median= (double)(res[idx-1]+res[idx])/2;
            
        }else{
            int idx=(m+n)/2;
            System.out.println(idx);
            median=(double)res[idx];

        }
        return median;
    }
    public static void main(String[] args) {
        int a[]={};
        int b[]={2,3};
        double median=mergedarray(a,b);
        System.out.println(median);
    }
}
