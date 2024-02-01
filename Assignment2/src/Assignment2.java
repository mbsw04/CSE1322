import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        System.out.println("Bus Dispatching System");
        Scanner scan = new Scanner(System.in);
        Dispatcher dispatcher = new Dispatcher();

        while (true){
            System.out.println();
            System.out.println("1. Add bus");
            System.out.println("2. Add Person to bus");
            System.out.println("3. Remove bus");
            System.out.println("4. Remove person");
            System.out.println("5. List passengers");
            System.out.println("6. List busses");
            System.out.println("7. Requeue bus");
            System.out.println("8. Transfer person");
            System.out.println("9. Dispatch bus");
            System.out.println("0. Exit");

            int choice = scan.nextInt();
            scan.nextLine();
            System.out.println();

            switch (choice){
                case 1:
                    Bus x = new Bus();
                    int pos = dispatcher.addBus(x);
                    System.out.println("Bus "+x.getId()+" added to position "+pos);
                    break;
                case 2:
                    System.out.print("Enter bus id: ");
                     int id = scan.nextInt();
                    scan.nextLine();
                    Bus bus = dispatcher.findBus(id);
                    if(bus == null){
                        System.out.println("No bus with id "+id);
                    }else{
                        System.out.print("Enter person's name: ");
                        String name = scan.nextLine();
                        bus.addPerson(new Person(name));
                        System.out.println(name+" has been added to bus "+bus.getId());
                    }
                    break;
                case 3:
                    System.out.print("Enter bus id: ");
                    int id_3 = scan.nextInt();
                    scan.nextLine();
                    Bus bus_3 = dispatcher.findBus(id_3);
                    if(bus_3 == null){
                        System.out.println("No bus with id "+id_3);
                    }else{
                        dispatcher.removeBus(id_3);
                        System.out.println("Bus "+bus_3.getId()+" removed");
                    }
                    break;
                case 4:
                    System.out.print("Enter bus id: ");
                    int id_4 = scan.nextInt();
                    scan.nextLine();
                    Bus bus_4 = dispatcher.findBus(id_4);
                    if(bus_4 == null){
                        System.out.println("No bus with id "+id_4);
                    }else{
                        System.out.print("Enter person's name: ");
                        String name = scan.nextLine();
                        boolean removed = bus_4.removePerson(bus_4.findPerson(name));
                        if(removed){
                            System.out.println(name+" has been removed from bus "+bus_4.getId());
                        }else{
                            System.out.println("No such person found in bus "+bus_4.getId());
                        }
                    }
                    break;
                case 5:
                    System.out.print("Enter bus id: ");
                    int id_5 = scan.nextInt();
                    scan.nextLine();
                    Bus bus_5 = dispatcher.findBus(id_5);
                    if(bus_5 == null){
                        System.out.println("No bus with id "+id_5);
                    }else{
                        System.out.println("Bus "+bus_5.getId());
                        System.out.println(bus_5.getPassengers());
                    }
                    break;
                case 6:
                    System.out.println("BUS QUEUE");
                    System.out.println(dispatcher.toString());
                    break;
                case 7:
                    System.out.print("Enter bus id: ");
                    int id_7 = scan.nextInt();
                    scan.nextLine();
                    Bus bus_7 = dispatcher.findBus(id_7);
                    if(bus_7 == null){
                        System.out.println("No bus with id "+id_7);
                    }else{
                        System.out.println("Enter new bus position: ");
                        int pos_7 = dispatcher.addBus(bus_7, scan.nextInt());
                        scan.nextLine();
                        System.out.println("Bus "+bus_7.getId()+" added to position "+pos_7);
                    }
                    break;
                case 8:
                    System.out.println("Enter person's name: ");
                    String name = scan.nextLine();
                    System.out.println("Enter id of bus 1: ");
                    int id_8_1 = scan.nextInt();
                    System.out.println("Enter id of bus 2: ");
                    int id_8_2 = scan.nextInt();
                    scan.nextLine();

                    Bus bus_8_1 = dispatcher.findBus(id_8_1);
                    if(bus_8_1 == null){
                        System.out.println("No bus with id "+id_8_1);
                    }else {
                        Bus bus_8_2 = dispatcher.findBus(id_8_2);
                        if(bus_8_2 == null){
                            System.out.println("No bus with id "+id_8_2);
                        }else{
                            Person person_8 = bus_8_1.findPerson(name);
                            if (person_8 == null){
                                System.out.println("No person named "+name);
                            }else {
                                if(Bus.transferPerson(bus_8_1,bus_8_2,person_8)){
                                    System.out.println("Person transferred successfully");
                                }else{
                                    System.out.println("Person transfer failed” if it didn't");
                                }
                            }
                        }
                    }
                    break;
                case 9:
                    Bus bus_9 = dispatcher.dispatchBus();
                    if(bus_9 == null){
                        System.out.println("Bus queue is empty");
                    }else{
                        System.out.println("Bus "+bus_9.getId()+" has been dispatched");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}