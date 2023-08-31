package conditional;

import java.util.Scanner;

public class ThreeDigitOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Positive number: ");
        int num = scan.nextInt();
        int temp = num;
        int count = 0;
        while(temp!=0){
            count++;
            temp/=10;
        }
        if(count==3){
            System.out.print("Yes, "+num+" is a three digit number");
        }
        else {
            System.out.print("No, "+num+" is not a three digit number");
        }
    }
}
