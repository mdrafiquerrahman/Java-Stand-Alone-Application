package nit.collections_framework;
import java.util.*;
public class Library 
{
public void displayAvailableBooks(Vector<Book> books)
{
	books.forEach(b->System.out.println(b));
}
public void issueBook(Vector<Book> books, Scanner sc)
{
	System.out.print("Enter keyword to search by title or author:");
	int id=Integer.parseInt(sc.nextLine());
	boolean isfound=false;
	for(Book book:books)
	{
		if(book.id()==id)
		{
			System.out.println(book);
			isfound=true;
		}
	}
	if(!isfound)
	{
		System.out.println("Book with ID "+id+" not found.");
	}
}
public void searchBook(Vector<Book> books, Scanner sc)
{
	System.out.print("Enter keyword to search by title or author:");
	String name=sc.nextLine();
	boolean isfound=false;
	for(Book book:books)
	{
		if(book.title().equalsIgnoreCase(name)||book.author().equalsIgnoreCase(name))
		{
			System.out.println(book);
			isfound=true;
		}
	}
	if(!isfound)
	{
		System.out.println("No matching books found.");
	}
}
}
