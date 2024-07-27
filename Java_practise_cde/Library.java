package com.shaheer;
import java.util.Scanner;
    class LibraryCLass {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        String[] availableBook = new String[90];
        String[] issueBook = new String[90];
        String [] temp = new String[90];
        static int avbook = 7;
        static int issbook = 0;
        char ch;

        public LibraryCLass() {
            availableBook[0] = "c language";
            availableBook[1] = "c++ language";
            availableBook[2] = "java language";
            availableBook[3] = "python language";
            availableBook[4] = "html language";
            availableBook[5] = "css language";
            availableBook[6] = "react language";
        }

        public void addBook() {
            System.out.println("Enter the name of the book");
            String bookName = inputString.nextLine();
            this.availableBook[avbook] = bookName;
            avbook++;
            System.out.println("Book added successfully...........");
            System.out.println("Press y to add book again.");
            ch = inputString.nextLine().charAt(0);
            if (ch == 'y' || ch == 'Y')
            {
                addBook();
            }
        }

        public void availableBook() {
            int i = 1;
            System.out.println("......Available Books are......");
            for (String element : this.availableBook) {
                if(element==null){
                    break;
                }
                System.out.print(i + " " + element + ",   ");
                i++;
            }
            System.out.println();
        }

        public void issueBook() {
            availableBook();
            System.out.println("Press no of book you want to Issue.");
            int var = input.nextInt();
            this.issueBook[issbook] = this.availableBook[var - 1];
            issbook++;
            System.out.println("Book issued successfully...........");
            System.out.println("Press y to issue book again.");
            ch = inputString.nextLine().charAt(0);
            if (ch == 'y' || ch == 'Y')
            {
                issueBook();
            }
        }

        public void printIssueBook() {
            System.out.println(".......Issue Books are.......");
            int i = 1;
            for (String element : this.issueBook) {

                if(element==null){
                    break;
                }
                System.out.print(i + " " + element + ",  ");
                i++;
            }
            System.out.println();
        }

        public void removeAvailable() {
            availableBook();
            System.out.println("Press no of book you want to remove.");
            int variable = input.nextInt();
            this.availableBook[variable -1] = null;
            System.out.println("Book removed successfully...........");
            arrayChange(this.availableBook);
            System.out.println("Press y to remove book again.");
            ch = inputString.nextLine().charAt(0);
            if (ch == 'y' || ch == 'Y')
            {
                removeAvailable();
            }
        }
        public void returnBook() {
            printIssueBook();
            System.out.println("Press no of book you want to return.");
            int variable = input.nextInt();
            this.issueBook[(variable) - 1] = null;
            System.out.println("Book removed successfully...........");
            arrayChange(this.issueBook);
            System.out.println("Press y to remove book again.");
            ch = inputString.nextLine().charAt(0);
            if (ch == 'y' || ch == 'Y')
            {
                returnBook();
            }
        }

        public void arrayChange(String [] aray){
            for(int i=0,j=0;(i<temp.length)&&(j<aray.length);j++){
                if(aray[j]==null){
                    continue;
                }
                temp[i]=aray[j];
                i++;
            }
            for(int i=0;i<temp.length;i++){
                aray[i]=temp[i];
            }
        }

    }

public class Library {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            Scanner inputString = new Scanner(System.in);
            LibraryCLass person = new LibraryCLass();
            System.out.println("Hello welcome to Shaheer library.Press your choice\n" +
                    "1.Show Available Books\n" +
                    "2.Add Book\n" +
                    "3.Remove Any Available Book\n"+
                    "4.Issue Book\n" +
                    "5.Show Issued Book \n"+
                    "6.Return Book\n");
            int choice = input.nextInt();
            while(choice!=5){
                switch(choice) {
                    case 1:
                        person.availableBook();
                        break;
                    case 2:
                        person.addBook();
                        break;
                    case 3:
                        person.removeAvailable();
                        break;
                    case 4:
                        person.issueBook();
                        break;
                    case 5:
                        break;
                    case 6:
                        person.returnBook();
                        break;
                }
                System.out.println("Hello welcome to Shaheer library.Press your choice\n" +
                        "1.Show Available Books\n" +
                        "2.Add Book\n" +
                        "3.Remove Any Available Book\n"+
                        "4.Issue Book\n" +
                        "5.Show Issued Book \n"+
                        "6.Return Book\n");
                choice = input.nextInt();
            }
            System.out.println("Thank u for purchasing our books");
            person.printIssueBook();;
        }
    }
