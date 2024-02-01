import java.util.Scanner;

class BlueRayDisk {
    public String title;
    public String director;
    public int yearOfRelease;
    public double cost;

    public BlueRayDisk(String title, String director, int yearOfRelease, double cost) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "$" + cost + " " + yearOfRelease + " " + title + ", " + director;
    }
}

class Node {
    BlueRayDisk disk;
    Node next;

    public Node(BlueRayDisk disk) {
        this.disk = disk;
    }
}

class BlueRayCollection {
    private Node head = null;

    public void add(String title, String director, int yearOfRelease, double cost) {
        Node newNode = new Node(new BlueRayDisk(title, director, yearOfRelease, cost));
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void show_all() {
        Node current = head;
        while (current != null) {
            System.out.println(current.disk);
            current = current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BlueRayCollection collection = new BlueRayCollection();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                                0. Quit
                                1. Add BlueRay to collection
                                2. See collection""");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 0) {
                System.exit(0);
            } else if (choice == 1) {
                System.out.println("What is the title?");
                String title = scanner.nextLine();
                System.out.println("What is the director?");
                String director = scanner.nextLine();
                System.out.println("What is the year of release?");
                int year = scanner.nextInt();
                System.out.println("What is the cost?");
                double cost = scanner.nextDouble();
                collection.add(title, director, year, cost);
            } else if (choice == 2) {
                collection.show_all();
            }
        }
    }
}
