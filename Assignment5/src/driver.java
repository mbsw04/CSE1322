import java.util.Scanner;

public class driver {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("[DNA Reverser and Translator]");
        System.out.print("Enter a sequence: ");
        String dna = scan.nextLine();
        if(DNALib.validator(dna)){
           String rev_dna = DNALib.reverser(dna);
           String inv_dna = DNALib.inverser(rev_dna);
           String translated_dna = DNALib.translator(inv_dna);
           System.out.println("Your DNA sequence reversed and translated is:");
           System.out.print(translated_dna);

        }else{
            System.out.println("Your DNA sequence is not valid.");
        }
    }
}
