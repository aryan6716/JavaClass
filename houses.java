import java.util.Scanner;
public class houses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of houses: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count=0;

        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        for(int i=0;i<n;i++) if(arr[i]%3==0) count++;

        System.out.println("total count: "+count);

sc.close();
    }
}
