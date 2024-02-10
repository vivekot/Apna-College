public class Problem2 {
    public static void IncreasingOrder(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        IncreasingOrder(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        int n=10;
        IncreasingOrder(n);
    }
}
