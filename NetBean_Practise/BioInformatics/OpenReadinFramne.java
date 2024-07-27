package com.shaheer;
import java.util.Scanner;
public class OpenReadinFramne {
    public static StringBuilder removeUnnecessaryNeclotide(StringBuilder dna)
    {
        for(int i=0;i<3;i++) {
            if(dna.charAt(i)!=' '&&dna.charAt(i+1)!=' '&&dna.charAt(i+2)!=' ') {
                break;
            }
            else if(dna.charAt(i)!=' '&&dna.charAt(i+1)!=' ')
            {
                dna.setCharAt(i,' ');
                dna.setCharAt((i+1),' ');
            }
            else
            {
                dna.setCharAt(i,' ');
            }
        }
        for(int i=(dna.length()-1);i>=(dna.length()-3);i--)
        {
            if(dna.charAt(i)!=' '&&dna.charAt(i-1)!=' '&&dna.charAt(i-2)!=' ')
            {
                break;
            }
            else if(dna.charAt(i)!=' '&&dna.charAt(i-1)!=' ')
            {
                dna.setCharAt(i,' ');
                dna.setCharAt((i-1),' ');
            }
            else
            {
                dna.setCharAt(i,' ');
            }
        }
        return dna;
    }
    public static String protienToSingleWordRepresentation(String protien)
    {
        String singleWordProtien= protien.replace("Phe","F").replace("Leu","L").replace("Ile","I")
                .replace("Met","M").replace("Val","V").replace("Ser","S").replace("Pro","P")
                .replace("Thr","T").replace("Ala","A").replace("Tyr","Y").replace("Ter",".")
                .replace("His","H").replace("Gln","Q").replace("Asn","N").replace("Lys","K")
                .replace("Asp","D").replace("Glu","E").replace("Cys","C").replace("Trp","W")
                .replace("Arg","R").replace("Gly","G");
        return singleWordProtien;
    }
    public  static  String neucleotideTOProtien(StringBuilder dna)
    {
        String protien =dna.toString().replace("TTT","Phe").replace("TTC","Phe").replace("TTC","Phe")
                .replace("TTA","Leu").replace("TTG","Leu").replace("CTT","Leu")
                .replace("CTC","Leu").replace("CTA","Leu").replace("CTG","Leu")
                .replace("ATT","Ile").replace("ATC","Ile").replace("ATA","Ile")
                .replace("ATG","Met").replace("GTT","Val").replace("GTC","Val")
                .replace("GTA","Val").replace("GTG","Val").replace("TCT","Ser")
                .replace("TCC","Ser").replace("TCA","Ser").replace("TCG","Ser")
                .replace("CCT","Pro").replace("CCC","Pro").replace("CCA","Pro")
                .replace("CCG","Pro").replace("ACT","Thr").replace("ACC","Thr")
                .replace("ACA","Thr").replace("ACG","Thr").replace("GCT","Ala")
                .replace("GCC","Ala").replace("GCA","Ala").replace("GCG","Ala")
                .replace("TAT","Tyr").replace("TAC","Tyr").replace("TAA","Ter")
                .replace("TAG","Ter").replace("CAT","His").replace("CAC","His")
                .replace("CAA","Gln").replace("CAG","Gln").replace("AAT","Asn")
                .replace("AAC","Asn").replace("AAA","Lys").replace("AAG","Lys")
                .replace("GAT","Asp").replace("GAC","Asp").replace("GAA","Glu")
                .replace("GAG","Glu").replace("TGT","Cys").replace("TGC","Cys")
                .replace("TGA","Ter").replace("TGG","Trp").replace("CGT","Arg")
                .replace("CGC","Arg").replace("CGA","Arg").replace("CGG","Arg")
                .replace("AGT","Ser").replace("AGC","Ser").replace("AGA","Arg")
                .replace("AGG","Arg").replace("GGT","Gly").replace("GGC","Gly")
                .replace("GGA","Gly").replace("GGG","Gly");

        return protien;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String inputDna,forwardProtien,singleforwardProtien,reverseProtien,singleReverseProtien;

        System.out.print("Enter the DNA code  :  ");
        inputDna = input.next();
        for(int j=0;j<3;j++)
        {
            StringBuilder forwardDNA = new StringBuilder(inputDna);
            for (int i = j; i < forwardDNA.length(); i += 4)
            {
                forwardDNA.insert(i, ' ');
            }
            System.out.println("---------Frame " + (j + 1) + " -----------");
            System.out.println(forwardDNA);
            forwardDNA=removeUnnecessaryNeclotide(forwardDNA);
            forwardProtien = neucleotideTOProtien(forwardDNA);
            singleforwardProtien = protienToSingleWordRepresentation(forwardProtien);
            System.out.println("Protien is " + forwardProtien);
            System.out.println(singleforwardProtien);
        }

        for(int j=0;j<3;j++)
        {
            StringBuilder reverseDNA = new StringBuilder(inputDna);
            for (int i=0 ;i<reverseDNA.length();i++)
            {
                if(reverseDNA.charAt(i)=='T') {reverseDNA.setCharAt(i,'A');continue;}
                else if(reverseDNA.charAt(i)=='A') {reverseDNA.setCharAt(i,'T');continue;}
                else if(reverseDNA.charAt(i)=='G') {reverseDNA.setCharAt(i,'C');continue;}
                else if(reverseDNA.charAt(i)=='C') {reverseDNA.setCharAt(i,'G');}

            }
            reverseDNA=reverseDNA.reverse();
            for (int i = j; i < reverseDNA.length(); i += 4)
            {
                reverseDNA.insert(i, ' ');
            }
            System.out.println("---------Frame " + (j + 4) + " -----------");
            System.out.println(reverseDNA);
            reverseDNA=removeUnnecessaryNeclotide(reverseDNA);
            reverseProtien = neucleotideTOProtien(reverseDNA);
            singleReverseProtien = protienToSingleWordRepresentation(reverseProtien);
            System.out.println("Protien is " + reverseProtien);
            System.out.println(singleReverseProtien);
        }
    }
}