public class reverse_array {
    public static void reversearray(int numbers[]) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5 };
        reversearray(numbers);
    }
}