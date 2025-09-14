import java.util.Scanner;

public class decison {
    public static void main(String[] args) {
        System.out.println("Enter temperature:");
        Scanner sc =  new Scanner(System.in);
        int temp = sc.nextInt();
        if(temp<0) System.out.println("too cold and unsair");
        else System.out.println("suitable for outdoor activities");
        sc.close();
    }
}


