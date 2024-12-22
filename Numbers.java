import java.util.Scanner;
class Numbers{
    public static void main(String[] args) {
        System.out.println("Enter 5 Four digits Numbers: ");
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            }

            System.out.println("Numbers are: ");
            for (int i = 0; i < 5; i++) {
                System.out.println(numbers[i]);
                }
    }
}