import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        stockItem milk = new stockItem("1 Gallon of Milk",3.60f,15);
        stockItem bread = new stockItem("1 Loaf of Bread",1.98f,30);
        int user_choice = 0;

        while(true){
            System.out.println("1. Sold One Milk");
            System.out.println("2. Sold One Bread");
            System.out.println("3. Change price of Milk");
            System.out.println("4. Change price of Bread");
            System.out.println("5. Add Milk to Inventory");
            System.out.println("6. Add Bread to Inventory");
            System.out.println("7. See Inventory");
            System.out.println("8. Quit");
            user_choice = scan.nextInt();

            switch (user_choice){
                case 1:
                    milk.lower_Qty(1);
                    break;
                case 2:
                    bread.lower_Qty(1);
                    break;
                case 3:
                    System.out.println("What is the new price for Milk");
                    float new_milk_price = scan.nextFloat();
                    milk.setPrice(new_milk_price);
                    break;
                case 4:
                    System.out.println("What is the new price for Bread");
                    float new_bread_price = scan.nextFloat();
                    milk.setPrice(new_bread_price);
                    break;
                case 5:
                    System.out.println("How many milk did we get?");
                    int new_milk_qty = scan.nextInt();
                    milk.raise_Qty(new_milk_qty);
                    break;
                case 6:
                    System.out.println("How many bread did we get?");
                    int new_bread_qty = scan.nextInt();
                    bread.raise_Qty(new_bread_qty);
                    break;
                case 7:
                    System.out.println();
                    System.out.println("Milk: "+milk.toString());
                    System.out.println("Bread: "+bread.toString());
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
            System.out.println();
        }
    }
}
