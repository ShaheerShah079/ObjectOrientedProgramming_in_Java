
package library;
import java.util.Scanner;
public class Library {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
         Scanner in2 = new Scanner(System.in);
        Book obj=new Book();
 while(true){        
        System.out.println("1.Adding Book\n2.Loan Book\n3.Retrieve Book\n4.Check Copy\n5.Display book information in laibrary\n6.Exit");
        int choice =in.nextInt();
 
        switch(choice)
        {
            case 1:
                System.out.print("Amount of books You added : ");
                int amounts =in.nextInt();
                for(int i=1;i<=amounts;i++) {
                       in=new Scanner(System.in);
                       obj.values++;
                    System.out.print("Book Title : ");
                    obj.bTitle[obj.values] = in.nextLine();
                    System.out.print("Author Name : ");
                    obj.authors[obj.values] = in.nextLine();
                    System.out.print("Book Type : ");
                    obj.bType[obj.values] = in.nextLine();
                    System.out.print("Published Year : ");
                    obj.p_year[obj.values] = in.nextInt();
                    System.out.print("Copies : ");
                    obj.copy[obj.values] = in.nextInt();

                    

                    System.out.println("Book "+i+" Added Succesfully");
                }
            break;
            case 2:
                 in=new Scanner(System.in);
                System.out.print("Book Title : ");
                String titleLoan=in.nextLine();
                obj.loanBook(titleLoan);

                break;
            case 3:
                 in=new Scanner(System.in);
                System.out.print("Book Title : ");
                String titleRetreive=in.nextLine();
                obj.retBook(titleRetreive);

                break;
            case 4:
                 in=new Scanner(System.in);
                System.out.print("Book Title : ");
                String titleCopy=in.nextLine();
                System.out.println(titleCopy);
                obj.checkCopy(titleCopy);

                break;
            case 5:
             obj.displayInfo();
                break;
            case 6:
                System.exit(0);

                break;
                
        }
        System.out.println("\n\n");
  }


    }

}
class Book {
    String[] bTitle = new String[100];
    String[] authors = new String[100];
    String[] bType = new String[100];
    int[] p_year = new int[100];
    int[] copy = new int[100];
    int values = -1;

    void loanBook(String title) {
        for (int i = 0; i <=values; i++) {
            if (bTitle[i].equals(title)) {
                if (copy[i] != 0) {
                    copy[i]--;
                    System.out.println("Thank you Come Again");
                }
            }
        }
    }

    void retBook(String title) {
        for (int i = 0; i <=values; i++) {
            if (bTitle[i].equals(title)) {
                copy[i]++;
                System.out.println("Thank u for Returning");
            }
        }
    }

    void checkCopy(String title) {
        for (int i = 0; i <=values; i++) {
            if (bTitle[i].equals(title)) {
                System.out.println("Number of copies of " + title + " is " + copy[i]);
            }
        }

    }

    void displayInfo() {
        System.out.println("S.  BOOK TITLE     AUTHORS     COPIES");
        for (int i = 0; i <=values; i++) {
            System.out.println((i+1)+"   "+bTitle[i]+"   "+authors[i]+"    "+copy[i]);
        }
    }
}
