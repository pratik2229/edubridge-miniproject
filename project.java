//*****************************LIBRARY MANAGEMENT****************************8


package miniproject;
import java.util.Scanner;
public class project
{
    public static void main(String args[]) {
        char r;
        do {
            System.out.println("*************LIBRARY MANAGEMENT SYSTEM************");
            System.out.println("Prss 1 to add Book");
            System.out.println("Prss 2 to issue a Book");
            System.out.println("Prss 3 to return Book");
            System.out.println("Prss 4 to see complete issue details");
            System.out.println("Prss 5 to exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any number");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    Library a = new Library();
                    a.add();
                    break;
                case 2:
                    Library b = new Library();
                    b.issue();
                    break;
                case 3:
                    Library c = new Library();
                    c.returnbook();
                    break;
                case 4:
                    Library d = new Library();
                    d.details();
                    break;
                case 5:
                    Library e = new Library();
                    e.exit();
                    break;
                default:
                    System.out.println("Invalid Number");
            }
            System.out.println("Do you want to select another option y/n");
            r = scanner.next().charAt(0);
        }   while (r == 'y' || r == 'Y');
            if (r == 'n' || r == 'N')
            {
                Library l = new Library();
                l.exit();
            }

    }
}
class Library {
    static String str1, i_date, rdate;
    static int bookId, book_issued;

    void add() {                //add method to add books in library
        System.out.println("Enter a book name, prize, and book_no");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int price = sc.nextInt();
        int book_no = sc.nextInt();
        System.out.println("Detail is: " + str  +price  +book_no);
    }

    void issue() {            //issue method to issue books for a coustomer
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Book Name");
        String str1 = sc1.nextLine();
        System.out.println("Book_Id");
        bookId = sc1.nextInt();
        sc1.nextLine();
        System.out.println("Issue Date");
        i_date = sc1.nextLine();
        ;
        System.out.println(" Total book Issued");
        book_issued = sc1.nextInt();
        sc1.nextLine();
        System.out.println("Return Date");
        String rdate = sc1.nextLine();

    }

    int getid() {
        return bookId;
    }

    void returnbook() {                    //returnbook method keep the entries of returned book
        System.out.println("Enter Student name and book id");
        Scanner sc3 = new Scanner(System.in);
        String name = sc3.nextLine();
        int sbook_id = sc3.nextInt();
        if (bookId == sbook_id) {
            System.out.println("Total Details");
            System.out.println("Book Name: " + Library.str1);
            System.out.println("Book_Id: " + Library.bookId);
            System.out.println("Issue Date: " + Library.i_date);
            System.out.println("Total book issued: " + Library.book_issued);
            System.out.println("Return Date : " + Library.rdate);
        } else {
            System.out.println("Please enter correct id");
        }
    }

    void details() {            //details method will print all the details po book
        System.out.println("Book Name: " + Library.str1);
        System.out.println("Book_Id: " + Library.bookId);
        System.out.println("Issue Date: " + Library.i_date);
        System.out.println("Total book issued: " + Library.book_issued);
        System.out.println("Return Date : " + Library.rdate);
    }

    void exit() {
        System.exit(0);
    }

}
