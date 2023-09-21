import java.util.Scanner;
public class GaniProject1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int party = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int percent = scan.nextInt();
        double cost = 0;
        double bill = 0;
        while (cost!=-1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            bill += cost;
        }
        double tip = bill * percent;
        System.out.println("Total bill before tip: $" + bill);
        System.out.println("Total percentage: $" + percent + "%");
        System.out.println("Total tip: $" + (tip));
        System.out.println("Total bill with tip: $" + (tip + bill));
        System.out.println("Tip per person: $" + (tip / party));
        System.out.println("Total cost per person: $" + ((bill + tip) / party));
    }
}
