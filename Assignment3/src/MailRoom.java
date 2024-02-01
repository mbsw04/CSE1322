import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MailRoom {


        public boolean handleLetter(Letter letter, List<Mail> deliver) {
            if (letter.getDeliveryAddress() == null || letter.getReturnAddress() == null ||
                    letter.getDeliveryAddress().isEmpty() || letter.getReturnAddress().isEmpty())
                return false;

            if (letter.getLength() >= 5.0 && letter.getLength() <= 11.5 &&
                    letter.getWidth() >= 3.5 && letter.getWidth() <= 6.125 &&
                    letter.getThickness() >= 0.007 && letter.getThickness() <= 0.25 &&
                    letter.getLength() - letter.getWidth() >= 1.5) {
                deliver.add(letter);
                return true;
            }

            return false;
        }

        public boolean handleFlat(Flat flat, List<Mail> deliver) {
            if (flat.getDeliveryAddress() == null || flat.getReturnAddress() == null ||
                    flat.getDeliveryAddress().isEmpty() || flat.getReturnAddress().isEmpty())
                return false;

            if (flat.getLength() >= 11.5 && flat.getLength() <= 15 &&
                    flat.getWidth() >= 6.125 && flat.getWidth() <= 12 &&
                    flat.getThickness() >= 0.25 && flat.getThickness() <= 0.75 &&
                    "DOCUMENTS".equals(flat.getContents())) {
                deliver.add(flat);
                return true;
            }

            return false;
        }

        public boolean handleRegularBox(RegularBox regularBox, List<Mail> deliver) {
            if (regularBox.getDeliveryAddress() == null || regularBox.getReturnAddress() == null ||
                    regularBox.getDeliveryAddress().isEmpty() || regularBox.getReturnAddress().isEmpty())
                return false;

            if (regularBox.getLength() >= 6.0 && regularBox.getLength() <= 27.0 &&
                    regularBox.getWidth() >= 0.25 && regularBox.getWidth() <= 17.0 &&
                    regularBox.getHeight() >= 3 && regularBox.getHeight() <= 17 &&
                    regularBox.getWeight() >= 0.0 && regularBox.getWeight() <= 70.0 &&
                    regularBox.getCount() >= 0 && regularBox.getCount() <= 50) {
                deliver.add(regularBox);
                return true;
            }

            return false;
        }

        public boolean handleLiveBox(LiveBox liveBox, List<Mail> deliver) {
            if (liveBox.getDeliveryAddress() == null || liveBox.getReturnAddress() == null ||
                    liveBox.getDeliveryAddress().isEmpty() || liveBox.getReturnAddress().isEmpty())
                return false;

            if (liveBox.getLength() >= 6.0 && liveBox.getLength() <= 27.0 &&
                    liveBox.getWidth() >= 0.25 && liveBox.getWidth() <= 17.0 &&
                    liveBox.getHeight() >= 3 && liveBox.getHeight() <= 17) {
                if (("HONEYBEES".equals(liveBox.getAnimal()) && liveBox.getAge() >= 0 && liveBox.getAge() <= 20) ||
                        ("CHICKEN".equals(liveBox.getAnimal()) && liveBox.getAge() >= -1 && liveBox.getAge() <= 1)) {
                    deliver.add(liveBox);
                    return true;
                }
            }

            return false;
        }



    public static void main(String[] args) {
            MailRoom mr = new MailRoom();
            List<Mail> deliver = new ArrayList<>();
            boolean exit = false;

            while (!exit) {
                System.out.println("MailRoom Menu:");
                System.out.println("1. Send a Letter");
                System.out.println("2. Send a Flat");
                System.out.println("3. Send a Regular Box");
                System.out.println("4. Send a Live Box");
                System.out.println("5. Deliver Mail");
                System.out.println("6. Exit");

                int choice;
                Scanner scanner = new Scanner(System.in);
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the delivery address: ");
                        String deliveryAddress = scanner.nextLine();
                        System.out.println("Enter the return address: ");
                        String returnAddress = scanner.nextLine();
                        System.out.println("Enter the width of your mail: ");
                        double width = scanner.nextDouble();
                        System.out.println("Enter the length of your mail: ");
                        double length = scanner.nextDouble();
                        System.out.println("Enter the thickness of your mail: ");
                        double thickness = scanner.nextDouble();
                        System.out.println("Enter the contents of your letter: ");
                        scanner.nextLine();
                        String letterBody = scanner.nextLine();
                        Letter letter = new Letter(deliveryAddress, returnAddress, width, length, thickness, letterBody);

                        if (mr.handleLetter(letter, deliver)) {
                            System.out.println("Letter accepted for delivery.");
                        } else {
                            System.out.println("Letter cannot be mailed.");
                        }
                        break;

                    case 2:
                        System.out.println("Enter the delivery address: ");
                        deliveryAddress = scanner.nextLine();
                        System.out.println("Enter the return address: ");
                        returnAddress = scanner.nextLine();
                        System.out.println("Enter the width of your mail: ");
                        width = scanner.nextDouble();
                        System.out.println("Enter the length of your mail: ");
                        length = scanner.nextDouble();
                        System.out.println("Enter the thickness of your mail: ");
                        thickness = scanner.nextDouble();
                        System.out.println("Enter the contents of your flat: ");
                        scanner.nextLine();
                        String contents = scanner.nextLine();
                        Flat flat = new Flat(deliveryAddress, returnAddress, width, length, thickness, contents);

                        if (mr.handleFlat(flat, deliver)) {
                            System.out.println("Flat accepted for delivery.");
                        } else {
                            System.out.println("Flat cannot be mailed.");
                        }
                        break;

                    case 3:
                        System.out.println("Enter the delivery address: ");
                        deliveryAddress = scanner.nextLine();
                        System.out.println("Enter the return address: ");
                        returnAddress = scanner.nextLine();
                        System.out.println("Enter the width of your mail: ");
                        width = scanner.nextDouble();
                        System.out.println("Enter the length of your mail: ");
                        length = scanner.nextDouble();
                        System.out.println("Enter the height of your mail: ");
                        double height = scanner.nextDouble();
                        System.out.println("Enter how many items your box has: ");
                        int itemCount = scanner.nextInt();
                        System.out.println("Enter the weight of your box: ");
                        double weight = scanner.nextDouble();
                        System.out.println("Enter the contents of your box: ");
                        scanner.nextLine();
                        String boxContents = scanner.nextLine();
                        RegularBox regularBox = new RegularBox(deliveryAddress, returnAddress, width, length, height, itemCount, boxContents, weight);

                        if (mr.handleRegularBox(regularBox, deliver)) {
                            System.out.println("Regular box accepted for delivery.");
                        } else {
                            System.out.println("Regular box cannot be mailed.");
                        }
                        break;

                    case 4:
                        System.out.println("Enter the delivery address: ");
                        deliveryAddress = scanner.nextLine();
                        System.out.println("Enter the return address: ");
                        returnAddress = scanner.nextLine();
                        System.out.println("Enter the width of your mail: ");
                        width = scanner.nextDouble();
                        System.out.println("Enter the length of your mail: ");
                        length = scanner.nextDouble();
                        System.out.println("Enter the height of your mail: ");
                        height = scanner.nextDouble();
                        System.out.println("Enter how many items your box has: ");
                        itemCount = scanner.nextInt();
                        System.out.println("Enter what animal is being shipped: ");
                        scanner.nextLine();
                        String animal = scanner.nextLine();
                        System.out.println("Enter age of the oldest animal, in days: ");
                        int age = scanner.nextInt();
                        LiveBox liveBox = new LiveBox(deliveryAddress, returnAddress, width, length, height, itemCount, animal, age);

                        if (mr.handleLiveBox(liveBox, deliver)) {
                            System.out.println("Live box accepted for delivery.");
                        } else {
                            System.out.println("Live box cannot be mailed.");
                        }
                        break;

                    case 5:
                        System.out.println("DISPATCHING THE FOLLOWING ITEMS FOR DELIVERY: ");
                        if (deliver.isEmpty()) {
                            System.out.println("Delivery queue is empty.");
                        } else {
                            for (Mail mail : deliver) {
                                System.out.println("==========");
                                System.out.println(mail.toString());
                                System.out.println("==========");
                            }
                        }

                        deliver.clear();
                        break;

                    case 6:
                        exit = true;
                        System.out.println("Quitting...");
                        break;
                }
            }
        }
}
