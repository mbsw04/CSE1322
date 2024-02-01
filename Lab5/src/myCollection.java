import java.util.Scanner;
public class myCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item[] collection = new Item[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter B for Book or P for Periodical");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("B")) {
                System.out.println("Please enter the name of the Book");
                String title = scanner.nextLine();
                System.out.println("Please enter the author of the Book");
                String author = scanner.nextLine();
                System.out.println("Please enter the ISBN of the Book");
                String isbnNumber = scanner.nextLine();
                collection[i] = new Book(title, isbnNumber, author);
            } else if (choice.equalsIgnoreCase("P")) {
                System.out.println("Please enter the name of the Periodical");
                String title = scanner.nextLine();
                System.out.println("Please enter the issue number");
                int issueNum = scanner.nextInt();
                collection[i] = new Periodical(title, issueNum);
            } else {
                System.out.println("Invalid choice. Please enter B or P.");
                i--; // Decrement to repeat the input for this iteration.
            }
        }

        System.out.println("Your Items:");
        for (Item item : collection) {
            if (item != null) {
                System.out.println(item.getListing());
            }
        }
    }
}