import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    ArrayList<Question> questions = new ArrayList<Question>();
    Scanner scan = new Scanner(System.in);
    public void add_question(){
        System.out.println("What is the question Text?");
        String text = scan.nextLine();
        System.out.println("What is the answer?");
        String answer = scan.nextLine();
        System.out.println("How Difficult (1-3)?");
        int diff = scan.nextInt();
        scan.nextLine();
        questions.add(new Question(text,answer,diff));
    }

    public  void remove_question(){
        System.out.println("Choose the question to remove?");
        int i = 0;
        for (Question x: questions) {
            System.out.println(i+". "+x.getText());
            i++;
        }
        questions.remove(scan.nextInt());
    }

    public void modify_question(){
        System.out.println("Choose the question to modify?");
        int i = 0;
        for (Question x: questions) {

            System.out.println(i+". "+x.getText());
            i++;
        }
        int choice = scan.nextInt();
        scan.nextLine();
        System.out.println("What is the question Text?");
        questions.get(choice).setQuestion(scan.nextLine());
        System.out.println("What is the answer?");
        questions.get(choice).setAnswer(scan.nextLine());
        System.out.println("How Difficult (1-3)?");
        questions.get(choice).setDifficulty(scan.nextInt());
        scan.nextLine();
    }

    public void give_quiz(){
        int score = 0;
        int total = questions.size();
        for (Question x: questions) {
            System.out.println(x.getText());
            String ans = scan.nextLine();
            if (ans.equals(x.getAnswer())){
                score++;
                System.out.println("Correct");
            }else{
                System.out.println("Incorrect");
            }
        }
        System.out.println("You got "+score+" out of "+total);

    }
}
