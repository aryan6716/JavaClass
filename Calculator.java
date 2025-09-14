import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Calculator = sc.nextInt();
        switch(Calculator) {
            case 1: System.out.print(a+b);
            break;
            case 2: System.out.print(a-b);
            break;
            case 3: System.out.print(a*b);
            break;
            case 4: System.out.print(a/b);
            break;
            case 5: System.out.print((float)a%b);
            break;
            default: System.out.print("Invalid calculation");
        }

    sc.close();
    }
    
}
