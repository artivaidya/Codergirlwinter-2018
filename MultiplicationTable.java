import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int size;
        System.out.println("Welcome to Multiplication table");
        System.out.println("How Large would you like to see them?");
        size = Keyboard.nextInt();
        while (size > 20 || size < 1) {
            System.out.println("Please enter a number betwen 1-20.");
            size = Keyboard.nextInt();
        }
            for (int row = 0; row <= size; row++) {
                for (int col = 0; col <= size; col++) {
                    System.out.println(row + "*" + col + "=" + (row * col));
                }

            }
        }

    }