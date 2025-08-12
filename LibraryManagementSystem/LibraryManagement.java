package nit.collections_framework;

import java.util.Scanner;
import java.util.Vector;

public class LibraryManagement 
{
	public static void main(String[] args) 
	{
		Vector<Book> book= new Vector<>();
		book.add(new Book(101, "Core Java", "Mr James"));
		book.add(new Book(102, "Adv Java", "Mr Robert"));
		book.add(new Book(103, "Head First Java", "Miss Kathy Sierra"));
		book.add(new Book(104, "Programming in C", "Mr Denis"));	
		System.out.println("Select from the Menu :\r\n"
				+ "	 1) Display Books Available in the Library :\r\n"
				+ "	 2) Search a Book in the Library :\r\n"
				+ "	 3) Issue a Book from the Library :\r\n"
				+ "	 4) Exit from the application :\r\n"
				+ "");
		System.out.print("Please Enter your Choice :");
		Scanner sc = new Scanner(System.in);
		int choice= Integer.parseInt(sc.nextLine());
		Library lib = new Library();
		switch(choice)
		{
		case 1:
			lib.displayAvailableBooks(book);
			break;
		case 2:
			lib.searchBook(book, sc);
			break;
		case 3:
			lib.issueBook(book, sc);
			break;
		case 4:
			System.out.println("Thank you for Visiting..");
			break;
		default:
			System.out.println("Invalid Choice !!");
		}
			
	}
     
}
