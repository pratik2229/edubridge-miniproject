//*****************************LIBRARY MANAGEMENT****************************8


package miniproject;
import java.util.Scanner;
public class project
{
    public static void main(String args[]) {
        char r;
        do {
            System.out.println("*************LIBRARY MANAGEMENT SYSTEM************");
            System.out.println("Enter 1 to add Book");
            System.out.println("Enter 2 to issue a Book");
            System.out.println("Enter 3 to return Book");
            System.out.println("Enter 4 to see complete issue details");
            System.out.println("Enter 5 to show details of added book");
            System.out.println("Enter 6 to exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any number");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    Library add = new Library();
                    add.add();
                    break;
                case 2:
                    Library issue = new Library();
                    issue.issue();
                    break;
                case 3:
                    Library returnbook = new Library();
                    returnbook.returnbook();
                    break;
                case 4:
                    Library details = new Library();
                    details.details();
                    break;
                case 5:
                    Library show = new Library();
                    show.show();
                    break;
                case 6:
                    Library exit = new Library();
                    exit.exit();
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
            else{
                System.out.println("Enter 'y' for Yes and 'n' for No only");
            }
    }
}
class Library
{                 //clas library contains some method
    static String st_name,ibook,abook,i_date, rdate,author;
    static int bookId, book_issued,price,book_no,total_price;
//try to perform association
    //see at the bottom
    void add()
    {                //add method to add books in library
        System.out.println("Enter a book name,author name,prize and book_no. ");
        Scanner sc = new Scanner(System.in);
        abook = sc.nextLine();
        author = sc.nextLine();
        price = sc.nextInt();
        book_no = sc.nextInt();
        //create a arraylist of library type and add the book into the collection
        //main functionality is missing
        System.out.println("Book added successfully ");
    }

    void issue()
    {            //issue method to keep the entries of issued books to  students
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Student Name");
        st_name = sc1.nextLine();
        System.out.println("Book Name");
        ibook = sc1.nextLine();
        System.out.println("Book_Id");
        bookId = sc1.nextInt();
        sc1.nextLine();
        System.out.println("Author name");
        author = sc1.nextLine();
        System.out.println("Total book Issued");
        book_issued = sc1.nextInt();
        sc1.nextLine();
        System.out.println("Enter price of a book");
        price = sc1.nextInt();
        sc1.nextLine();
        System.out.println("Issue Date");
        i_date = sc1.nextLine();
        System.out.println("Return Date");
        rdate = sc1.nextLine();
 //main functionality is missing
    }

    void returnbook()
    {                    //returnbook method keep the entries of returned book after issued
        System.out.println("Enter Student name and book id");
        Scanner sc3 = new Scanner(System.in);
        //String name = sc3.nextLine();
        int rbook_id = sc3.nextInt();
        if (bookId == rbook_id)
        {
            System.out.println("Total Details");
            System.out.println("Book Name: " + Library.ibook);
            System.out.println("Book_Id: " + Library.bookId);
            System.out.println("Total book issued: " + Library.book_issued);
            System.out.println("Issue Date: " + Library.i_date);
            System.out.println("Return Date : " + Library.rdate);
        }
        else {
            System.out.println("Please enter correct id");
             }
        
         //main functionality is missing
    }

    void details()
    {            //details method will print all the details of issued book

        System.out.println("Details of issued book: ");
        System.out.println("Student name: " + Library.st_name);
        System.out.println("Book Name: " + Library.ibook);
        System.out.println("Book_Id: " + Library.bookId);
        System.out.println("Authoe name: " + Library.author);
        System.out.println("book price: " + Library.price);
        System.out.println("Total book issued: " + Library.book_issued);
        total_price = book_issued * price;
        System.out.println("Total price of issued books: "+Library.total_price);
        System.out.println("Issue Date: " + Library.i_date);
        System.out.println("Return Date : " + Library.rdate);
    }

    public void show()
    {                     //show method will print all the details of the book added in library

        System.out.println("Details of added book: ");
        System.out.println("Detail is: ");
        System.out.println("Book Name = " +Library.abook);
        System.out.println("Author name = " +Library.author);
        System.out.println("price = " +Library.price);
        System.out.println("Book no. = " +Library.book_no);
    }
    void exit()
    {
        System.exit(0);
    }

}
class Book
{
    int bookId;bookPrice;
    String bookName,bookAuthor;
    String issueDate,returnDate;
    int fine;
    String status;//Active, Issued
    Book(int bookId,int bookPrice,String bookName,String bookAuthor)
    {
        this.bookId=bookId;
        this.bookPrice=bookPrice;
        this.bookName=bookName;
        this.bookAuthor=bookAuthor;
    }
}
class Student
{
    int sId;
    String sName;
    LinkedHashSet<Book> bookList;
    
    
}
