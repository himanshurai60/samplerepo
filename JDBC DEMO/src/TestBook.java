import java.util.Scanner;

import com.beans.Book;
import com.dao.BookDAO;

public class TestBook {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		BookDAO bb=new BookDAOImpl();
		Book book=new Book("123","qwqwe","qdasd","dffdf");
		Scanner s=new Scanner(System.in);
		
		do {
			System.out.println("1. add book\n2.update book\n3.display all book\n4.find books by name\n5.find books by author name\n6.find book by ISBN\nenter your choice:");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
			book=getBook();
			boolean r=bb.addBook(book);
			if(r)
				System.out.println("inserted successfully");
			else
				System.out.println("sorry");
			break;
			
		case 2:
			book=getBook();
			System.out.println("enter isbn to change:");
			
			
		}
		
		}while(true);
		
	}
	
	public Book getBook()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter isbn:");
		String isbn=s.next();
		System.out.println("enter name:");
		String name=s.next();
		System.out.println("enter publication:");
		String publication=s.next();
		System.out.println("enter author:");
		String author=s.next();
		Book book=new Book(isbn,name,publication,author);
		return book;
	}

}
