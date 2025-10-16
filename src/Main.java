public class Main {

    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = tip + tax;
        System.out.println("result: " + result);

    }

    public static void main(String[] args) {

        
        calculateTotalMealPrice(15, 0.2, 0.1);
    }

    
}
