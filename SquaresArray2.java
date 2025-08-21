import java.util.Scanner;
public class SquaresArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] squares = new int[10]; 
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();   
            squares[i] = num * num;   
        }
        System.out.println("Array with squares of the numbers:");
        for (int i = 0; i < squares.length; i++) {
            System.out.print(squares[i] + " ");
        }

        sc.close();
    }
}