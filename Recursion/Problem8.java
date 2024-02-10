public class Problem8 {
    public static int check(int a[],int i,int key){
        if(i==a.length){
            return -1;
        }
        int isFound=check(a, i+1, key);
        
        if(isFound==-1 && a[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args){
        int a[]={1,2,3,4,3,5};
        System.out.println(check(a, 0, 3));

    }
}
