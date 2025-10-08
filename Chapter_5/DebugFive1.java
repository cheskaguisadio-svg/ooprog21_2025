import java.util.*;

public class DebugFive1 {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        
        final double HIGH_PRICE = 2.59;
        final double MED_PRICE = 1.99;
        final double LOW_PRICE = 0.89;
        
        int usersChoice;
        double bill = 0.0;  // Initialize bill
        
        
        System.out.println("Order please 1 - Burger 2 - Hotdog");
        System.out.print("3 - Grilled cheese 4 - Fish sandwich >> ");
        usersChoice = kb.nextInt();
        
       
        if (usersChoice == 1 || usersChoice == 2) {
            bill += HIGH_PRICE;  // Burger or hotdog price
        } else if (usersChoice == 3 || usersChoice == 4) {
            bill += MED_PRICE;  // Grilled cheese or fish sandwich price
        }

     
        System.out.print("Fries with that? 1 - Yes 2 - No >> ");
        usersChoice = kb.nextInt();
        
        
        if (usersChoice == 1) {
            bill += LOW_PRICE;  // Adding fries price
        }
        
        
        System.out.println("Total bill is " + bill);
    }
}
