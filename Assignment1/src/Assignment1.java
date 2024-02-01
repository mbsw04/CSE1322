import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("FastFood World Order Tracker\n");
        OrderList restaurantOrders = new OrderList();

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Please select a menu option:");
            System.out.println("1- Create order");
            System.out.println("2- Delete order");
            System.out.println("3- Ready order");
            System.out.println("4- Print order");
            System.out.println("5- Print all orders");
            System.out.println("6- Exit");
            int user_menu_input = scan.nextInt();
            scan.nextLine();
            System.out.println();

            switch (user_menu_input){
                case 1:

                    String[] order = new String[3];
                    for(int i = 0; i < order.length;i++){
                        System.out.print("Enter item "+(i+1)+": ");
                        order[i] = scan.nextLine();
                    }
                    restaurantOrders.addOrder(new Order(order));
                    System.out.println("Order has been added.");
                    System.out.println();

                    break;
                case 2:

                    System.out.print("Please enter order id: ");
                    restaurantOrders.removeOrder(scan.nextInt());

                    break;
                case 3:

                    System.out.print("Please enter order id: ");
                    restaurantOrders.readyOrder(scan.nextInt());

                    break;
                case 4:
                    System.out.print("Please enter order id: ");
                    System.out.println(restaurantOrders.printOrder(scan.nextInt()));
                    break;
                case 5:
                    restaurantOrders.printOrders();
                    break;
                case 6:
                    System.out.print("Shutting off...");
                    System.exit(0);
                    break;
            }

        }

    }
}