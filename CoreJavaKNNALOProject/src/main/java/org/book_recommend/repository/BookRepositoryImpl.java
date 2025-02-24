package org.book_recommend.repository;

import java.sql.*;
import java.sql.Date;
import java.util.*;
import org.book_recommend.config1.DBConfig;
import org.book_recommend.model.BookModel;

public class BookRepositoryImpl extends DBConfig implements BookRepository
{
    List<BookModel> bookList;
	public boolean isAddNewBook(BookModel model)
	{
		try 
		{
		  	stmt=conn.prepareStatement("insert into book values('0',?,?,?,?)");
		  	stmt.setString(1,model.getBname());
		  	stmt.setFloat(2,model.getPrice());
		  	stmt.setDate(3,Date.valueOf(model.getPyear()));
		  	stmt.setString(4,model.getBriefdesc());
		  	int value=stmt.executeUpdate();
		  	if(value>0)
		  	{
		  	   return true;
		  	}
		  	else
		  	{
		  	   return false;
		  	}
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		}
		return false;
	}

	public List<BookModel> getAllBooks()
	{
		try 
		{
		   bookList=new ArrayList<BookModel>();
		   stmt=conn.prepareStatement("select *from book");	
		   rs=stmt.executeQuery();
		   while(rs.next())
		   {
			  BookModel bookModel=new BookModel(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getString(4),rs.getString(5)); 
			  bookList.add(bookModel);
		   }
		   return bookList.size()>0?bookList:null;
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return null;
		}
	}

	@Override
	public BookModel getBookByName(String bookName) {
		// TODO Auto-generated method stub
		try 
		{
			stmt=conn.prepareStatement("select *from book where bname=?");	
			stmt.setString(1, bookName);
			rs=stmt.executeQuery();
			BookModel b=null;
			if(rs.next())
			{
			  b=new BookModel(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getString(4),rs.getString(5));	
			}
			return b;
				
		}
		catch(Exception ex)
		{
		  System.out.println("Error is"+ex);
		  return null;
		}
		
	}

	@Override
	public boolean isUpdateBook(BookModel model,String bookNameForSearch) 
	{
		try
		{
			stmt=conn.prepareStatement("update book set bname=?,price=?,pyear=?,briefdesc=? where bname=?");
			stmt.setString(1,model.getBname());
			stmt.setFloat(2,model.getPrice());
			stmt.setDate(3,Date.valueOf(model.getPyear()));
			stmt.setString(4,model.getBriefdesc());
			stmt.setString(5, bookNameForSearch);
			int value=stmt.executeUpdate();
		  	if(value>0)
		  	{
		  	   return true;
		  	}
		  	else
		  	{
		  	   return false;
		  	}
		}
		catch(Exception ex)
		{
		  System.out.println("Error is"+ex);
		  return false;
		}
	}

}
