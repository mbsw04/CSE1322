public class DNALib {

    public static boolean validator(String dna){
        if (dna.isEmpty() || dna.length() % 3 != 0) {
            return false;
        }
        for (char c : dna.toCharArray()) {
            if (c != 'A' && c != 'C' && c != 'G' && c != 'T') {
                return false;
            }
        }
        return true;
    }

    public static String reverser(String dna){
        if(dna.equals("")){
            return "";
        }else{
            return dna.charAt(dna.length()-1) + reverser(dna.substring(0,dna.length()-1));
        }
    }

    public static String inverser(String dna){
        if(dna.isEmpty()){
            return "";
        }else{
            char dna_index = dna.charAt(0);
            if (dna_index == 'A') {
                return "T" + inverser(dna.substring(1));
            }else if (dna_index == 'C') {
                return "G" + inverser(dna.substring(1));
            }else if (dna_index == 'G') {
                return "C" + inverser(dna.substring(1));
            }else{
                return "A" + inverser(dna.substring(1));
            }
        }
    }

    public static String translator(String dna){

        if(dna.isEmpty()){
            return "";
        }else{
            String aminoacid="";
            String sequence = dna.substring(0,3);
            switch (sequence) {
                case "GCA", "GCC", "GCG", "GCT" -> aminoacid = "A";
                case "TGC", "TGT" -> aminoacid = "C";
                case "GAC", "GAT" -> aminoacid = "D";
                case "GAA", "GAG" -> aminoacid = "E";
                case "TTC", "TTT" -> aminoacid = "F";
                case "GGA", "GGC", "GGG", "GGT" -> aminoacid = "G";
                case "CAC", "CAT" -> aminoacid = "H";
                case "ATA", "ATC", "ATT" -> aminoacid = "I";
                case "AAA", "AAG" -> aminoacid = "K";
                case "CTA", "CTC", "CTG", "CTT", "TTA", "TTG" -> aminoacid = "L";
                case "ATG" -> aminoacid = "M";
                case "AAT", "AAC" -> aminoacid = "N";
                case "CCA", "CCC", "CCG", "CCT" -> aminoacid = "P";
                case "CAA", "CAG" -> aminoacid = "Q";
                case "AGA", "AGG", "CGA", "CGC", "CGG", "CGT" -> aminoacid = "R";
                case "AGC", "AGT", "TCA", "TCC", "TCG", "TCT" -> aminoacid = "S";
                case "ACA", "ACC", "ACG", "ACT" -> aminoacid = "T";
                case "GTA", "GTC", "GTG", "GTT" -> aminoacid = "V";
                case "TGG" -> aminoacid = "W";
                case "TAC", "TAT" -> aminoacid = "Y";
                case "TAA", "TAG", "TGA" -> aminoacid = "-";
            }
            return aminoacid+translator(dna.substring(3));

        }
    }

}