import java.util.Scanner;
public class check_increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count=0;
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        for(int i=0;i<n-1;i++) {
            if((arr[i]<arr[i+1]) && arr[i]!=n-1) count++;
        }
        if(count==n-1) System.out.println("1 : yes");
        else System.out.println("0 : no");

    sc.close();
    }
}
