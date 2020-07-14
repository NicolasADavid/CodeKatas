/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codekatas;

/**
 *
 * @author Nico
 */
public class DnaStrand {
    public static void run(){
        DnaStrand.makeComplement("ATTGC"); // return "TAACG"
        DnaStrand.makeComplement("GTAT"); // return "CATA"
    }
    
    public static String makeComplement(String dna) {
        String ret = "";
        // Use char array to accumulate chars and then string builder to create string.
        for(int i = 0; i<dna.length(); i++){
            char c = dna.charAt(i);
            ret = ret.concat(Character.toString(DnaStrand.getComplementaryLetter(c)));
        }
        return ret;
    }
    public static char getComplementaryLetter(char c){
        
        char r = 'X';
        
        switch(c) {
            case 'A':
                r = 'T';
                break;
            case 'T':
                r = 'A';
                break;
            case 'C':
                r = 'G';
                break;
            case 'G':
                r = 'C';
            default:
        }
        return r;
    }
}
