package conditional;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter original cost of an item: ");
        float costPrice = scan.nextInt();
        System.out.print("Enter selling price of that item: ");
        float sellPrice = scan.nextInt();

        if(costPrice<sellPrice){
            System.out.print("You made a profit of "+((sellPrice-costPrice)/costPrice*100)+"%");
        }
        else if(costPrice>sellPrice){
            System.out.print("You made a loss of "+((costPrice-sellPrice)/costPrice)*100+"%");
        }
        else {
            System.out.print("Neither you made a profit nor made a loss");
        }
    }
}
