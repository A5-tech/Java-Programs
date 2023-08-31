package conditional;

import java.util.Scanner;

public class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        if (num<0){
            num*=-1;
        }
        System.out.print(num);
    }
}
