public class Rounding {
    private double number;
    private int decimal;
//    public Initialize(double num, int place) {
//        number = num;
//        decimal = place;
//    }
    public double NumRound(double num, int place) {
        number = num;
        decimal = place;
        number = Math.round(number * (double) Math.pow(10, decimal)) / (double) Math.pow(10, decimal);
        return number;
    }
    public void receipt(double tip, double bill, int party, double percent, double discount) {
        System.out.println();
        System.out.println("Total bill before tip: $" + NumRound((discount * bill), 2));
        System.out.println("Total percentage: " + (percent * 100) + "%");
        System.out.println("Total tip: $" + NumRound((discount * tip * discount), 2));
        System.out.println("Total tip: $" + (NumRound((discount * tip), 2)));
        System.out.println("Total bill with tip: $" + (NumRound((discount * (tip + bill)), 2)));
        System.out.println("Tip per person: $" + (NumRound((discount * (tip / party)), 2)));
        System.out.println("Total cost per person: $" + (NumRound(discount * ((bill + tip) / party), 2)));
    }
}