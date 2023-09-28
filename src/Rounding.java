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
        number = Math.round(number * Math.pow(10, decimal)) / Math.pow(10, decimal);
        return decimal;
    }
}
