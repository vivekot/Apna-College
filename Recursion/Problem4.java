public class Problem4 {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int n1=sum(n-1);
        int n2=n+sum(n-1);
        return n2;
    }
    public static void main(String[] args){
        int n=10;
        System.out.println(sum(n));
    }
}
