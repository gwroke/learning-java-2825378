public class Main {

    public static double calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
        
    }

    public static void main(String[] args) {
        double price = calculateTotalMealPrice(15, 0.5, 0.2);
        System.out.println("Your total meal price is " + price);
    }

}
