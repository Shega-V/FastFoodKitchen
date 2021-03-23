/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author shegavala
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        BurgerOrder order1 = new BurgerOrder(3,5,4,10,false,1);
        BurgerOrder order2 = new BurgerOrder(0,0,3,3,true,2);
        BurgerOrder order3 = new BurgerOrder(1,1,0,2,false,3);
        BurgerOrder order4 = new BurgerOrder(1,2,3,1,true,4);
        order1.setNumSodas(12);
        
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);
        
        FastFoodKitchen kitchen = new FastFoodKitchen();
        Scanner sc = new Scanner(System.in);

        while (kitchen.getNumOrdersPending() != 0) {
            // see if user wants to add an order
            System.out.println("Please select from the following menu of options, by typing a number:");
            System.out.println("\t 1. Order food");
            System.out.println("\t 2. Check on an order");
	     System.out.println("\t 3. Show all the orders currently pending.");
            System.out.println("\t 4. Do nothing (just waiting)");
            try {
                int num = sc.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("How many hamburgers do you want?");
                        int ham = sc.nextInt();
                        System.out.println("How many cheeseburgers do you want?");
                        int cheese = sc.nextInt();
                        System.out.println("How many veggieburgers do you want?");
                        int veggie = sc.nextInt();
                        System.out.println("How many sodas do you want?");
                        int sodas = sc.nextInt();
                        System.out.println("Is your order to go? (Y/N)");
                        char letter = sc.next().charAt(0);
                        boolean TOGO = false;
                        if (letter == 'Y' || letter == 'y' ) {
                            TOGO = true;
                        } 
                        int orderNum = kitchen.addOrder(ham, cheese, veggie, sodas, TOGO);
                        System.out.println("Thank-you. Your order number is " + orderNum);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("What is your order number?");
                        int order = sc.nextInt();
                        boolean ready = kitchen.isOrderDone(order);
                        if (ready) {
                            System.out.println("Yes, we already called out order number " + order);
                        } else {
                            System.out.println("No, it's not ready, but it should be up soon. Sorry for the wait.");
                        }
                        System.out.println();
                        break;
			case 3: 
			    System.out.println(kitchen);
			    break;
                    case 4:
                        break;
                    default:
                        System.out.println("Sorry, but you need to enter a 1, 2, 3 or a 4");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Sorry, but that wasn't a number.");
            }
            // simulate cooking activity in the kitchen
            kitchen.simulateKitchenActivity();
        
    } // end while loop
         
         try {
                int num = sc.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("How many hamburgers do you wantto cancel ?");
                        int ham = sc.nextInt();
                        System.out.println("How many cheeseburgers do you want to cancel?");
                        int cheese = sc.nextInt();
                        System.out.println("How many veggieburgers do you want?");
                        int veggie = sc.nextInt();
                        System.out.println("How many sodas do you want to cancel ?");
                        int sodas = sc.nextInt();
                        System.out.println("Was  your order to go? (Y/N)");
                        char letter = sc.next().charAt(0);
                        boolean TOGO = false;
                        if (letter == 'Y' || letter == 'y' ) {
                            TOGO = true;
                        } 
                        int orderNum = kitchen.cancelOrder(ham, cheese, veggie, sodas, TOGO);
                        System.out.println("Thank-you. Your order number to cancel is " + orderNum);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("What is your order number?");
                        int order = sc.nextInt();
                        boolean ready = kitchen.isOrderDone(order);
                        if (ready) {
                            System.out.println("Your order has been succsessfully canceled " + order);
                        } else {
                            System.out.println("Sorry, we cant find your order number in the system");
                        }
                        System.out.println();
                        break;
			case 3: 
			    System.out.println(kitchen);
			    break;
                    case 4:
                        break;
                    default:
                        System.out.println("Sorry, but you need to enter a 1, 2, 3 or a 4");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Sorry, but that wasn't a number.");
            }
            // simulate cooking activity in the kitchen
            kitchen.simulateKitchenActivity();
    }
    
    
}
