public class methods {
    private double number;
    private int decimal;
    public double NumRound(double num, int spaces) {
        num = Math.round(num * Math.pow(10, spaces)) / Math.pow(10, spaces);
        return num;
    }
}
