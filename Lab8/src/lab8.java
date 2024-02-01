import java.util.Scanner;

class InvalidTimeException extends Exception {
    public InvalidTimeException(String message) {
        super(message);
    }
}

class Main {
    public static int calculateSeconds(String time) throws InvalidTimeException {
        String[] parts = time.split(":", 3);
        if (parts.length != 3) {
            throw new InvalidTimeException("Time format not valid");
        }
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);

        if (hours < 0 || hours > 23) {
            throw new InvalidTimeException("Hour must be between 0 and 23");
        }
        if (minutes < 0 || minutes > 59) {
            throw new InvalidTimeException("Minutes must be between 0 and 59");
        }
        if (seconds < 0 || seconds > 59) {
            throw new InvalidTimeException("Seconds must be between 0 and 59");
        }

        return (hours * 60 * 60) + (minutes * 60) + seconds;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
        String time1 = scanner.nextLine();

        System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS)");
        String time2 = scanner.nextLine();

        try {
            int seconds1 = calculateSeconds(time1);
            int seconds2 = calculateSeconds(time2);
            int difference = Math.abs(seconds1 - seconds2);

            System.out.println("Difference in seconds: " + difference);

        } catch (InvalidTimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
