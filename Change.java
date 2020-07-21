import java.util.Scanner;

public class Change {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int price;
        int provided;
        int change;
        System.out.print("Enter the purchase price:");
        price = (int) Math.round(keyboard.nextDouble() * 100);
        System.out.print("Enter the amount given by the customer:");
        provided = (int) Math.round(keyboard.nextDouble() * 100);
        
        if (provided > price) {
            System.out.println("The change is: " + ((provided - price)/100.00));
        }
        if(provided < price) {
        	System.out.println("Extra pay: "+((price-provided)/100.00));
        }
    

System.out.println("Thank you visit Again");
}
}
