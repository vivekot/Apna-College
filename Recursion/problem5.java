public class problem5 {
    public static int fibonnaci(int a){
        if(a==0 || a==1){
            return a;
        } 
        int n1=fibonnaci(a-1);
        int n2=fibonnaci(a-2);
        int n=n1+n2;
        return n;
    }
    public static void main(String[] args){
        int a=50;
        System.out.println(fibonnaci(a));
    }
}
