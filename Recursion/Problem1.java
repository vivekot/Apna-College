public class Problem1{
    public static void decreasingOrder(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        decreasingOrder(n-1);
    }
    public static void main(String[] args){
        int n=10;
        decreasingOrder(n);
    }
}