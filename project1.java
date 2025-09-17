import java.util.Scanner;

public class marketsupeior{
    public static void main(String[] args) {
    	

   
    	        Scanner sc = new Scanner(System.in);

    	        // ask how many items
    	        System.out.print("Enter the number of items: ");
    	        int item = sc.nextInt();
    	        sc.nextLine(); // consume newline

    	        // arrays
    	        String[] itemName = new String[item];
    	        double[] itemPrice = new double[item];
    	        int[] itemQuantity = new int[item];
    	        double[] itemSubtotal = new double[item];

    	        // input and calculation for each item
    	        for (int i = 0; i < item; i++) {
    	            System.out.println("\nItem " + (i + 1) + ":");

    	            System.out.print("Enter item name: ");
    	            itemName[i] = sc.nextLine();

    	            System.out.print("Enter item price: ");
    	            itemPrice[i] = sc.nextDouble();

    	            System.out.print("Enter item quantity: ");
    	            itemQuantity[i] = sc.nextInt();
    	            sc.nextLine(); // consume newline

    	            // 
    	            itemSubtotal[i] = itemPrice[i] * itemQuantity[i];
    	        }

    	        // calculate grand total
    	        double grandtotal = 0;
    	        for (int i = 0; i < itemSubtotal.length; i++) {
    	            grandtotal += itemSubtotal[i];
    	        }

    	        // discount logic
    	        double discount = 0;
    	        if (grandtotal > 50000) {
    	            discount = 0.05 * grandtotal;
    	        }

    	        double finalamount = grandtotal - discount;

    	        // print receipt
    	        System.out.println("\n========== RECEIPT ==========");
    	        System.out.println("Item\t\tQuantity\tPrice/unit\tSubtotal");

    	        for (int i = 0; i < item; i++) {
    	            System.out.println(itemName[i] + "\t\t" + itemQuantity[i] + "\t\t"
    	                    + itemPrice[i] + "\t\t" + itemSubtotal[i]);
    	        }

    	        System.out.println("\nGrand Total: " + grandtotal);
    	        System.out.println("Discount: " + discount);
    	        System.out.println("Final Amount: " + finalamount);

    	        sc.close();
    	    }
    	}# Niyonsaba-Erina-Java-programming
