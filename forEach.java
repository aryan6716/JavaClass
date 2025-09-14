import java.util.Scanner;;

public class forEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int arr[] = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            System.out.print(num + " ");

        }

        sc.close();
    }
}
