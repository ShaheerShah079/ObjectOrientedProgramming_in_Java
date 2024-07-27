
package protientorna;

import java.util.Scanner;


public class ProtienToRna
{
     public static String singleWordToProtien(String protien)
    {
        String singleWordProtien= protien.replace("L","Leu").replace("I","Ile")
                .replace("M","Met").replace("V","Val").replace("S","Ser").replace("P","Pro")
                .replace("T","Thr").replace("A","Ala").replace("Y","Tyr").replace(".","Ter")
                .replace("H","His").replace("N","Asn").replace("K","Lys")
                .replace("D","Asp").replace("F","Phe").replace("E","Glu").replace("C","Cys").replace("W","Trp")
                .replace("R","Arg").replace("G","Gly").replace("Q","Gln");
        System.out.println(singleWordProtien);
        return singleWordProtien;
    }
  public static String ProtienToNeucleotide(String dna)
    {
        String protien =dna.replace("Phe","TTT").replace("Phe","TTC").replace("Phe","TTC")
                .replace("Leu","TTA").replace("Leu","TTG").replace("Leu","CTT")
                .replace("Leu","CTC").replace("Leu","CTA").replace("Leu","CTG")
                .replace("Ile","ATT").replace("Ile","ATC").replace("Ile","ATA")
                .replace("Met","ATG").replace("Val","GTT").replace("Val","GTC")
                .replace("Val","GTA").replace("Val","GTG").replace("Ser","TCT")
                .replace("Ser","TCC").replace("Ser","TCA").replace("Ser","TCG")
                .replace("Pro","CCT").replace("Pro","CCC").replace("Pro","CCA")
                .replace("Pro","CCG").replace("Thr","ACT").replace("Thr","ACC")
                .replace("Thr","ACA").replace("Thr","ACG").replace("Ala","GCT")
                .replace("Ala","GCC").replace("Ala","GCA").replace("Ala","GCG")
                .replace("Tyr","TAT").replace("Tyr","TAC").replace("Ter","TAA")
                .replace("Ter","TAG").replace("His","CAT").replace("His","CAC")
                .replace("Gln","CAA").replace("Gln","CAG").replace("Asn","AAT")
                .replace("Asn","AAC").replace("Lys","AAA").replace("Lys","AAG")
                .replace("Asp","GAT").replace("Asp","GAC").replace("Glu","GAA")
                .replace("Glu","GAG").replace("Cys","TGT").replace("Cys","TGC")
                .replace("Ter","TGA").replace("Trp","TGG").replace("Arg","CGT")
                .replace("Arg","CGC").replace("Arg","CGA").replace("Arg","CGG")
                .replace("Ser","AGT").replace("Ser","AGC").replace("Arg","AGA")
                .replace("Arg","AGG").replace("Gly","GGT").replace("Gly","GGC")
                .replace("Gly","GGA").replace("Gly","GGG");
        System.out.println(protien);
        return protien;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter protien here");
        String s1 = in.next();
        System.out.println(ProtienToNeucleotide(singleWordToProtien(s1)));
        
        
    }
}
