import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.beans.Book;
import com.connections.MyConnection;
import com.dao.BookDAO;
import com.pojo.Employee;

public class BookDAOImpl implements BookDAO {

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		String INSERT_BOOK="insert into Book values(?,?,?,?)";
		boolean r=false;;
		try {
			PreparedStatement ps=MyConnection.getMyConnection().prepareStatement(INSERT_BOOK);
			ps.setString(1, book.getIsbn());
			ps.setString(2, book.getName());
			ps.setString(3, book.getPublication());
			ps.setString(4, book.getAuthor());
			r=ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}

	@Override
	public int updateBook(Book book, String ISBN) {
		// TODO Auto-generated method stub
		int row=0;
		String UPDATE_BOOK="update Book set name=?, publication=?, author=? where isbn=?";
		try {
			PreparedStatement ps=MyConnection.getMyConnection().prepareStatement(UPDATE_BOOK);
			ps.setString(4, ISBN);
			ps.setString(1, book.getName());
			ps.setString(2, book.getPublication());
			ps.setString(3, book.getAuthor());
			row=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row;
	}

	@Override
	public int deleteBook(String ISBN) {
		// TODO Auto-generated method stub
		int row=0;
		String DELETE_BOOK="delete from Book where isbn=?";
		try {
			PreparedStatement ps=MyConnection.getMyConnection().prepareStatement(DELETE_BOOK);
			ps.setString(1, ISBN);
			row=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row;		
	}

	@Override
	public Book findBookByISBN(String ISBN) {
		// TODO Auto-generated method stub
		Book book=new Book();
		String Find_By_ISBN="select *from BOOK where isbn=?";
		try {
			PreparedStatement ps=MyConnection.getMyConnection().prepareStatement(Find_By_ISBN);
			ps.setString(1, ISBN);
			ResultSet set=ps.executeQuery();
			while(set.next())
			{
				book=new Book(set.getString("isbn"),set.getString("name"),set.getString("publication"),set.getString("author"));
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;		
	}

	@Override
	public List<Book> findBooksByName(String name) {
		// TODO Auto-generated method stub
		List<Book> books=new ArrayList<>();
		Connection con=MyConnection.getMyConnection();
String FIND_BOOKS_NAME="select * from Book where name=?";
		
		try {
			PreparedStatement ps=MyConnection.getMyConnection().prepareStatement(FIND_BOOKS_NAME);
			ps.setString(1,name);
			ResultSet set=ps.executeQuery();
			Book book;
			while(set.next())
			{
			String isbn=set.getString(1);
			name=set.getString(2);
			String publication=set.getString(3);
			String author=set.getString(4);
			book=new Book(isbn,name,publication,author);
			books.add(book);
			}
		}
	 catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return books;
	}

	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books=new ArrayList<>();
		Connection con=MyConnection.getMyConnection();
String FIND_ALL_BOOKS="select * from Book";
		
		Statement st;
		try {
			st = con.createStatement();
			ResultSet set=st.executeQuery(FIND_ALL_BOOKS);
			while(set.next())
			{
			String isbn=set.getString(1);
			String name=set.getString(2);
			String publication=set.getString(3);
			String author=set.getString(4);
			Book book=new Book(isbn,name,publication,author);
			books.add(book);
			}
		}
	 catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return books;


	}

	@Override
	public List<Book> findBooksByAuthor(String auth_name) {
		// TODO Auto-generated method stub
		List<Book> books=new ArrayList<>();
		Connection con=MyConnection.getMyConnection();
String FIND_BOOKS_AUTHOR="select * from Book where author=?";
		
		try {
			PreparedStatement ps=MyConnection.getMyConnection().prepareStatement(FIND_BOOKS_AUTHOR);
			ps.setString(1, auth_name);
			ResultSet set=ps.executeQuery();
			Book book;
			while(set.next())
			{
			String isbn=set.getString(1);
			String name=set.getString(2);
			String publication=set.getString(3);
			String author=set.getString(4);
			book=new Book(isbn,name,publication,author);
			books.add(book);
			}
		}
	 catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return books;

	}

}
