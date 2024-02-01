import java.util.Random;
public class Baby implements Runnable {
    private int time;
    private String name;

    public Baby(String name) {
        this.name = name;
        Random random = new Random();
        this.time = random.nextInt(5000);
    }

    @Override
    public void run() {
        try {
            System.out.println("My name is " + this.name + " I am going to sleep for " + this.time + "ms");
            Thread.sleep(this.time);
            System.out.println("My name is " + this.name + ", I am awake, feed me!!!");
        }
        catch (InterruptedException e) {
            System.out.println("I was interrupted. I'm " + this.name + "!");
        }
    }
}