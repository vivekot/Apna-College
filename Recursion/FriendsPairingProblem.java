public class FriendsPairingProblem {
    public static int pair(int n){
        if(n==1 || n==2){
            return n;
        }
        int singlePair=pair(n-1);
        int duo=pair(n-2);
        int pairWays=(n-1)*duo;
        int totalways=singlePair+pairWays;
        return totalways;
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(pair(n));
    }
}
