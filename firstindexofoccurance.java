import java.util.Scanner;
public class firstindexofoccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int n=sc.nextInt();
        int [] arr =new int [n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();

        }
        System.out.println(" enter your target");
        int t=sc.nextInt();
        System.out.println(firstocc(arr,0,t));
    }
    static int firstocc(int [] arr,int i,int t)
    {
        if(i==arr.length)
            return -1;
        if(arr[i]==t)
            return i;
        return firstocc(arr,i+1,t);

    }
}
