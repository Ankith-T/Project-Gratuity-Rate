import java.util.Scanner;
public class Gratuity {
    public static void main(String[] args) throws Exception {
        Scanner gratuityScanner = new Scanner(System.in);
        Scanner subtotalScanner = new Scanner(System.in);
        System.out.println("Enter the Subtotal and then the Gratuity Rate: ");
        double subtotalValueInput = subtotalScanner.nextDouble();
        double gratuityRateInput = gratuityScanner.nextDouble();
        double gratuityPercent = gratuityRateInput/100; 
        double gratuityTotal = gratuityPercent * subtotalValueInput;
        double totalBill = subtotalValueInput + gratuityTotal;
        System.out.println("The Gratuity is : $" + gratuityTotal + " and Total is: $" + totalBill );
    }
}

