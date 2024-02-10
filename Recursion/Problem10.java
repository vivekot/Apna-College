public class Problem10 {
    public static int power(int a, int n){
        if(n==0){
            return 1;
        }
        int pow=power(a, n/2)*power(a, n/2);
        if(n%2!=0){
            pow=a*pow;
        }
        return pow;
    }
    public static void main(String[] args){
        int a=2,n=10;
        
    }
}
