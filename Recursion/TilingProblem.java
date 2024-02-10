public class TilingProblem {
    public static int problem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //vertical choice
        int verticalalChoice=problem(n-1);
        //Horiontal choice
        int horizontalChoice=problem(n-2);

        int totalWays=verticalalChoice+horizontalChoice;
        return totalWays;
    }
    public static void main(String[] args){
        int n=4;
        System.out.println(problem(n));
    }
}
