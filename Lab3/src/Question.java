public class Question {
    private String Text;
    private String answer;
    private int difficulty;

    Question(String question,String answer,int difficulty ){
        this.Text= question;
        this.answer = answer;
        this.difficulty = difficulty;
    }

    public String getText() {
        return Text;
    }

    public String getAnswer() {
        return answer;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setQuestion(String question) {
        this.Text = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
