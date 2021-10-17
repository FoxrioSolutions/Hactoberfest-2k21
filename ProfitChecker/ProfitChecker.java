package ProfitChecker;
import java.util.Scanner;

public class ProfitChecker {
    public static void main(String args[]) {

        Scanner profitScanner = new Scanner(System.in);

        double discount;
        double sellingPrice;
        double buyingPrice;
        double profit = 0;
        int marketingChoice;
        double discountPrice = 0;

        System.out.print("Enter the item selling price : ");
        sellingPrice = profitScanner.nextDouble();
        System.out.print("Enter the item buying price : ");
        buyingPrice = profitScanner.nextDouble();
        System.out.println("If you hope to add a discount to the item, press 1");
        System.out.println("else, press 2");
        System.out.print("Enter your marketing choice : ");
        marketingChoice = profitScanner.nextInt();

        if(marketingChoice == 1){
            System.out.print("Enter the discount price (as persentage): ");
            discount = profitScanner.nextDouble();
            discountPrice = sellingPrice * discount/100;
            profit = sellingPrice - (buyingPrice + discountPrice);
            System.out.println("Discount price of item : "+ discountPrice);
        }
        else if(marketingChoice == 2){
            profit = sellingPrice - buyingPrice;
        }
        else System.exit(0);

        if(profit < 0){
            System.out.println("There is a loss");
            System.out.println("Loss from one item : "+profit);
        }
        else if(profit > 0){
            System.out.println("There is a profit");
            System.out.println("Profit from one item : "+profit);
        }
        else{
            System.out.println("No profit or Loss");
        }

        profitScanner.close();
    }
}

