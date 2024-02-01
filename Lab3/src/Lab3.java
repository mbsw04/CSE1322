import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Quiz quiz = new Quiz();
        while (true){
            System.out.println("What would you like to do?");
            System.out.println("1. Add a question to the quiz");
            System.out.println("2. Remove a question from the quiz");
            System.out.println("3. Modify a question in the quiz");
            System.out.println("4. Take the quiz");
            System.out.println("5. Quit");

            int choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 1:
                    quiz.add_question();
                    break;
                case 2:
                    quiz.remove_question();
                    break;
                case 3:
                    quiz.modify_question();
                    break;
                case 4:
                    quiz.give_quiz();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
