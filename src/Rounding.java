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
}
