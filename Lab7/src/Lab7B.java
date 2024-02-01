import java.util.Scanner;

public class Lab7B {
    public static String repeatNTimes(String x, int n){
        if (n == 0){
            return "";
        } else {
            return x +"\n"+ repeatNTimes(x,n-1);
        }
    }
    public static boolean isReverse(String s1,String s2){
        if(s1.length() == 0 && s2.length() == 0){
            return true;
        } else if(s1.length() != s2.length()){
            return false;
        } else {
            return s1.charAt(0) == s2.charAt(s2.length()-1) && isReverse(s1.substring(1),s2.substring(0,s2.length()-1));
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println(repeatNTimes("I must study recursion until it makes sense",100));

        System.out.println("Enter first string");
        String s1 = scan.nextLine();
        System.out.println("Enter second string");
        String s2 = scan.nextLine();
        if(isReverse(s1,s2)){
            System.out.println(s1+" is the reverse of "+s2);
        }else{
            System.out.println(s1+" is not the reverse of "+s2);
        }
    }
}
