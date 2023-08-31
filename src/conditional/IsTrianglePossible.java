package conditional;

import java.util.Scanner;

public class IsTrianglePossible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int sideA = scanner.nextInt();
        System.out.print("Enter side 2: ");
        int sideB = scanner.nextInt();
        System.out.print("Enter side 3: ");
        int sideC = scanner.nextInt();

        if(sideA+sideB>sideC && sideB+sideC>sideA && sideA+sideC>sideB){
            System.out.print("Yes, a triangle can be made by these sides");
        }
        else {
            System.out.print("No, a triangle cannot be made by these sides");
        }
    }
}
