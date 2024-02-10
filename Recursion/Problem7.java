public class Problem7 {
    public static int check(int a[],int i,int key){
        if(i==a.length){
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        return check(a, i+1, key);
    }
    public static void main(String[] args){
        int a[]={1,2,3,3,4,5};
        System.out.println(check(a, 0, 3));
    }
}
