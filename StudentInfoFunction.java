import java.util.Scanner;

class StudentInfoFunction {
    
    static void displayStudent(String name, int age, float cgpa, char grade) {
        System.out.println("\n----Student Details----\n");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("CGPA: %.2f\n", cgpa); 
        System.out.println("Grade: " + grade);
        System.out.println("\n---------------------\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter CGPA: ");
        float cgpa = sc.nextFloat();

        System.out.print("Enter grade: ");
        char grade = sc.next().charAt(0);

        displayStudent(name, age, cgpa, grade);

        sc.close();
    }
}


