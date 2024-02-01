import java.util.Scanner;
public class Lab7A {
    public static int recursive_multiply(int num1,int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else {
            return num1 + recursive_multiply(num1, num2 - 1);
        }
    }

    public static int recursive_div(int num1,int num2){
        if (num2==0){
            return -1;
        }else if(num1==num2){
            return 1;
        } else if (num1<num2) {
            return 0;
        } else {
            return 1+recursive_div(num1-num2,num2);
        }
    }

    public static int recursive_mod(int num1,int num2){
        if (num2==0){
            return -1;
        } else if (num1<num2) {
            return num1;
        } else {
            return recursive_mod(num1-num2,num2);
        }
    }

    public static void main(String[] args){
        while (true) {
            System.out.print(
                    """
                            Choose from the following:
                            0. Quit
                            1. Multiply 2 numbers
                            2. Div 2 numbers
                            3. Mod 2 numbers
                            """
            );
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();

            switch (choice){
                case 0 -> {System.exit(0);}
                case 1 -> {
                    System.out.println("Enter first number");
                    int num1 = scan.nextInt();
                    System.out.println("Enter second number");
                    int num2 = scan.nextInt();
                    System.out.println("Answer: "+recursive_multiply(num1,num2));
                }
                case 2 -> {
                    System.out.println("Enter first number");
                    int num1 = scan.nextInt();
                    System.out.println("Enter second number");
                    int num2 = scan.nextInt();
                    System.out.println("Answer: "+recursive_div(num1,num2));
                }
                case 3 -> {
                    System.out.println("Enter first number");
                    int num1 = scan.nextInt();
                    System.out.println("Enter second number");
                    int num2 = scan.nextInt();
                    System.out.println("Answer: "+recursive_mod(num1,num2));
                }
            }
        }
    }

}