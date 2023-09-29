import java.util.Scanner;
public class GaniProject1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rounding round = new Rounding();
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int party = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        double percent = scan.nextDouble();
        percent /= 100;
        double cost = 0;
        double bill = 0;
        while (cost!=-1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            if (cost >= 0) {
                bill += cost;
            }
        }
        double tip = bill * percent;
        double discount = 1;
        if ((tip + bill ) > 50) {
            System.out.println("Meals over 50 dollars come with a free voucher of 10% off: ");
            discount = .9;
        }
        tip = round.NumRound(tip, 2);
        bill = round.NumRound(bill, 2);
        System.out.print("Bill before discount: ");
        round.receipt(tip, bill, party, percent, 1);
        System.out.println();
        System.out.println("Bill after discount: ");
        round.receipt(tip, bill, party, percent, discount);
    }
}
